
package Business;

import Data.ArchivosXML;
import Data.ListaProductos;
import Data.MiniSuper;
import Domain.Cliente;
import Domain.DetalleVenta;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import jakarta.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ControllerProductos {
    private GUIFacturar gFacturar;
    private Producto producto;
    private ArchivosXML guardaXMl;
    private List<Producto> listaProductos;
    private MiniSuper mercadito;
    
    
    public ControllerProductos(GUIFacturar gFacturar) throws JAXBException{
        this.gFacturar = gFacturar;
        this.producto = new Producto();
        this.guardaXMl = new ArchivosXML();
        this.listaProductos = ArchivosXML.cargarProductos();
        this.mercadito = new MiniSuper();        
    }
    
    public void getVentanaProductos(){
        
        gFacturar.addGuardarProductoBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String codigo = gFacturar.getCodigoTf();
               String descripcion = gFacturar.getDescripcionTf();
               String unidad = gFacturar.getUnidadTf();
               String precio = gFacturar.getPrecioTf();
               String desc = gFacturar.getDescProductoTf();
               String existencias = gFacturar.getExistenciasTf();
               String categoria = gFacturar.getCategoriaTf();
               
               if(codigo.isEmpty() || descripcion.isEmpty() || unidad.isEmpty() || precio.isEmpty() || desc.isEmpty() || existencias.isEmpty() || categoria.isEmpty()){
                   gFacturar.notify("Ingrese toda la informacion solicitada");
               }
               else{
                     producto = new Producto(codigo, descripcion, unidad , Float.parseFloat(precio), Float.parseFloat(desc), Integer.parseInt(existencias), categoria);
                     
                     JTable tablaProductos = gFacturar.getTableProductosNuevos();
                     DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
                     tablaProductos.setRowSelectionAllowed(true);
                     Object[] datosProducto = {producto.getCodigo(), producto.getDescripcion(), producto.getUnidad_m(), producto.getPrecio(), producto.getDescuento(), producto.getExistencia(), producto.getCategoria()};
                     
                     model.insertRow(0,datosProducto);

                   Producto productoActualizado = gFacturar.getProducto();
                   productoActualizado.venderProducto(Integer.parseInt(gFacturar.getProducto().getUnidad_m()));

                   gFacturar.setExistenciasTf(String.valueOf(productoActualizado.getExistencia()));

                   actualizarListaProductos(productoActualizado);
                     if(listaProductos == null){
                         listaProductos = new ArrayList<>();
                     }
                        listaProductos.add(producto);
                   try {
                       ArchivosXML.guardarProductos(listaProductos);
                   } catch (JAXBException ex) {
                      ex.printStackTrace();
                   }
                     
               }
            }
        });

        gFacturar.addBorrarProductosBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productoSeleccionado = gFacturar.getTableProductosNuevos().getSelectedRow();

                if (productoSeleccionado < 0) {
                    gFacturar.notify("Seleccione el producto que desea eliminar");
                } else {
                    JTable tablaProductos = gFacturar.getTableProductosNuevos();
                    DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();

                    String codigoProducto = (String) model.getValueAt(productoSeleccionado, 0);

                    listaProductos.removeIf(producto -> producto.getCodigo().equals(codigoProducto));

                    model.removeRow(productoSeleccionado);

                    try {
                        ArchivosXML.guardarProductos(listaProductos);
                    } catch (JAXBException ex) {
                        ex.printStackTrace();
                        gFacturar.notify("Error al guardar los datos.");
                    }
                }
            }
        });


        gFacturar.addLimpiarClientesBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.setCodigoTf("");
                gFacturar.setCategoriaTf("");
                gFacturar.setUnidadTf("");
                gFacturar.setPrecioTf("");
                gFacturar.setDescProductoTf("");
                gFacturar.setExistenciasTf("");
                gFacturar.setCategoriaTf("");
            } 
       });
       
       gFacturar.addBuscarProductoBtn(new ActionListener(){
           
           public void actionPerformed(ActionEvent e) {
            String buscarNombre = gFacturar.getBusquedacCod();
            
               if(buscarNombre.isEmpty()){
                   gFacturar.notify("Ingrese un Nombre");
                   return;
               }
                producto = mercadito.buscarProducto_Descrip(buscarNombre);

               if(producto != null){
                   gFacturar.setCodigoTf(producto.getCodigo());
                   gFacturar.setDescripcionTf(producto.getDescripcion());
                   gFacturar.setUnidadTf(producto.getUnidad_m());
                   gFacturar.setPrecioTf(String.valueOf(producto.getPrecio()));
                   gFacturar.setDescProductoTf(String.valueOf(producto.getDescuento()));
                   gFacturar.setExistenciasTf(String.valueOf(producto.getExistencia()));
                   gFacturar.setCategoriaTf(String.valueOf(producto.getCategoria()));
                   return;
               }
           }
           
       });
    }

    public void actualizarProductoEnGUI(Producto producto) {
        gFacturar.setProducto(producto);

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(producto.getCodigo())) {
                listaProductos.set(i, producto);
                break;
            }
        }

        try {
            ArchivosXML.guardarProductos(listaProductos);
        } catch (JAXBException ex) {
            ex.printStackTrace();
            gFacturar.notify("Error al guardar los datos.");
        }
    }

    private void actualizarListaProductos(Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(productoActualizado.getCodigo())) {
                listaProductos.set(i, productoActualizado);
                break;
            }
        }
    }
    public void actualizarProductoCantidad(Producto producto, int cantidad) {
        if (producto != null) {
            Producto productoActualizado = listaProductos.stream()
                    .filter(p -> p.getCodigo().equals(producto.getCodigo()))
                    .findFirst()
                    .orElse(null);

            if (productoActualizado != null) {
                if (cantidad <= productoActualizado.getExistencia()) {
                    productoActualizado.venderProducto(cantidad);

                    actualizarListaProductos(productoActualizado);

                    guardarProductos();
                } else {
                    System.out.println("La cantidad sobrepasa la existencia del producto");
                }
            } else {
                System.out.println("El producto no se encuentra en la lista");
            }
        }
    }

    private void guardarProductos() {
        try {
            ArchivosXML.guardarProductos(listaProductos);
        } catch (JAXBException ex) {
            ex.printStackTrace();
            System.out.println("Error al guardar los datos.");
        }
    }

    void agregarProducto(DetalleVenta detalle) {
        if (detalle != null && detalle.getProducto() != null) {
            JTable tablis = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablis.getModel();

            if (detalle.getCantidad() <= detalle.getProducto().getExistencia()) {
                Object[] datos = {
                        detalle.getProducto().getCodigo(),
                        detalle.getProducto().getDescripcion(),
                        detalle.getCategoria(),
                        detalle.getCantidad(),
                        detalle.getProducto().getPrecio(),
                        detalle.getProducto().getDescuento(),
                        detalle.precioNeto(),
                        detalle.importe()
                };

                model.insertRow(0, datos);

                Producto productoActualizado = detalle.getProducto();
                productoActualizado.venderProducto(detalle.getCantidad());

                gFacturar.setExistenciasTf(String.valueOf(productoActualizado.getExistencia()));

                actualizarListaProductos(productoActualizado);

                try {
                    ArchivosXML.guardarProductos(listaProductos);
                } catch (JAXBException ex) {
                    ex.printStackTrace();
                    gFacturar.notify("Error al guardar los datos.");
                }
            } else {
                gFacturar.notify("La cantidad a vender excede la existencia del producto.");
            }
        }
    }
    public List<Producto> getListaProductos(){return listaProductos;}
}

