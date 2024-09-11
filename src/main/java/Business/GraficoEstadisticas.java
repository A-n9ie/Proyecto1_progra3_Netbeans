package Business;

import Domain.Venta;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.util.List;

public class GraficoEstadisticas {

    public JPanel crearGraficoEstadisticas(List<Venta> ventas) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Venta venta : ventas) {
            double totalVenta = venta.calcularTotal();
            dataset.addValue(totalVenta, venta.getCategoria(), venta.getMes());
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Ventas Mensuales",        // Título del gráfico
                "Mes",                     // Etiqueta del eje X
                "Total Ventas",            // Etiqueta del eje Y
                dataset,                   // Datos
                PlotOrientation.VERTICAL,  // Orientación del gráfico
                true,                      // Incluir leyenda
                true,                      // Incluir tooltips
                false                      // No usar URLs
        );

        return new ChartPanel(barChart);
    }
}
