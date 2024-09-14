
package Business;

import Data.ArchivosXML;
import Data.ListaProductos;
import Data.MiniSuper;
import Domain.Cliente;
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
        
        gFacturar.addBorrarProductosBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

               int productoSeleccionado = gFacturar.getTableProductosNuevos().getSelectedRow();
     
               
               if(productoSeleccionado < 0){
                gFacturar.notify("Seleccione el producto que desea elimnar");
            }else{
                  JTable tablaProductos = gFacturar.getTableProductosNuevos();
                  DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
                  
                  String descripProducto = (String) model.getValueAt(productoSeleccionado, 0);
                  model.removeRow(productoSeleccionado);
                  mercadito.eliminarPorCod(descripProducto);
                  //falta eliminar del xml
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
}

