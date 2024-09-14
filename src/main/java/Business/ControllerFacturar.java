package Business;

import Business.LogicVBuscar;
import Data.ArchivosXML;
import Data.ListaClientes;
import Data.ListaProductos;
//import Data.LogicProductoXML;
import Data.MiniSuper;
import Domain.Cajero;
import Domain.Cliente;
import Domain.DetalleVenta;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import Presentation.VentanaCantidad;
import Presentation.VentanaCobrar;
import jakarta.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerFacturar {
    private GUIFacturar gFacturar;
    private MiniSuper mercadito;
    private VentanaCobrar vCobrar;
    private VentanaBuscar vBuscar;
    private VentanaCantidad vCantidad;
    private int cant;
    private Producto producto;
    private ControllerProductos controllerProductos;
    private List<Producto> listaProductos = new ArrayList<>();

    public ControllerFacturar(GUIFacturar gFacturar, ControllerProductos controllerProductos) throws JAXBException {
        this.gFacturar = gFacturar;
        this.vCobrar = new VentanaCobrar();
        this.vCantidad = new VentanaCantidad();
        this.producto = new Producto();
        LogicVBuscar ventBuscar = new LogicVBuscar();
        this.vBuscar = ventBuscar.getvBuscar();
        this.mercadito = new MiniSuper();
        cant = 0;
        this.controllerProductos = controllerProductos;

    }

    public void cargarClientesEnGUI() {
        List<Cliente> listaClientes = mercadito.getListaClientes();
        gFacturar.cargarClientes(listaClientes);
    }

    ;

    public void cargarCajerosEnGUI() {
        List<Cajero> listaCajeros = mercadito.getListaCajeros();
        gFacturar.cargarCajeros(listaCajeros);
    }

    ;

    public void getControllerFacturar() {
        //--------------------Buscar---------------------------------------------
        gFacturar.addBuscarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vBuscar.setVisible(true);
                vBuscar.setLocationRelativeTo(null);
            }
        });


        //Buscar cancelar
        vBuscar.addCancelBtn(new ActionListener() {//me devuelvo
            @Override
            public void actionPerformed(ActionEvent e) {
                vBuscar.dispose();
            }
        });

        vBuscar.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descripcionBuscar = vBuscar.getDescripcionTf();
                if (descripcionBuscar.isEmpty()) {
                    vBuscar.notify("Ingrese una descripcion");
                    return;
                }
                producto = mercadito.buscarProducto_Descrip(descripcionBuscar);

                if (producto != null) {
                    gFacturar.notify(producto.toString());
                    vBuscar.setDescripcionTf("");
                    gFacturar.setCodigoProducto(producto.getDescripcion());
                    vBuscar.dispose();
                    return;
                }
            }
        });

        //Cobrar
        gFacturar.addCobrarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = calcularTotal();
                vCobrar.setTotal(total); // Actualizar el total en la ventana
                vCobrar.setVisible(true);
                vCobrar.setLocationRelativeTo(null);
            }
        });

        vCobrar.addCancel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vCobrar.dispose();
            }
        });

        vCobrar.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
//----------------------------AGREGAR-------------------------------------------
        gFacturar.addAgregarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Producto> listaProductos = controllerProductos.getListaProductos();
                String descripcionProductoBuscado = vBuscar.getDescripcionTf().trim();
                Producto productoEncontrado = null;  // Declarar fuera del bucle
                for (Producto p : listaProductos) {
                    //cant no toma el valor ingresado por el user
                    if (cant >= 0 && p.getDescripcion() != null && !p.getDescripcion().isEmpty()) {
                        // Comparar la descripción buscada con la descripción del producto
                        if (p.getDescripcion().trim().equalsIgnoreCase(mercadito.buscarProducto_Descrip(p.getDescripcion().trim()).getDescripcion().trim())) {
                            productoEncontrado = p;
                            break;  // Salir del bucle una vez encontrado el producto
                        }
                    }
                }

                // Ahora puedes usar productoEncontrado aquí
                if (productoEncontrado != null) {
                    JComboBox<Cliente> comboClientes = gFacturar.getCBClientes();
                    Cliente clienteSeleccionado = (Cliente) comboClientes.getSelectedItem();

                    if (clienteSeleccionado != null) {
                        float descuentoCliente = clienteSeleccionado.getDescuento();
                        productoEncontrado.setDescuento(descuentoCliente);
                    }

                    controllerProductos.agregarProducto(new DetalleVenta(cant, productoEncontrado));
                } else {
                    gFacturar.notify("El producto con la descripción proporcionada no existe en la lista de productos.");
                }
            }
        });


        gFacturar.addCantidadBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vCantidad.setVisible(true);
                vCantidad.setLocationRelativeTo(null);
            }

        });
