package Business;

import Business.LogicBuscar;
import Data.ArchivosXML;
import Data.ListaClientes;
import Data.ListaProductos;
//import Data.LogicProductoXML;
import Data.MiniSuper;
import Domain.Cajero;
import Domain.Cheque;
import Domain.Cliente;
import Domain.DetalleVenta;
import Domain.Efectivo;
import Domain.Factura;
import Domain.MetodoPago;
import Domain.Producto;
import Domain.Sinpe;
import Domain.Tarjeta;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import Presentation.VentanaCantidad;
import Presentation.VentanaCobrar;
import Presentation.VentanaDescuento;
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
    //Ventanas
    private GUIFacturar gFacturar;
    private VentanaCobrar vCobrar;
    private VentanaBuscar vBuscar;
    private VentanaCantidad vCantidad;
    private VentanaDescuento vDescuento;
    //Intermediarios
    private MiniSuper mercadito;
    private int cant;
    private Factura factura;
    private List<DetalleVenta> detalles;
    private List<MetodoPago> pagos;
    private Producto producto;
    private List<Producto> listaProductos = new ArrayList<>();
    private List<Factura> listaFacturas;
    private ControllerProductos controllerProductos;
    private ControllerHistorico controllerHistorico;

    public ControllerFacturar(GUIFacturar gFacturar, ControllerProductos controllerProductos, MiniSuper m) throws JAXBException {
        
        this.gFacturar = gFacturar;
        this.vCobrar = new VentanaCobrar();
        this.vCantidad = new VentanaCantidad();
        this.controllerProductos = controllerProductos;
        this.controllerHistorico = new ControllerHistorico(gFacturar, m);

        LogicBuscar ventBuscar = controllerProductos.getLogvBuscar();
        this.vBuscar = ventBuscar.getvBuscar();
        this.vDescuento = new VentanaDescuento();
        
        this.mercadito = m;
        cant = 0;
        this.factura = new Factura();
        this.producto = new Producto();
        this.detalles = new ArrayList<>();
        this.pagos = new ArrayList<>();
        this.listaFacturas = m.getListaFacturas();

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
       
        //--------------------BUSCAR---------------------------------------------
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
                
                producto = mercadito.buscarProducto(descripcionBuscar);
               
                if (producto != null) {
                    gFacturar.notify("Producto encontrado \n Existencia: " + producto.getExistencia());
                    vBuscar.setDescripcionTf("");
                    gFacturar.setCodigoProducto(producto.getDescripcion());
                    vBuscar.dispose();
                    return;
                }
                else
                    gFacturar.notify("No se encontro el producto");
            }
        });

        
//----------------------------AGREGAR-------------------------------------------
        gFacturar.addAgregarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //List<Producto> listaProductos = controllerProductos.getListaProductos();
                String descripcionProductoBuscado = gFacturar.getCodigoProducto();
                Producto productoEncontrado = mercadito.buscarProducto(descripcionProductoBuscado);  // Declarar fuera del bucle
                
                if(controllerProductos.productoComprado(descripcionProductoBuscado))
                    gFacturar.notify("El producto ya se encuentra en la lista de compras");
                else{
                
                    // Ahora puedes usar productoEncontrado aquí
                    if (productoEncontrado != null) {
                        JComboBox<Cliente> comboClientes = gFacturar.getCBClientes();
                        Cliente clienteSeleccionado = (Cliente) comboClientes.getSelectedItem();
                        
                    if (clienteSeleccionado != null && producto.getDescuento() == 0) {
                        float descuentoCliente = clienteSeleccionado.getDescuento();
                        productoEncontrado.setDescuento(descuentoCliente);
                    }
                        
                        if(cant <= 0)
                        gFacturar.notify("Ingrese la cantidad...");
                         else{

                        controllerProductos.agregarProducto(new DetalleVenta(cant, productoEncontrado));
                        if(detalles.isEmpty() || detalles == null)
                            detalles = new ArrayList<>();
                        detalles.add(new DetalleVenta(cant, productoEncontrado));
                        if (factura == null)
                            factura = new Factura();
                        factura.setDetalles(detalles);
                        setearTotales();
                        
                        gFacturar.setCodigoProducto("");
                        cant = 0;
                        }
                    
                    } else {
                        gFacturar.notify("El producto con la descripción proporcionada no existe en la lista de productos.");
                    }
                }
            }
        });


        gFacturar.addCantidadBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();
                 producto = mercadito.buscarProducto(gFacturar.getCodigoProducto());
                if (productoSeleccionado < 0 && producto == null) {
                    gFacturar.notify("Seleccione un producto.");
                } 
                else{
                vCantidad.setVisible(true);
                vCantidad.setLocationRelativeTo(null);
                }
            }

        });
