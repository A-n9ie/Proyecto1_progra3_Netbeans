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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Data.MiniSuper;

    public class ControllerEstadisticas {
    private VentanaEstadisticas ventana;
    private GraficoEstadisticas grafico;
    private MiniSuper miniSuper;

    public ControllerEstadisticas(VentanaEstadisticas ventana, GraficoEstadisticas grafico, MiniSuper miniSuper) {
        this.ventana = ventana;
        this.grafico = grafico;
        this.miniSuper = miniSuper;

        Set<String> categoriasDinamicas = obtenerCategorias();
        ventana.setCategoriasDisponibles(categoriasDinamicas);

        ventana.getButtonGenerarGrafico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener rango de fechas
                    String mesInicio = convertirMesANumero(ventana.getMesInicio());
                    String mesFin = convertirMesANumero(ventana.getMesFin());
                    String fechaInicio = String.format("%02d/%02d/%04d", Integer.parseInt(ventana.getDiaInicio()), Integer.parseInt(convertirMesANumero(ventana.getMesInicio())), Integer.parseInt(ventana.getAnnoInicio()));
                    String fechaFin = String.format("%02d/%02d/%04d", Integer.parseInt(ventana.getDiaFin()), Integer.parseInt(convertirMesANumero(ventana.getMesFin())), Integer.parseInt(ventana.getAnnoFin()));
                    System.out.println("Fecha Inicio: " + fechaInicio + ", Fecha Fin: " + fechaFin);

                    // Convertir fechas al formato correcto
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateInicio = sdf.parse(fechaInicio);
                    Date dateFin = sdf.parse(fechaFin);

                    String categoriaSeleccionada = ventana.getCategoriaSeleccionada();
                    System.out.println("Categoría seleccionada: " + categoriaSeleccionada);

                    List<Factura> facturas = obtenerFacturas(sdf.format(dateInicio), sdf.format(dateFin), categoriaSeleccionada);
                    System.out.println("Facturas obtenidas: " + facturas.size());
                    for (Factura factura : facturas) {
                        System.out.println(factura);
                    }

                    JPanel panelGrafico = grafico.crearGraficoEstadisticas(facturas);
                    ventana.mostrarGrafico(panelGrafico);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        try {
            List<Producto> productos = miniSuper.getListaProductos();
            for (Producto producto : productos) {
                categorias.add(producto.getCategoria()); // Agrega la categoría al Set
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias; // Retorna las categorías únicas
    }

    private List<Factura> obtenerFacturas(String fechaInicio, String fechaFin, String categoria) {
        List<Factura> todasLasFacturas = miniSuper.getListaFacturas();
        List<Factura> facturasFiltradas = new ArrayList<>();

        System.out.println("Filtrando facturas desde " + fechaInicio + " hasta " + fechaFin + " para la categoría " + categoria);

        for (Factura factura : todasLasFacturas) {
            String fechaFactura = factura.getFecha();
            System.out.println("Fecha de la factura: " + fechaFactura);

            if (estaEnRango(fechaFactura, fechaInicio, fechaFin)) {
                for (DetalleVenta detalle : factura.getDetalles()) {
                    if (detalle.getProducto().getCategoria().equals(categoria)) {
                        facturasFiltradas.add(factura);
                        System.out.println("Factura filtrada: " + fechaFactura + " - " + detalle.getProducto().getCategoria());
                        break;
                    }
                }
            }
        }
        System.out.println("Facturas filtradas: " + facturasFiltradas.size());
        return facturasFiltradas;
    }

    private boolean estaEnRango(String fechaFactura, String fechaInicio, String fechaFin) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateFactura = sdf.parse(fechaFactura);
        Date dateInicio = sdf.parse(fechaInicio);
        Date dateFin = sdf.parse(fechaFin);

        return dateFactura.compareTo(dateInicio) >= 0 && dateFactura.compareTo(dateFin) <= 0;
    } catch (ParseException e) {
        e.printStackTrace();
        return false;
    }
}

    private String convertirMesANumero(String mes) {
        Map<String, String> meses = new HashMap<>();
        meses.put("Enero", "01");
        meses.put("Febrero", "02");
        meses.put("Marzo", "03");
        meses.put("Abril", "04");
        meses.put("Mayo", "05");
        meses.put("Junio", "06");
        meses.put("Julio", "07");
        meses.put("Agosto", "08");
        meses.put("Septiembre", "09");
        meses.put("Octubre", "10");
        meses.put("Noviembre", "11");
        meses.put("Diciembre", "12");
        return meses.get(mes);
    }
}