//-----------Actualiza Existencias------
        vCantidad.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!vCantidad.getIngCantidad().isEmpty()) {
                    try {
                        int cantidad = Integer.parseInt(vCantidad.getIngCantidad());
                        List<Producto> listaProductos = controllerProductos.getListaProductos();

                        System.out.println("Cantidad ingresada: " + cantidad);

                        String descripcionProductoBuscado = vBuscar.getDescripcionTf();
                        producto = mercadito.buscarProducto_Descrip(descripcionProductoBuscado);
                        Producto productoEncontrado = null;
                        for (Producto p : listaProductos) {
                            if (p.getDescripcion().trim().equalsIgnoreCase(mercadito.buscarProducto_Descrip(p.getDescripcion().trim()).getDescripcion().trim())) {
                                productoEncontrado = p;
                                break;
                            }
                        }

                        if (productoEncontrado != null) {
                            System.out.println("Existencia del producto: " + productoEncontrado.getExistencia());

                            if (cantidad > 0) {
                                if (cantidad <= productoEncontrado.getExistencia()) {
                                    controllerProductos.actualizarProductoCantidad(productoEncontrado, cantidad);
                                    vCantidad.setIngCantidad("");
                                    vCantidad.dispose();
                                } else {
                                    vCantidad.notify("La cantidad sobrepasa la existencia del producto");
                                }
                            } else {
                                vCantidad.notify("La cantidad debe ser mayor a 0");
                            }
                        } else {
                            vCantidad.notify("Producto no encontrado en la lista");
                        }

                    } catch (NumberFormatException ex) {
                        vCantidad.notify("Cantidad ingresada no es válida");
                    }
                } else {
                    vCantidad.notify("Debe ingresar una cantidad");
                }
            }
        });


        vCantidad.addCancelBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vCantidad.dispose();
            }
        });

        vCantidad.addCancelBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vCantidad.dispose();
            }

        });

        //-------------Eliminar--------------
        gFacturar.addEliminarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable tablaProductos = gFacturar.getTableClientes();
                int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();

                if (productoSeleccionado < 0) {
                    gFacturar.notify("Seleccione el producto que desea eliminar");
                } else {
                    JTable tablaArticulos = gFacturar.getTablaArticulos();
                    DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
                    model.removeRow(productoSeleccionado);
                }
            }
        });

        gFacturar.addCancelarBtm(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.notify("Gracias por usar nuestro sistema");
                gFacturar.dispose();
            }

        });
        //-------------Descuento--------------
        gFacturar.addDescuentoBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();
                if (productoSeleccionado < 0) {
                    gFacturar.notify("Seleccione un producto al cual aplicar el descuento.");
                } else {
                    String descuentoStr = gFacturar.getDescClienteTf();
                    if (!descuentoStr.isEmpty()) {
                        try {
                            float descuentoManual = Float.parseFloat(descuentoStr);
                            if (descuentoManual >= 0 && descuentoManual <= 100) {
                                producto.setDescuento(descuentoManual);
                                gFacturar.notify("Descuento aplicado correctamente.");
                            } else {
                                gFacturar.notify("El descuento debe estar entre 0 y 100.");
                            }
                        } catch (NumberFormatException ex) {
                            gFacturar.notify("Ingrese un número válido para el descuento.");
                        }
                    } else {
                        gFacturar.notify("El campo de descuento no puede estar vacío.");
                    }
                }
            }
        });

        //--------Cobrar------
        vCobrar.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = calcularTotal();
                String montoPagoStr = "";

                if (!vCobrar.getCheque().isEmpty()) {
                    montoPagoStr = vCobrar.getCheque();
                } else if (!vCobrar.getEfectivo().isEmpty()) {
                    montoPagoStr = vCobrar.getEfectivo();
                } else if (!vCobrar.getSINPE().isEmpty()) {
                    montoPagoStr = vCobrar.getSINPE();
                }else if (!vCobrar.getTarjeta().isEmpty()) {
                    montoPagoStr = vCobrar.getTarjeta();
                }

                if (!montoPagoStr.isEmpty()) {
                    try {
                        double montoPago = Double.parseDouble(montoPagoStr);

                        if (montoPago >= total) {
                            double cambio = montoPago - total;
                            gFacturar.notify("Pago procesado. Su cambio es: " + cambio);
                            vCobrar.dispose();
                        } else {
                            gFacturar.notify("El monto ingresado es insuficiente para completar el pago.");
                        }
                    } catch (NumberFormatException ex) {
                        gFacturar.notify("Monto ingresado no es válido. Por favor ingrese un número válido.");
                    }
                } else {
                    gFacturar.notify("Debe ingresar un monto en alguna de las formas de pago.");
                }
            }
        });

    }
        public double calcularTotal() {
            JTable tablaArticulos = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
            double total = 0;

            for (int i = 0; i < model.getRowCount(); i++) {
                Object cantidadObj = model.getValueAt(i, 3);
                Object precioObj = model.getValueAt(i, 4);
                Object descuentoObj = model.getValueAt(i, 5);

                double cantidad = (cantidadObj instanceof Number) ? ((Number) cantidadObj).doubleValue() : 0.0;
                double precio = (precioObj instanceof Number) ? ((Number) precioObj).doubleValue() : 0.0;
                double descuento = (descuentoObj instanceof Number) ? ((Number) descuentoObj).doubleValue() : 0.0;

                double precioConDescuento = precio * (1 - descuento / 100);
                total += cantidad * precioConDescuento;
            }
            return total;
        }

        //-----------Historico-----------

    }
   
    
    
    
   
