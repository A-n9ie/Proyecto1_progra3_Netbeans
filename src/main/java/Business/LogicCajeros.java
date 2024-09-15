/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
import Domain.Cajero;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angie
 */
public class LogicCajeros {
     private List<Cajero> list;
    private GUIFacturar gFacturar;
    
    public LogicCajeros(GUIFacturar fact, List<Cajero> cs) throws JAXBException {
        list = cs;
        gFacturar = fact;
        EstablecerTabla();
        llenarTabla();
    }
    
    private void EstablecerTabla(){
        DefaultTableModel model = (DefaultTableModel) gFacturar.getTableCajeros().getModel();
        model.setRowCount(list.size()); //Tamaño de la lista 
    }
    
     private void llenarTabla(){
        JTable tablis = gFacturar.getTableCajeros();
         
        for(int i = 0; i < tablis.getRowCount(); i++){
            Cajero aux = list.get(i);
            Object[] datosCl = {aux.getCedula(), aux.getNombre()};
            
            for(int j = 0; j < tablis.getColumnCount(); j++){
                    tablis.setValueAt(datosCl[j], i, j);
            }
        }
    }
     
     public void actulizarLista(){
         EstablecerTabla();
        llenarTabla();
     }
}
