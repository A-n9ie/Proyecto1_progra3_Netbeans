/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Data.MiniSuper;
import Domain.Factura;
import Domain.GraficasVentas;
import Presentation.GUIFacturar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Data.MiniSuper;
import Domain.Categoria;
import Domain.Factura;
import Domain.GraficasVentas;
import Presentation.GUIFacturar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class GraficasVentasController {
    private GUIFacturar gFacturar;
    private List<Factura> facturas;
    private LogicEstadistica log;
    private MiniSuper mercadito;

    public GraficasVentasController(GUIFacturar gFacturar, MiniSuper mercadito) {
        this.gFacturar = gFacturar;
        this.mercadito = mercadito;
        this.facturas = mercadito.getListaFacturas();
        this.log = new LogicEstadistica(this.facturas, this.gFacturar, mercadito.getListaCategorias());
    }

    public void mostrarGrafica() {
        gFacturar.addRangoBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.establecerTablaC();
            }
        });
        
        gFacturar.addCheckBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Categoria categoria = (Categoria) gFacturar.getCategoriasCb().getSelectedItem();
                log.agregarVentaCategoria(categoria);
            }
        });

        // Acción para el botón `doubleCheck` (generar gráfica)
    gFacturar.addDoubleCheckBtn(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String categoriaSeleccionada = (String) gFacturar.getCategoriasCb().getSelectedItem();
            List<String> categoriasSeleccionadas = new ArrayList<>();
            categoriasSeleccionadas.add(categoriaSeleccionada);

            // Obtener los años y meses seleccionados
            int anioInicio = Integer.parseInt((String) gFacturar.getAnnioInicio().getSelectedItem());
            int mesInicio = gFacturar.getMesInicio().getSelectedIndex() + 1; // Los meses en LocalDate van de 1 a 12
            int anioFin = Integer.parseInt((String) gFacturar.getAnnioFinal().getSelectedItem());
            int mesFin = gFacturar.getMesFinal().getSelectedIndex() + 1;

            // Crear las fechas de inicio y fin
            LocalDate fechaInicio = LocalDate.of(anioInicio, mesInicio, 1);
            LocalDate fechaFin = LocalDate.of(anioFin, mesFin, 1).withDayOfMonth(LocalDate.of(anioFin, mesFin, 1).lengthOfMonth());

            // Filtrar las facturas por las fechas y categorías seleccionadas
            List<Factura> facturasFiltradas = GraficasVentas.filtrarFacturasPorFechaYCategoria(facturas, fechaInicio, fechaFin, categoriasSeleccionadas);

            // Calcular ventas por categoría
            Map<String, Map<String, Float>> ventasPorCategoria = log.calcularVentasPorCategoria(facturasFiltradas);

            // Crear la tabla de ventas con los meses seleccionados
            log.crearTablaVentas(ventasPorCategoria, mesInicio, mesFin);

            // Crear y mostrar gráfica
            GraficasVentas.crearYMostrarGraficaEnPanel(facturasFiltradas, gFacturar.getPanelGrafica());
        }
    });
    }
}
