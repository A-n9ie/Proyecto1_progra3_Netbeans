/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
import Data.MiniSuper;
import Domain.Cliente;
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



public class ControllerClientes {
    private GUIFacturar gFacturar;
    private Cliente cliente;
    private ArchivosXML guardaXMl;
    private List<Cliente> listaClientes;
    private MiniSuper mercadito;
    
    
    public ControllerClientes(GUIFacturar gFacturar) throws JAXBException{
        this.gFacturar = gFacturar;
        this.cliente = new Cliente();
        this.guardaXMl = new ArchivosXML();
        this.listaClientes = ArchivosXML.cargarClientes();
        this.mercadito = new MiniSuper();        
    }
    
    public void getVentanaClientes(){
        
        gFacturar.addGuardarClienteBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String id = gFacturar.getIDClienteTf();
               String nombre = gFacturar.getNombreClienteTf();
               String telefono = gFacturar.getTelefonoClienteTf();
               String email = gFacturar.getEmailClienteTf();
               String desc = gFacturar.getDescClienteTf();
               
               if(id.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || email.isEmpty() || desc.isEmpty()){
                   gFacturar.notify("Ingrese toda la informacion solicitada");
               }
               else{
                     Cliente cliente = new Cliente(email, telefono, Float.parseFloat(desc) , id, nombre);
                     
                     JTable tablaClientes = gFacturar.getTableClientes();
                     DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
                     tablaClientes.setRowSelectionAllowed(true);
                     Object[] datosCliente = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), cliente.getDescuento()};
                     
                     model.insertRow(0,datosCliente);
                                          
                     if(listaClientes == null){
                         listaClientes = new ArrayList<>();
                     }
                        listaClientes.add(cliente);
                   try {
                       ArchivosXML.guardarClientes(listaClientes);
                   } catch (JAXBException ex) {
                      ex.printStackTrace();
                   }
                     
               }
            }
        });
        
        gFacturar.addEliminarClienteBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

               int clienteSeleccionado = gFacturar.getTableClientes().getSelectedRow();
               
               if(clienteSeleccionado < 0){
                gFacturar.notify("Seleccione el cliente que desea elimnar");
            }else{
                  JTable tablaClientes = gFacturar.getTableClientes();
                  DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
                  String nombreSeleccionado = (String) model.getValueAt(clienteSeleccionado, 0);
                  model.removeRow(clienteSeleccionado);
                  
                  mercadito.eliminarPorNombreCliente(nombreSeleccionado);
               }
            }
            
        });
        
       gFacturar.addLimpiarClientesBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.setIDClienteTf("");
                gFacturar.setNombreClienteTf("");
                gFacturar.setTelefonoClienteTf("");
                gFacturar.setEmailClienteTf("");
                gFacturar.setDescClienteTf("");
            } 
       });
       
       gFacturar.addBuscarClienteBtn(new ActionListener(){
           
           public void actionPerformed(ActionEvent e) {
            String buscarPorNombre = gFacturar.getNombreBusq();
            
               if(buscarPorNombre.isEmpty()){
                   gFacturar.notify("Ingrese un Nombre");
                   return;
               }
                cliente = mercadito.buscarCliente_Nom(buscarPorNombre);

               if(cliente != null){
                   gFacturar.setIDClienteTf(cliente.getCedula());
                   gFacturar.setNombreClienteTf(cliente.getNombre());
                   gFacturar.setTelefonoClienteTf(cliente.getTelefono());
                   gFacturar.setEmailClienteTf(cliente.getTelefono());
                   gFacturar.setDescClienteTf(String.valueOf(cliente.getDescuento()));
                   return;
               }
           }
           
       });
    }
}
