package Business;

import Data.ListaProductos;
import Data.LogicProductoXML;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import Presentation.VentanaCobrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerFacturar {
    private GUIFacturar gFacturar;
    private VentanaCobrar vCobrar;
    private VentanaBuscar vBuscar;
    private LogicProductoXML lProducto;

public ControllerFacturar(){
     this.gFacturar = new GUIFacturar();
     this.vCobrar = new VentanaCobrar();
     this.vBuscar = new VentanaBuscar();
     this.lProducto = new LogicProductoXML();
}

public void getControllerFacturar(){
    gFacturar.setVisible(true);
    gFacturar.setLocationRelativeTo(null);
    
    //Buscar
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
           
           Producto descripcionEncontrada = lProducto.buscarProducto("productos.xml", descripcionBuscar);
         
           if(descripcionEncontrada != null){
               vBuscar.notify(descripcionEncontrada.toString());
               vBuscar.setDescripcionTf("");
               gFacturar.setCodigoProducto(descripcionBuscar);
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
}
}
    
    
    
    
   
