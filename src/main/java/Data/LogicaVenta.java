/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Producto;
import Domain.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author angie
 */
public class LogicaVenta {

    public LogicaVenta() {
    }
    
    public Venta buscarVentaPorCodigo(String codigo, String archivoXML) {
    LogicaProducto logProducto = new LogicaProducto();
    String codigoVenta;
    Venta venta = new Venta();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Venta");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    codigoVenta = element.getAttribute("codigoVenta");

                    if (codigoVenta.equals(codigo)) {
                        NodeList nodeListP = root.getElementsByTagName("Producto");
                        for (int k = 0; k < nodeListP.getLength(); k++) {
                        Node node2 = nodeListP.item(k);
                            if (node2.getNodeType() == Node.ELEMENT_NODE) {
                                Element element2 = (Element) node2;
                                String cod = element2.getAttribute("codigo");
                                int cantidad = Integer.parseInt(element2.getAttribute("cantidad"));
                                Producto producto = logProducto.buscarProducto(cod, archivoXML);
                                venta.agregarCarrito(producto, cantidad);
                            }
                        }
                        return venta;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     
    public List<Venta> buscarVentas(String archivoXML) {
    List<Venta> listaVentas = new ArrayList<>();
    LogicaProducto logProducto = new LogicaProducto();

    try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(archivoXML);
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getElementsByTagName("Venta");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                Venta venta = new Venta();
                venta.setCodigoVenta(element.getAttribute("codigoVenta"));

                // Busca los productos dentro de esta venta específica
                NodeList productos = element.getElementsByTagName("Producto");
                for (int k = 0; k < productos.getLength(); k++) {
                    Node productoNode = productos.item(k);
                    if (productoNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element productoElement = (Element) productoNode;
                        String codigoProducto = productoElement.getAttribute("codigo");
                        int cantidad = Integer.parseInt(productoElement.getAttribute("cantidad"));
                        Producto producto = logProducto.buscarProducto(codigoProducto, archivoXML);
                        venta.agregarCarrito(producto, cantidad);
                    }
                }

                listaVentas.add(venta);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return listaVentas;
}
}