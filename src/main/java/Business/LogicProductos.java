/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
import Domain.Producto;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angie
 */
public class LogicProductos {
    private List<Producto> list;
    private GUIFacturar gFacturar;
    
    public LogicProductos(GUIFacturar fact, List<Producto> ps) throws JAXBException {
        list = ps;
        gFacturar = fact;
        EstablecerTabla();
        llenarTabla();
    }
    
    private void EstablecerTabla(){
        DefaultTableModel model = (DefaultTableModel) gFacturar.getTableProductosNuevos().getModel();
        model.setRowCount(list.size()); //Tamaño de la lista 
    }
    
     private void llenarTabla(){
        JTable tablis = gFacturar.getTableProductosNuevos();
         
        for(int i = 0; i < tablis.getRowCount(); i++){
            Producto aux = list.get(i);
            Object[] datosPro = {aux.getCodigo(), aux.getDescripcion(),
                aux.getUnidad_m(), aux.getPrecio(), aux.getDescuento(), aux.getExistencia(),aux.getCategoria()};
            
            for(int j = 0; j < tablis.getColumnCount(); j++){
                    tablis.setValueAt(datosPro[j], i, j);
            }
        }
    }

     
     public void actualizarLista(){
         EstablecerTabla();
        llenarTabla();
     }
}