//-----------Actualiza Existencias------
        vCantidad.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!vCantidad.getIngCantidad().isEmpty()) {
                    try {
                        int fl = -1;
                        fl = gFacturar.getTablaArticulos().getSelectedRow();
                        if (producto == null)
                        producto = obtenerProducto_Fila(fl);
                        
                        cant = Integer.parseInt(vCantidad.getIngCantidad());
                        //List<Producto> listaProductos = controllerProductos.getListaProductos();
                         if(fl >= 0){
                            for(DetalleVenta deta : detalles){
                                if (deta.getProducto().getCodigo().equals(producto.getCodigo())){
                                    deta.setCantidad(cant);
                                    controllerProductos.cambiarValores(fl, new DetalleVenta(deta.getCantidad(), producto));
                                    break;
                                }
                            }
                            setearTotales();
                         }
                        System.out.println("Cantidad ingresada: " + cant);

                        Producto productoEncontrado = producto;
                        

                        if (productoEncontrado != null) {
                            System.out.println("Existencia del producto: " + productoEncontrado.getExistencia());

                            if (cant > 0) {
                                if (cant <= productoEncontrado.getExistencia()) {
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


        //-------------ELIMINAR--------------
        gFacturar.addEliminarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable tablaProductos = gFacturar.getTableClientes();
                int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();
               
                if (productoSeleccionado < 0) {
                    gFacturar.notify("Seleccione el producto que desea eliminar");
                } else {
                    producto = obtenerProducto_Fila(productoSeleccionado);
                    for (DetalleVenta d: detalles)
                        if(d.getProducto().getCodigo().equals(producto.getCodigo())){
                            detalles.remove(d);
                            break;
                        }
                    setearTotales(); 
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
//------------------------------DESCUENTO---------------------------------------------
        gFacturar.addDescuentoBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();
             producto = mercadito.buscarProducto(gFacturar.getCodigoProducto());
                if (productoSeleccionado < 0 && producto == null) {
                    gFacturar.notify("Seleccione un producto al cual aplicar el descuento.");
                } 
                 else{
                vDescuento.setVisible(true);
                vDescuento.setLocationRelativeTo(null);
                }
            }
         });
        
        
         vDescuento.addOkBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String descuentoStr = vDescuento.getDescuentoTf();
            if (!descuentoStr.isEmpty()) {
                try {
                    int fl = -1;
                    fl = gFacturar.getTablaArticulos().getSelectedRow();
                    if (producto == null)
                    producto = obtenerProducto_Fila(fl);
                    
                    float descuentoManual = Float.parseFloat(descuentoStr);
                        if (descuentoManual >= 0 && descuentoManual <= 100) {
                            if (descuentoManual > 1)
                            descuentoManual/=100;

                            producto.setDescuento(descuentoManual);
                            if(fl >= 0){
                            for(DetalleVenta deta : detalles){
                                if (deta.getProducto().getCodigo().equals(producto.getCodigo())){
                                    deta.getProducto().setDescuento(descuentoManual);
                                    controllerProductos.cambiarValores(fl, new DetalleVenta(deta.getCantidad(), producto));
                                    break;
                                }
                            }
                            setearTotales();
                            }
                            
                            gFacturar.notify("Descuento aplicado correctamente.");
                            vDescuento.setDescuentoTf("");
                            vDescuento.dispose();
                            } else {
                                gFacturar.notify("El descuento debe estar entre 0 y 100.");
                            }
                        } catch (NumberFormatException ex) {
                            gFacturar.notify("Ingrese un número válido para el descuento.");
                        }
                    }
            }
         });
                
            
            vDescuento.addCancelBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vDescuento.dispose();
            }
        });

        //------------------------------COBRAR----------------------------------------------------
         //Cobrar
        gFacturar.addCobrarBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!detalles.isEmpty()){
                    vCobrar.setTotal(gFacturar.getTotalTotal()); // Actualizar el total en la ventana
                    vCobrar.setVisible(true);
                    vCobrar.setLocationRelativeTo(null);
                }
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
                double total = factura.montoTotal();
                float dinerito = 0.0f;
                String montoPagoStr = "";
                MetodoPago pagar = null;
                
                if (pagos == null)
                    pagos = new ArrayList<>();
                if (!vCobrar.getCheque().isEmpty()) {
                    montoPagoStr = vCobrar.getCheque();
                    dinerito = Float.parseFloat(montoPagoStr);
                    pagar = new Cheque(dinerito);
                    pagos.add(pagar);
                } 
                if (!vCobrar.getEfectivo().isEmpty()) {
                    montoPagoStr = vCobrar.getEfectivo();
                    dinerito = Float.parseFloat(montoPagoStr);
                    pagar = new Efectivo(Float.parseFloat(vCobrar.getTotal_txt()),dinerito);
                    pagos.add(pagar);
                } 
                if (!vCobrar.getSINPE().isEmpty()) {
                    montoPagoStr = vCobrar.getSINPE();
                    dinerito = Float.parseFloat(montoPagoStr);
                    pagar = new Sinpe(dinerito);
                    pagos.add(pagar);
                }
                if (!vCobrar.getTarjeta().isEmpty()) {
                    montoPagoStr = vCobrar.getTarjeta();
                    dinerito = Float.parseFloat(montoPagoStr);
                    pagar = new Tarjeta(dinerito);
                    pagos.add(pagar);
                }

                if (!montoPagoStr.isEmpty()) {
                    try {
                        
                        double montoPago = 0;
                        for(MetodoPago p: pagos)
                            montoPago += p.getMonto();

                        if (montoPago >= total) {
                            double cambio = montoPago - total;
                            gFacturar.notify("Pago procesado. Su cambio es: " + cambio);
                            Cliente cl = gFacturar.obtenerClienteCombox();
                            Cajero cj = gFacturar.obtenerCajeroCombox();
                            factura = new Factura(cl, cj, detalles, pagos);
                            factura.setNumFactura(String.valueOf(listaFacturas.size()));
                            listaFacturas.add(factura);
                            try {
                                
                                ArchivosXML.guardarFacturas(listaFacturas);
                                controllerProductos.realizarCompra(detalles);
                                mercadito.restablecerFacturas();
                            } catch (JAXBException ex) {
                                ex.printStackTrace();
                            }
                            PDF pd = new PDF(factura);
                                pd.generarPDF();
                                controllerHistorico.agregarFactList(factura);
                                //limpiarTodo();
                                
                            vCobrar.dispose();
                            iniciarTodo();
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
        
         public ControllerHistorico getControllerHistorico() {
            return controllerHistorico;
         }

        

        //-----------Historico-----------


        
        
        
        
        //--------------Utilidades Propias----------------
        
        private Producto obtenerProducto_Fila(int fila){
            Object celdaCod = gFacturar.getTablaArticulos().getValueAt(fila, 0);
            String product_Cod = (String) celdaCod;
            return mercadito.buscarProducto(product_Cod);
        }
        
        private void setearTotales(){
            gFacturar.setArtsTotal(String.valueOf(factura.cantidadTotal()));
            gFacturar.setDesTotal(String.valueOf(factura.descuentos()));
            gFacturar.setSubTotal(String.valueOf(factura.subtotal()));
            gFacturar.setTotalTotal(String.valueOf(factura.montoTotal()));
        }
        
        private void limpiarTodo(){
            JTable tablis = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablis.getModel();
            model.setRowCount(0);
             producto = null;
             detalles = null;
             pagos = null;
             cant = 0;
             factura = null;
        }
        
        private void iniciarTodo(){
            JTable tablis = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablis.getModel();
            model.setRowCount(0);
        cant = 0;
        this.factura = new Factura();
        this.producto = new Producto();
        this.detalles = new ArrayList<>();
        this.pagos = new ArrayList<>();
        setearTotales();
        }
        
    }
   
    
    
    
   
