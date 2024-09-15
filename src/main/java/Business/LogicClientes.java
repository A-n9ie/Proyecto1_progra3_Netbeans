/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
import Domain.Cliente;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angie
 */
public class LogicClientes {
    private List<Cliente> list;
    private GUIFacturar gFacturar;
    
    public LogicClientes(GUIFacturar fact, List<Cliente> cl) throws JAXBException {
        list = cl;
        gFacturar = fact;
        EstablecerTabla();
        llenarTabla();
    }
    
    private void EstablecerTabla(){
        DefaultTableModel model = (DefaultTableModel) gFacturar.getTableClientes().getModel();
        model.setRowCount(list.size()); //Tamaño de la lista 
    }
    
     private void llenarTabla(){
        JTable tablis = gFacturar.getTableClientes();
         
        for(int i = 0; i < tablis.getRowCount(); i++){
            Cliente aux = list.get(i);
            Object[] datosCl = {aux.getCedula(), aux.getNombre(),
                aux.getTelefono(), aux.getCorreo(), aux.getDescuento()};
            
            for(int j = 0; j < tablis.getColumnCount(); j++){
                    tablis.setValueAt(datosCl[j], i, j);
            }
        }
    }
     
     public void actualizarLista(){
         EstablecerTabla();
        llenarTabla();
     }
}
