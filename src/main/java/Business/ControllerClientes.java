/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
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
    private VentanaBuscar vBuscar;
    private ArchivosXML guardaXMl;
    //List<Cliente> listaClientes = new ArrayList<>();
    private List<Cliente> listaClientes;
    
    
    public ControllerClientes(GUIFacturar gFacturar) throws JAXBException{
        this.gFacturar = gFacturar;
        this.cliente = new Cliente();
        this.vBuscar = new VentanaBuscar();
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
                     Cliente cliente = new Cliente(email, telefono, Float.parseFloat(desc) , id, nombre);
                     
                     JTable tablaClientes = gFacturar.getTableClientes();
                     DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
                     
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
    }
}
