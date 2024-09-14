
package Presentation;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

public class VentanaEstadisticas extends JFrame{
    private JComboBox<String> comboMes;
    private JButton btnGenerarGrafico;
    private JComboBox<String> comboCategorias;
    
    public VentanaEstadisticas(List<String> categoriasDisponibles){
        setTitle("Estadisticas de ventas");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        comboMes = new JComboBox<>(new String[]{
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        });
        comboCategorias = new JComboBox<>();
        btnGenerarGrafico = new JButton("Generar grafico");
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Mes: "));
        panel.add(comboMes);
        panel.add(new JLabel("Categoría: "));
        panel.add(comboCategorias);
        panel.add(btnGenerarGrafico);
        
        add(panel);
    }
    
    public String getMesSeleccionado(){
        return comboMes.getSelectedItem().toString();
    }
    public JButton getButtonGenerarGrafico(){
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
}

