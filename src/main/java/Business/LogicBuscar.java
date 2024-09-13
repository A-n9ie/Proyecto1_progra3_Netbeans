/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.ArchivosXML;
import Domain.Producto;
import Presentation.VentanaBuscar;
import jakarta.xml.bind.JAXBException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author angie
 */
public class LogicBuscar {
    private List<Producto> list;
    private VentanaBuscar vBuscar;
    
    public LogicBuscar() throws JAXBException {
        list = ArchivosXML.cargarProductos();
        vBuscar = new VentanaBuscar();
        EstablecerTabla();
        llenarTabla();
    }
    
    private void EstablecerTabla(){
        DefaultTableModel model = (DefaultTableModel) vBuscar.getProductosTableView().getModel();
        model.setRowCount(list.size()); //Tamaño de la lista más su caracteristicas
    }
    
     private void llenarTabla(){
        JTable tablis = vBuscar.getProductosTableView();
        for(int i = 0; i < tablis.getRowCount(); i++){
            Producto aux = list.get(i);
            String[] datosPro = {aux.getCodigo(), aux.getDescripcion(),
                aux.getUnidad_m(), String.valueOf(aux.getPrecio()),aux.getCategoria()};
            for(int j = 0; j < tablis.getColumnCount(); j++){
                    tablis.setValueAt(datosPro[j], i, j);
            }
        }
    }

    public List<Producto> getList() {
        return list;
    }

    public VentanaBuscar getvBuscar() {
        return vBuscar;
    }
    
    
    
}
