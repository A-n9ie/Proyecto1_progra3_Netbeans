package Business;


import Data.ArchivosXML;
import Data.MiniSuper;
import Domain.Cajero;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ControllerCajeros {
    private GUIFacturar gFacturar;
    private Cajero cajero;
    private ArchivosXML guardaXMl;
    private List<Cajero> listaCajeros;
    private MiniSuper mercadito;
    private LogicCajeros logCajeros;
    
    
    public ControllerCajeros(GUIFacturar gFacturar, MiniSuper m) throws JAXBException{
        this.mercadito = m;
        this.gFacturar = gFacturar;
        this.cajero = new Cajero();
        this.guardaXMl = new ArchivosXML();
        this.logCajeros = new LogicCajeros(gFacturar, m.getListaCajeros());
        this.listaCajeros = m.getListaCajeros();
    }
    
    public void getVentanaCajeros(){
        
        gFacturar.addGuardarCajeroBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String id = gFacturar.getIDCajeroTf();
               String nombre = gFacturar.getNombreCajeroTf();
               
               if(id.isEmpty() || nombre.isEmpty()){
                   gFacturar.notify("Ingrese toda la informacion solicitada");
               }
               else{
                   if(mercadito.buscarCajero(id) == null && mercadito.buscarCliente(id) == null){
                     cajero = new Cajero(id, nombre);
                                          
                     if(listaCajeros == null){
                         listaCajeros = new ArrayList<>();
                     }
                        listaCajeros.add(cajero);
                   actualizarCajeros();
                  } 
                   else
                       gFacturar.notify("La persona ya se encuentra registrada en el sistema");
               }
            }
        });
        
         
        gFacturar.addModificarCajeroBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String id = gFacturar.getIDCajeroTf();
               String nombre = gFacturar.getNombreCajeroTf();
               
               String buscarPorNombre = gFacturar.getNombreBusqCajeros();
                    cajero = mercadito.buscarCajero(buscarPorNombre);
               if(cajero != null){
                if(id.isEmpty() || nombre.isEmpty()){
                    gFacturar.notify("Ingrese toda la informacion");
                }
                else{
                      cajero.setCedula(id);
                      cajero.setNombre(nombre);

                    actualizarCajeros();

                }
               }
               else{
                    gFacturar.notify("No se encontro al cajero");
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
                  
                  String cedula = (String) model.getValueAt(cajeroSeleccionado, 0);
                  model.removeRow(cajeroSeleccionado);
                  listaCajeros.removeIf(cajero -> cajero.getCedula().equals(cedula));
                    
                  actualizarCajeros();
               }
            }
            
        });
        
       gFacturar.addLimpiarCajeroBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.setIDCajeroTf("");
                gFacturar.setNombreCajeroTf("");
            } 
       });
       
       gFacturar.addBuscarNombreCajeroBtn(new ActionListener(){
           
           public void actionPerformed(ActionEvent e) {
            String buscarPorNombre = gFacturar.getNombreBusqCajeros();
            
               if(buscarPorNombre.isEmpty()){
                   gFacturar.notify("Ingrese un nombre");
                   return;
               }
                cajero = mercadito.buscarCajero(buscarPorNombre);

               if(cajero != null){
                   gFacturar.setIDCajeroTf(cajero.getCedula());
                   gFacturar.setNombreCajeroTf(cajero.getNombre());
                   return;
               }
               else{
                    gFacturar.notify("No se encontro el cajero");
                }
           }
           
       });
       
       gFacturar.addReporteCajeroBtn(new ActionListener(){
           
           @Override
           public void actionPerformed(ActionEvent e) {
            String buscarPorNombre = gFacturar.getNombreBusqCajeros();
            
               if(buscarPorNombre.isEmpty()){
                   gFacturar.notify("Ingrese un Nombre");
                   return;
               }
                cajero = mercadito.buscarCajero(buscarPorNombre);

               if(cajero != null){
                   gFacturar.notify(cajero.toString());
                   return;
               }
               else{
                    gFacturar.notify("No se encontro al cajero");
                }
                   
           }
           
       });
    }
    
    
     private void actualizarCajeros() {
        try {
           ArchivosXML.guardarCajeros(listaCajeros);
            mercadito.restablecerCajeros();
            logCajeros.actulizarLista();
            gFacturar.cargarCajeros(mercadito.getListaCajeros());
          } catch (JAXBException ex) {
             ex.printStackTrace();
            }
    }
}
