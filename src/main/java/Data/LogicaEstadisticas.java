
package Data;

import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import java.util.ArrayList;
import Presentation.VentanaEstadisticas;
import Business.GraficoEstadisticas;
import Domain.Venta;
import Domain.Producto;

public class LogicaEstadisticas {
    private VentanaEstadisticas ventana;
    private GraficoEstadisticas grafico;
    private FilesXML filesXML;

    public LogicaEstadisticas(VentanaEstadisticas ventana, GraficoEstadisticas grafico, FilesXML filesXML) {
        this.ventana = ventana;
        this.grafico = grafico;
        this.filesXML = filesXML;

        ventana.getButtonGenerarGrafico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Venta> ventas = obtenerEstadisticas(ventana.getMesSeleccionado(), ventana.getCategoriaSeleccionada());
                
                JPanel panelGrafico = grafico.crearGraficoEstadisticas(ventas);
                
                JFrame frame = new JFrame();
                frame.setContentPane(panelGrafico);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private List<Venta> obtenerEstadisticas(String mes, String categoria) {
        List<Producto> productos = filesXML.cargarDatosProductos("productos.xml");
        List<Venta> todasLasVentas = filesXML.cargarDatosVentas("ventas.xml", productos);
        
        List<Venta> ventasFiltradas = new ArrayList<>();
        for (Venta venta : todasLasVentas) {
            if (venta.getMes().equals(mes) && venta.getCategoria().equals(categoria)) {
                ventasFiltradas.add(venta);
            }
        }
        return ventasFiltradas;
    }
}
