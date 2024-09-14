package Business;

import Business.LogicVBuscar;
import Data.ArchivosXML;
import Data.ListaClientes;
import Data.ListaProductos;
//import Data.LogicProductoXML;
import Data.MiniSuper;
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
    

    public ControllerFacturar(GUIFacturar gFacturar) throws JAXBException{
         this.gFacturar = gFacturar;
         this.vCobrar = new VentanaCobrar();
         this.vCantidad = new VentanaCantidad();
         this.producto = new Producto();
         LogicVBuscar ventBuscar = new LogicVBuscar();
         this.vBuscar = ventBuscar.getvBuscar();
         this.mercadito = new MiniSuper();
         cant = 0;
    }

    public void getControllerFacturar(){
        //--------------------Buscar---------------------------------------------
        gFacturar.addBuscarBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               vBuscar.setVisible(true);
               vBuscar.setLocationRelativeTo(null);
            } 
        });
        //Buscar cancelar
        vBuscar.addCancelBtn(new ActionListener(){//me devuelvo
            @Override
            public void actionPerformed(ActionEvent e) {
                vBuscar.dispose();
            }
        });

        vBuscar.addOkBtn(new ActionListener(){
               @Override
            public void actionPerformed(ActionEvent e) {
               String descripcionBuscar = vBuscar.getDescripcionTf();
               if(descripcionBuscar.isEmpty()){
                   vBuscar.notify("Ingrese una descripcion");
                   return;
               }
                producto = mercadito.buscarProducto_Descrip(descripcionBuscar);

               if(producto != null){
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
               vCobrar.setVisible(true);
               vCobrar.setLocationRelativeTo(null);
            }
        });
        

        vCobrar.addCancel(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               vCobrar.dispose();
            }
        }); 

        vCobrar.addOkBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
//----------------------------AGREGAR-------------------------------------------
        gFacturar.addAgregarBtn(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto(new DetalleVenta(cant, producto));
            }

        });

    gFacturar.addCantidadBtn(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            vCantidad.setVisible(true);
            vCantidad.setLocationRelativeTo(null);
        }
        
    });
    
    vCantidad.addOkBtn(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         if(!vCantidad.getIngCantidad().isEmpty()){   
            int cant = Integer.parseInt(vCantidad.getIngCantidad()); 
            if(cant > 0){
                if(cant <= producto.getExistencia()){
                    producto.venderProducto(cant);
                    vCantidad.setIngCantidad("");
                    vCantidad.dispose();
                }
                else
                    vCantidad.notify("La cantidad sobrepasa la existencia del producto");
            }
            else
            {
                vCantidad.notify("La cantidad debe ser mayor a 0");
            }
         }
        }
        
    });
    
    vCantidad.addCancelBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               vCantidad.dispose();
            }
        
    });
    
    //-------------Eliminar--------------
    gFacturar.addEliminarBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               JTable tablaProductos = gFacturar.getTableClientes();
               int productoSeleccionado = gFacturar.getTablaArticulos().getSelectedRow();
               
               if(productoSeleccionado < 0){
                gFacturar.notify("Seleccione el producto que desea eliminar");
            }else{
                  JTable tablaArticulos = gFacturar.getTablaArticulos();
                  DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
                  model.removeRow(productoSeleccionado);
               }
            }
    });
    
    gFacturar.addCancelarBtm(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              gFacturar.notify("Gracias por usar nuestro sistema");
              gFacturar.dispose();
            }
        
    });
    }
    
    
    
    
    
    void agregarProducto(DetalleVenta detalle){
        if(detalle != null && detalle.getProducto() != null){
         JTable tablis = gFacturar.getTablaArticulos();
         DefaultTableModel model = (DefaultTableModel) tablis.getModel();
         
         Object[] datos = {detalle.getProducto().getCodigo(), detalle.getProducto().getDescripcion(),
         detalle.getCategoria(), detalle.getCantidad(), detalle.getProducto().getPrecio(),
         detalle.getProducto().getDescuento(), detalle.precioNeto(),
         detalle.importe()};
         
         model.insertRow(0,datos);
        }
    }
   
    
}
   
    
    
    
   
