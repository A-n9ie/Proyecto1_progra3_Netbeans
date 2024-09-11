
package Presentation;

import javax.swing.*;
import java.awt.event.*;

public class VentanaEstadisticas extends JFrame{
    private JComboBox<String> comboMes;
    private JComboBox<String> comboCategorias;
    private JButton btnGenerarGrafico;
    
    public VentanaEstadisticas(){
        setTitle("Estadisticas de ventas");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        comboMes = new JComboBox<>(new String[]{
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        });
        comboCategorias = new JComboBox<>(new String[]{
            "Dulces", "Bebidas", "Snacks", "Lácteos", "Carnes", "Frutas", "Verduras", "Congelados", "Limpieza", "Panadería"
        });
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
    public String getCategoriaSeleccionada(){
        return comboCategorias.getSelectedItem().toString();
    }
    public JButton getButtonGenerarGrafico(){
        return btnGenerarGrafico;
    }
}
