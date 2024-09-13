package Business;

import Data.ListaProductos;
//import Data.LogicProductoXML;
import Data.MiniSuper;
import Domain.DetalleVenta;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import Presentation.VentanaCantidad;
import Presentation.VentanaCobrar;
import Presentation.VentanaDescuento;
import jakarta.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerFacturar {
    private GUIFacturar gFacturar;
    private MiniSuper mercadito;
    private VentanaCobrar vCobrar;
    private VentanaBuscar vBuscar;
    private VentanaCantidad vCantidad;
    private VentanaDescuento vDesc;
    private Producto producto;
    int cant;

    public ControllerFacturar() throws JAXBException{
         this.gFacturar = new GUIFacturar();
         this.vCobrar = new VentanaCobrar();
         this.vCantidad = new VentanaCantidad();
         this.vDesc = new VentanaDescuento();
         this.producto = new Producto();
         cant = 0;
         
         LogicBuscar ventBuscar = new LogicBuscar();
         this.vBuscar = ventBuscar.getvBuscar();
         this.mercadito = new MiniSuper();
    }

    public void getControllerFacturar(){
        gFacturar.setVisible(true);
        gFacturar.setLocationRelativeTo(null);

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
                   vBuscar.notify(producto.toString());
                   vBuscar.setDescripcionTf("");
                   gFacturar.setCodigoProducto(producto.getDescripcion());
                   vBuscar.dispose();
                   return;
               }
            }
        });
        
        //---------------Cobrar------------------------
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
     //------------------Cantidad-------------------
        gFacturar.addCantidadBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vCantidad.setVisible(true);
                vCantidad.setLocationRelativeTo(null);
            }
            
        }
        );
        
    
        vCantidad.addOkBtn(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
             if(!vCantidad.getIngCantidad().isEmpty()){
                int cant = Integer.valueOf(vCantidad.getIngCantidad());    
                if(cant > 0){
                    if(cant <= producto.getExistencia()){
                        producto.venderProducto(cant);
                        vCantidad.setIngCantidad("");
                    }
                    else
                        vCantidad.notify("La cantidad sobrepasa la existencia del producto");
                }
                else
                {
                    vBuscar.notify("La cantidad debe ser mayor a 0");
                }
             }
            }
        
        });
       //-------------------descuento---------------
        gFacturar.addDescuentoBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vDesc.setVisible(true);
                vDesc.setLocationRelativeTo(null);
            }
        });
    }
 
       
    
    void agregarProducto(DetalleVenta detalle){
        if(detalle != null && producto != null){
         JTable tablis = gFacturar.getTablaArticulos();
         DefaultTableModel model = (DefaultTableModel) tablis.getModel();
         
         Object[] datos = {detalle.getProducto().getCodigo(), detalle.getProducto().getDescripcion(),
         detalle.getCategoria(), detalle.getCantidad(), detalle.getProducto().getPrecio(),
         detalle.getProducto().getDescuento(), detalle.precioNeto(),
         detalle.importe()};
         
         model.addRow(datos);
        }
    }
    
    
}

   
    
    
    
   
