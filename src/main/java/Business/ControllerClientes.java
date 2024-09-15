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
    private LogicClientes logCliente;
    private ArchivosXML guardaXMl;
    private List<Cliente> listaClientes;
    private MiniSuper mercadito;
    
    
    public ControllerClientes(GUIFacturar gFacturar, MiniSuper m) throws JAXBException{
        this.gFacturar = gFacturar;
        this.cliente = new Cliente();
        this.mercadito = m;  
        this.logCliente = new LogicClientes(gFacturar, m.getListaClientes());
        this.guardaXMl = new ArchivosXML();
        this.listaClientes = ArchivosXML.cargarClientes();
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
                    float descNum = Float.parseFloat(desc);
                    if(descNum >= 1)
                    descNum/=100;
                    
                   if(mercadito.buscarCajero(id) == null && mercadito.buscarCliente(id) == null){
                     Cliente cliente = new Cliente(email, telefono, descNum , id, nombre);
                     
                                          
                     if(listaClientes == null){
                         listaClientes = new ArrayList<>();
                     }
                        listaClientes.add(cliente);
                   actualizarClientes();
                 }
                   else
                       gFacturar.notify("La persona ya se encuentra registrada en el sistema");
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
                  
                  String cedula = (String) model.getValueAt(clienteSeleccionado, 0);
                  model.removeRow(clienteSeleccionado);
                  listaClientes.removeIf(cliente -> cliente.getCedula().equals(cedula));
                    
                  actualizarClientes();
                  
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
                cliente = mercadito.buscarCliente(buscarPorNombre);

               if(cliente != null){
                   gFacturar.setIDClienteTf(cliente.getCedula());
                   gFacturar.setNombreClienteTf(cliente.getNombre());
                   gFacturar.setTelefonoClienteTf(cliente.getTelefono());
                   gFacturar.setEmailClienteTf(cliente.getTelefono());
                   gFacturar.setDescClienteTf(String.valueOf(cliente.getDescuento()));
                   return;
               }
               else{
                    gFacturar.notify("No se encontro al cliente");
                }
                   
           }
           
       });
    }
    
    private void actualizarClientes() {
        try {
           ArchivosXML.guardarClientes(listaClientes);
            mercadito.restablecerClientes();
            logCliente.actualizarLista();
            gFacturar.cargarClientes(mercadito.getListaClientes());
          } catch (JAXBException ex) {
             ex.printStackTrace();
            }
    }
    
}
