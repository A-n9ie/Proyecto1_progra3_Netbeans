package Domain;

import Domain.Factura;
import Domain.DetalleVenta;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class GraficoEstadisticas {

    public JPanel crearGraficoEstadisticas(List<Factura> facturas) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Map<String, Map<String, Double>> ventasPorMesYCategoria = new HashMap<>();
        
        System.out.println("Facturas recibidas: " + facturas.size());
        for (Factura factura : facturas) {
            String mes = factura.getMes();  // Obtener el mes de la factura
            System.out.println("Procesando factura del mes: " + mes);

            for (DetalleVenta detalle : factura.getDetalles()) {
                String categoria = detalle.getProducto().getCategoria();
                double totalVenta = detalle.importe();
                System.out.println("Categoría: " + categoria + ", Total Venta: " + totalVenta);

                ventasPorMesYCategoria.computeIfAbsent(mes, k -> new HashMap<>()).merge(categoria, totalVenta, Double::sum);
            }
        }
        
        System.out.println("Datos procesados: " + ventasPorMesYCategoria);

        for (Map.Entry<String, Map<String, Double>> entryMes : ventasPorMesYCategoria.entrySet()) {
            String mes = entryMes.getKey();
            for (Map.Entry<String, Double> entryCategoria : entryMes.getValue().entrySet()) {
                System.out.println("Añadiendo al dataset: Mes = " + mes + ", Categoría = " + entryCategoria.getKey() + ", Total = " + entryCategoria.getValue());
                dataset.addValue(entryCategoria.getValue(), entryCategoria.getKey(), mes);
            }
        }
        
        if (dataset.getRowCount() == 0) {
            System.out.println("El dataset está vacío. Verificar los datos de entrada.");
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Ventas Mensuales",        // Título del gráfico
                "Categoría",               // Etiqueta del eje X
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