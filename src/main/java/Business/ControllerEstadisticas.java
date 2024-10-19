
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
    private LogicEstadistica log;

    public ControllerEstadisticas(VentanaEstadisticas ventana, GraficoEstadisticas grafico, ArchivosXML filesXML) {
        this.ventana = ventana;
        this.grafico = grafico;
  }
    
    private void generarGraficaCategorias(){
        Set<String> categoriasDinamicas = obtenerCategorias();
        ventana.setCategoriasDisponibles(categoriasDinamicas);

        ventana.getButtonGenerarGrafico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener rango de fechas
                    String fechaInicio = ventana.getAnnoInicio() + "-" + ventana.getMesInicio() + "-" + ventana.getDiaInicio();
                    String fechaFin = ventana.getAnnoFin() + "-" + ventana.getMesFin() + "-" + ventana.getDiaFin();

                    List<Factura> facturas = obtenerFacturas(fechaInicio, fechaFin, ventana.getCategoriaSeleccionada());
                    JPanel panelGrafico = grafico.crearGraficoEstadisticas(facturas);
                    ventana.mostrarGrafico(panelGrafico);
                } catch (JAXBException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    
    private Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        try {
            List<Producto> productos = ArchivosXML.cargarProductos();
            for (Producto producto : productos) {
                categorias.add(producto.getCategoria().getNombre()); // Agrega la categoría al Set
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias; // Retorna las categorías únicas
    }
    
    private List<Factura> obtenerFacturas(String fechaInicio, String fechaFin, String categoria) throws JAXBException{
        List<Factura> todasLasFacturas = ArchivosXML.cargarFacturas();
        List<Factura> facturasFiltradas = new ArrayList<>();

        for (Factura factura : todasLasFacturas) {
            String fechaFactura = factura.getFecha();
            if (estaEnRango(fechaFactura, fechaInicio, fechaFin)) {
                for (DetalleVenta detalle : factura.getDetalles()) {
                    if (detalle.getProducto().getCategoria().equals(categoria)) {
                        facturasFiltradas.add(factura);
                        break;
                    }
                }
            }
        }
        return facturasFiltradas;
    }
    private boolean estaEnRango(String fechaFactura, String fechaInicio, String fechaFin) {
        return fechaFactura.compareTo(fechaInicio) >= 0 && fechaFactura.compareTo(fechaFin) <= 0;
    }
}
