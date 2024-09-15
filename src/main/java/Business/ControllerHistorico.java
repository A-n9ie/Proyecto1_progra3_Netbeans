/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.MiniSuper;
import Domain.Factura;
import Domain.Producto;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author angie
 */
public class ControllerHistorico {
      private List<Factura> list;
    private GUIFacturar gFacturar;
    
    public ControllerHistorico(GUIFacturar fact, MiniSuper m) throws JAXBException {
        list = m.getListaFacturas();
        gFacturar = fact;
        EstablecerTabla();
    }
    
    public void getControllerHistorico() {
        gFacturar.addBuscarFacturaBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = "Factura #" + gFacturar.getNumFactura();
                   try {
                    // Obtener el Highlighter del JTextArea
                    Highlighter highlighter = gFacturar.getListFacturas().getHighlighter();
                    Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.magenta);

                    highlighter.removeAllHighlights();

                    String texto = gFacturar.getListFacturas().getText();
                    int index = texto.indexOf(searchText);
                    
                    if(index == -1)
                        gFacturar.notify("No se encuentra la factura");
                    else{
                    while (index >= 0) {
                        int endIndex = index + searchText.length();
                            highlighter.addHighlight(index, endIndex, painter);
                        
                         gFacturar.getListFacturas().setCaretPosition(index);
                         gFacturar.getListFacturas().moveCaretPosition(endIndex + 81);
                         gFacturar.getListFacturas().requestFocus();
                         
                         index = texto.indexOf(searchText, endIndex);
                    }
                    }

                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    public void EstablecerTabla(){
        for(Factura fact: list)
            gFacturar.getListFacturas().append(fact.toString() + "\n");
    }
    
    public void agregarFactList(Factura fact){
            gFacturar.getListFacturas().append(fact.toString() + "\n");
    }
}
