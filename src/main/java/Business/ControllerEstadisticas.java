
package Business;

import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import java.util.ArrayList;
import Presentation.VentanaEstadisticas;
import Domain.GraficoEstadisticas;
import Domain.Producto;
import Data.ArchivosXML;
import java.util.*;
import Domain.Factura;
import Domain.DetalleVenta;
import jakarta.xml.bind.JAXBException;

public class ControllerEstadisticas {
    private VentanaEstadisticas ventana;
    private GraficoEstadisticas grafico;
    private ArchivosXML filesXML;

    public ControllerEstadisticas(VentanaEstadisticas ventana, GraficoEstadisticas grafico, ArchivosXML filesXML) {
        this.ventana = ventana;
        this.grafico = grafico;
        this.filesXML = filesXML;

        Set<String> categoriasDinamicas = obtenerCategorias();
        ventana.setCategoriasDisponibles(categoriasDinamicas);
        
        ventana.getButtonGenerarGrafico().addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
        try {
            List<Factura> facturas = obtenerFacturas(ventana.getMesSeleccionado(), ventana.getCategoriaSeleccionada());
            
            JPanel panelGrafico = grafico.crearGraficoEstadisticas(facturas);
            
            JFrame frame = new JFrame();
            frame.setContentPane(panelGrafico);
            frame.pack();
            frame.setVisible(true);
        } catch (JAXBException ex) {
            ex.printStackTrace(); // Manejo de la excepción. Puedes mostrar un mensaje de error al usuario si lo prefieres
        }
    }
});
    }

    
    private Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        try {
            List<Producto> productos = ArchivosXML.cargarProductos();
            for (Producto producto : productos) {
                categorias.add(producto.getCategoria()); // Agrega la categoría al Set
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias; // Retorna las categorías únicas
    }
    
    private List<Factura> obtenerFacturas(String mes, String categoria) throws JAXBException{
        List<Factura> todasLasFacturas = ArchivosXML.cargarFacturas();
        
        List<Factura> facturasFiltradas = new ArrayList<>();
        for (Factura factura : todasLasFacturas) {
            for (DetalleVenta detalle : factura.getDetalles()) {
                if (detalle.getProducto().getCategoria().equals(categoria)) { //comparar las categorías para evitar repetir
                    facturasFiltradas.add(factura);
                    break;
                }
            }
        }
        return facturasFiltradas;
    }
}
