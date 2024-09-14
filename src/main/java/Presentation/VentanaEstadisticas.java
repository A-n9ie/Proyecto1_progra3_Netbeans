
package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

public class VentanaEstadisticas extends JFrame{
    private JComboBox<String> comboDiaInicio, comboMesInicio, comboAnnoInicio;
    private JComboBox<String> comboDiaFin, comboMesFin, comboAnnoFin;
    private JButton btnGenerarGrafico;
    private JComboBox<String> comboCategorias;
    private JPanel panelGrafico;
    
    public VentanaEstadisticas(List<String> categoriasDisponibles){
        setTitle("Estadisticas de ventas");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Rango de días
        comboDiaInicio = new JComboBox<>(generarDias());
        comboMesInicio = new JComboBox<>(generarMeses());
        comboAnnoInicio = new JComboBox<>(generarAnnos());
        
        comboDiaFin = new JComboBox<>(generarDias());
        comboMesFin = new JComboBox<>(generarMeses());
        comboAnnoFin = new JComboBox<>(generarAnnos());

        comboCategorias = new JComboBox<>();
        btnGenerarGrafico = new JButton("Generar gráfico");
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Desde: "));
        panel.add(comboDiaInicio);
        panel.add(comboMesInicio);
        panel.add(comboAnnoInicio);
        
        panel.add(new JLabel("Hasta: "));
        panel.add(comboDiaFin);
        panel.add(comboMesFin);
        panel.add(comboAnnoFin);
        
        panel.add(new JLabel("Categoría: "));
        panel.add(comboCategorias);
        panel.add(btnGenerarGrafico);

        // Panel para el gráfico
        panelGrafico = new JPanel();
        panelGrafico.setLayout(new BorderLayout());

        // Agregar el panel al JFrame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(panelGrafico, BorderLayout.CENTER);
    }

    public String getDiaInicio() { 
        return comboDiaInicio.getSelectedItem().toString(); 
    }
    public String getMesInicio() { 
        return comboMesInicio.getSelectedItem().toString(); 
    }
    public String getAnnoInicio() { 
        return comboAnnoInicio.getSelectedItem().toString(); 
    }
    public String getDiaFin() { 
        return comboDiaFin.getSelectedItem().toString(); 
    }
    public String getMesFin() { 
        return comboMesFin.getSelectedItem().toString(); 
    }
    public String getAnnoFin() { 
        return comboAnnoFin.getSelectedItem().toString(); 
    }

    public JButton getButtonGenerarGrafico() { 
        return btnGenerarGrafico; 
    }
    public String getCategoriaSeleccionada() { 
        return comboCategorias.getSelectedItem().toString(); 
    }
    public void setCategoriasDisponibles(Set<String> categorias) {
        comboCategorias.removeAllItems();
        for (String categoria : categorias) {
            comboCategorias.addItem(categoria);
        }
    }
    public void mostrarGrafico(JPanel graficoPanel) {
        panelGrafico.removeAll();
        panelGrafico.add(graficoPanel, BorderLayout.CENTER);
        panelGrafico.revalidate();
        panelGrafico.repaint();
    }
    
    private String[] generarDias() {
        String[] dias = new String[31];
        for (int i = 1; i <= 31; i++) {
            dias[i - 1] = String.valueOf(i);
        }
        return dias;
    }

    private String[] generarMeses() {
        return new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    }
    private String[] generarAnnos() {
        String[] annos = new String[5];
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 5; i++) {
            annos[i] = String.valueOf(currentYear - i); //Límite de ultimos 5 años
        }
        return annos;
    }
}

