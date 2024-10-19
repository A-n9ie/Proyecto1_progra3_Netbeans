/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Domain.Categoria;
import Domain.DetalleVenta;
import Domain.Factura;
import Domain.GraficasVentas;
import Presentation.GUIFacturar;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.stream.Collectors;

public class LogicEstadistica {
    private List<Factura> list;
    private GUIFacturar gFacturar;
    private Set<String> categoriasDisponibles;
    private List<Categoria> listC;

    public LogicEstadistica(List<Factura> list, GUIFacturar gFacturar, List<Categoria> listC) {
        this.list = list;
        this.listC = listC;
        this.gFacturar = gFacturar;
        this.categoriasDisponibles = obtenerCategoriasDisponibles();
        establecerAnnios();
        llenarCategorias();
    }

    public void llenarCategorias(){
        gFacturar.cargarCategorias(listC);
    }
    
    public void establecerAnnios(){
         int anioActual = LocalDate.now().getYear();  

        gFacturar.getAnnioInicio().removeAllItems(); 
        gFacturar.getAnnioFinal().removeAllItems(); 
        for (int anio = 2024; anio <= anioActual; anio++) {
            gFacturar.getAnnioInicio().addItem(String.valueOf(anio));  
            gFacturar.getAnnioFinal().addItem(String.valueOf(anio));
        }
    }

    private Set<String> obtenerCategoriasDisponibles() {
        return list.stream()
                .flatMap(factura -> factura.getDetalles().stream())
                .map(detalle -> detalle.getProducto().getCategoria().getNombre())
                .collect(Collectors.toSet());
    }
    
    public int convertirMes(JComboBox<String> boxMes){
        String mes = (String) boxMes.getSelectedItem();
        return switch (mes) {
            case "Enero (1)" -> 1;
            case "Febrero (2)" -> 2;
            case "Marzo (3)" -> 3;
            case "Abril (4)" -> 4;
            case "Mayo (5)" -> 5;
            case "Junio (6)" -> 6;
            case "Julio (7)" -> 7;
            case "Agosto (8)" -> 8;
            case "Septiembre (9)" -> 9;
            case "Octubre (10)" -> 10;
            case "Noviembre (11)" -> 11;
            case "Diciembre (12)" -> 12;
            default -> -1;
        };
    }
    
    public void establecerTablaC(){
    DefaultTableModel model = (DefaultTableModel) gFacturar.getTableCategorias().getModel();
    model.setRowCount(0); 
    model.setColumnCount(0); 

    model.addColumn("Categoría");
    int mesI = convertirMes(gFacturar.getMesInicio());
    int mesF = convertirMes(gFacturar.getMesFinal());
    
    for(int i = mesI ; i <= mesF; i++){
           model.addColumn("Mes " + i);         
    }
    
    }
    
    public void agregarVentaCategoria(Categoria categoria){
        DefaultTableModel model = (DefaultTableModel) gFacturar.getTableCategorias().getModel();
        
        int mesI = convertirMes(gFacturar.getMesInicio());
        int mesF = convertirMes(gFacturar.getMesFinal());
        
        int rango = (mesF - mesI) + 1;
        
        String[] datos = new String[rango + 1];
        datos[0] = categoria.getNombre();
        int cont = 1;
        for(int i = mesI ; i <= mesF; i++){
           String ventaMes = String.valueOf(GraficasVentas.ventasCategoriaMes(list, categoria, i));
           datos[cont] = ventaMes;
           cont++;
        }
        model.addRow(datos);
    }

    public void crearTablaVentas(Map<String, Map<String, Float>> ventasPorCategoria, int mesInicio, int mesFin) {
    DefaultTableModel model = (DefaultTableModel) gFacturar.getTableCategorias().getModel();
    model.setRowCount(0); 
    model.setColumnCount(0); 

    model.addColumn("Categoría");

    // Crear las columnas de meses basadas en el rango
    for (int mes = mesInicio; mes <= mesFin; mes++) {
        model.addColumn(String.valueOf(mes)); // Agregar mes como columna
    }

    // Agregar los datos (categorías y ventas por mes)
    for (Map.Entry<String, Map<String, Float>> entry : ventasPorCategoria.entrySet()) {
        String categoria = entry.getKey();
        Map<String, Float> ventasPorMes = entry.getValue();

        Object[] fila = new Object[mesFin - mesInicio + 2]; // +1 para categoría, +1 para cada mes
        fila[0] = categoria; // Primera columna es la categoría

        // Asignar las ventas a los meses en la fila
        for (int mes = mesInicio; mes <= mesFin; mes++) {
            String mesKey = String.valueOf(mes); // Suponiendo que las claves son números de mes
            fila[mes - mesInicio + 1] = ventasPorMes.getOrDefault(mesKey, 0f); // Venta por mes
        }

        model.addRow(fila);
    }
}

    public Map<String, Map<String, Float>> calcularVentasPorCategoria(List<Factura> facturasFiltradas) {
        Map<String, Map<String, Float>> ventasPorCategoria = new HashMap<>();

        for (Factura factura : facturasFiltradas) {
            String mes = factura.getLocalFecha().getMonthValue() + "-" + factura.getLocalFecha().getYear(); // Mes y año

            for (DetalleVenta detalle : factura.getDetalles()) {
                String categoria = detalle.getProducto().getCategoria().getNombre();
                float importe = detalle.importe();

                ventasPorCategoria.putIfAbsent(categoria, new HashMap<>());
                Map<String, Float> ventasPorMes = ventasPorCategoria.get(categoria);
                ventasPorMes.put(mes, ventasPorMes.getOrDefault(mes, 0f) + importe);
            }
        }

        return ventasPorCategoria;
    }
}
