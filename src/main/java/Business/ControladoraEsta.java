/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//*
package Business;
import Data.MiniSuper;
import Domain.Factura;
import Domain.Ventas;
import Presentation.GUIFacturar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

public class ControladoraEsta {
    private Ventas venta;
    private GUIFacturar gFacturar;

    public ControladoraEsta(Ventas venta) {
        this.venta = venta;
        this.gFacturar = new GUIFacturar();
    }
    
    public ControladoraEsta(GUIFacturar f) {
        this.gFacturar = f;
        venta = new Ventas();
    }

public void generarGraficaConFacturas(MiniSuper m) {
    // Crear una lista de facturas (ejemplo)
    List<Factura> listaFacturas = m.getListaFacturas(); // Obtener las facturas desde tu sistema
        LocalDate fechaInicio = LocalDate.of(2024, 7, 7); // Fecha de inicio (puede ser seleccionada por el usuario)
        LocalDate fechaFin = LocalDate.of(2024, 9, 9);    // Fecha de fin (puede ser seleccionada por el usuario)
        
        // Calcular las ventas por categoría y mes
        Map<String, Map<String, Double>> ventasPorCategoriaYMes = venta.calcularVentasPorCategoriaYMes(listaFacturas, fechaInicio, fechaFin);
        
        //JTable tabla = new JTable();

        // Llenar la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) gFacturar.getTableCategorias().getModel(); // Obtén el modelo de la tabla desde tu interfaz
        venta.llenarTabla(modeloTabla, ventasPorCategoriaYMes);
        
        // Crear el dataset para el gráfico
        CategoryDataset dataset = venta.crearDatasetVentasPorCategoria(ventasPorCategoriaYMes);
        
        // Crear la gráfica
        JFreeChart chart = venta.crearGraficaPorCategoria(dataset);
        ChartPanel panel = new ChartPanel(chart);
        
        // Mostrar la gráfica en la interfaz
        /*JFrame frame = new JFrame("Gráfico de Ventas");
        frame.setContentPane(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }

}
*/