/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Domain.Cajero;
import Domain.Cliente;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaPDF;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;

public class ControllerPDF {
    private VentanaPDF vPDF;

    public ControllerPDF() {
        vPDF = new VentanaPDF();
    }

    public VentanaPDF getvPDF() {
        return vPDF;
    }
    
    public void mostrarClientePDF(Cliente cliente) {
        try {
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter.getInstance(document, outputStream);
        document.open();

        document.add(new Paragraph("-REPORTE CLIENTE-"));
        document.add(new Paragraph("                                "));
        document.add(new Paragraph("Nombre: " + cliente.getNombre()));
        document.add(new Paragraph("Cedula: " + cliente.getCedula()));
        document.add(new Paragraph("Telefono: " + cliente.getTelefono()));
        document.add(new Paragraph("Correo: " + cliente.getCorreo()));
        document.add(new Paragraph("Descuento: " + cliente.getDescuento()));

        document.close();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        PDDocument pdfDocument = PDDocument.load(inputStream);
        PDFRenderer renderer = new PDFRenderer(pdfDocument);

        BufferedImage imagen = renderer.renderImage(0);

        ImageIcon icono = new ImageIcon(imagen);
        JLabel label = new JLabel(icono);
        
        vPDF.getPanelPDF().removeAll(); 
        vPDF.getPanelPDF().setLayout(new BorderLayout()); 

        vPDF.getPanelPDF().add(label, BorderLayout.CENTER);
        
        vPDF.getPanelPDF().revalidate();
        vPDF.getPanelPDF().repaint();
        
        pdfDocument.close(); 
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
    }
    
     public void mostrarCajeroPDF(Cajero cajero) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Document document = new Document();
            PdfWriter.getInstance(document, outputStream);
            document.open();

            document.add(new Paragraph("-REPORTE CAJERO-"));
            document.add(new Paragraph("                                "));
            document.add(new Paragraph("Nombre: " + cajero.getNombre()));
            document.add(new Paragraph("Cedula: " + cajero.getCedula()));

            document.close();  
            
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            PDDocument pdfDocument = PDDocument.load(inputStream);
            PDFRenderer renderer = new PDFRenderer(pdfDocument);

            BufferedImage imagen = renderer.renderImage(0);

            ImageIcon icono = new ImageIcon(imagen);
            JLabel label = new JLabel(icono);

            vPDF.getPanelPDF().removeAll(); 
            vPDF.getPanelPDF().setLayout(new BorderLayout()); 

            vPDF.getPanelPDF().add(label, BorderLayout.CENTER);

            vPDF.getPanelPDF().revalidate();
            vPDF.getPanelPDF().repaint();

            pdfDocument.close();  
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
    }
     
     public void mostrarProductoPDF(Producto producto) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Document document = new Document();
            PdfWriter.getInstance(document, outputStream);
            document.open();

            document.add(new Paragraph("-REPORTE PRODUCTO-"));
            document.add(new Paragraph("                                "));
            document.add(new Paragraph("Descripcion: " + producto.getDescripcion()));
            document.add(new Paragraph("Codigo: " + producto.getCodigo()));
            document.add(new Paragraph("Existencias: " + String.valueOf(producto.getExistencia())));
            document.add(new Paragraph("Precio: " + String.valueOf(producto.getPrecio())));
            document.add(new Paragraph("Unidad de medida: " + producto.getUnidad_m()));
            document.add(new Paragraph("Categoria: " + producto.getCategoria()));
            document.add(new Paragraph("Descuento: " + producto.getDescuento()));

            document.close();  
            
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            PDDocument pdfDocument = PDDocument.load(inputStream);
            PDFRenderer renderer = new PDFRenderer(pdfDocument);

            BufferedImage imagen = renderer.renderImage(0);

            ImageIcon icono = new ImageIcon(imagen);
            JLabel label = new JLabel(icono);

            vPDF.getPanelPDF().removeAll(); 
            vPDF.getPanelPDF().setLayout(new BorderLayout()); 

            vPDF.getPanelPDF().add(label, BorderLayout.CENTER);

            vPDF.getPanelPDF().revalidate();
            vPDF.getPanelPDF().repaint();
        
            pdfDocument.close();  
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
