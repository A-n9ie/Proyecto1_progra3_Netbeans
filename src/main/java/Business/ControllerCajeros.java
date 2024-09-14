package Business;


import Data.ArchivosXML;
import Data.MiniSuper;
import Domain.Cajero;
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



public class ControllerCajeros {
    private GUIFacturar gFacturar;
    private Cajero cajero;
    private VentanaBuscar vBuscar;
    private ArchivosXML guardaXMl;
    private List<Cajero> listaCajero;
    private MiniSuper mercadito;
    
    
    public ControllerCajeros(GUIFacturar gFacturar) throws JAXBException{
        this.gFacturar = gFacturar;
        this.cajero = new Cajero();
        this.guardaXMl = new ArchivosXML();
        this.listaCajero = ArchivosXML.cargarCajeros();
        this.mercadito = new MiniSuper();        
    }
    
    public void getVentanaCajeros(){
        
        gFacturar.addGuardarCajeroBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String id = gFacturar.getIDClienteTf();
               String nombre = gFacturar.getNombreClienteTf();
               
               if(id.isEmpty() || nombre.isEmpty()){
                   gFacturar.notify("Ingrese toda la informacion solicitada");
               }
               else{
                     cajero = new Cajero(id, nombre);
                     
                     JTable tablaCajero = gFacturar.getTableCajeros();
                     DefaultTableModel model = (DefaultTableModel) tablaCajero.getModel();
                     tablaCajero.setRowSelectionAllowed(true);
                     Object[] datosCajero = {cajero.getCedula(), cajero.getNombre()};
                     
                     model.insertRow(0,datosCajero);
                                          
                     if(listaCajero == null){
                         listaCajero = new ArrayList<>();
                     }
                        listaCajero.add(cajero);
                   try {
                       ArchivosXML.guardarCajeros(listaCajero);
                   } catch (JAXBException ex) {
                      ex.printStackTrace();
                   }
                     
               }
            }
        });
        
        gFacturar.addEliminarCajeroBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

               int cajeroSeleccionado = gFacturar.getTableCajeros().getSelectedRow();
               
               if(cajeroSeleccionado < 0){
                gFacturar.notify("Seleccione el cajero que desea elimnar");
            }else{
                  JTable tablaCajeros = gFacturar.getTableCajeros();
                  DefaultTableModel model = (DefaultTableModel) tablaCajeros.getModel();
                  String nombreCajero = (String) model.getValueAt(cajeroSeleccionado, 0);
                  model.removeRow(cajeroSeleccionado);
                  mercadito.eliminarPorNombreCajero(nombreCajero);
               }
            }
            
        });
        
       gFacturar.addLimpiarClientesBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.setIDCajeroTf("");
                gFacturar.setNombreCajeroTf("");
            } 
       });
       
       gFacturar.addBuscarNombreCajeroBtn(new ActionListener(){
           
           public void actionPerformed(ActionEvent e) {
            String buscarPorNombre = gFacturar.getNombreBusq();
            
               if(buscarPorNombre.isEmpty()){
                   gFacturar.notify("Ingrese un nombre");
                   return;
               }
                cajero = mercadito.buscarCajero_Nom(buscarPorNombre);

               if(cajero != null){
                   gFacturar.setIDClienteTf(cajero.getCedula());
                   gFacturar.setNombreClienteTf(cajero.getNombre());
                   return;
               }
           }
           
       });
    }
}
