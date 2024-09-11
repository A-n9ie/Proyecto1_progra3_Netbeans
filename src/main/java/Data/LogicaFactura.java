/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Cajero;
import Domain.Cliente;
import Domain.Compra;
import Domain.DecoradorProducto;
import Domain.Factura;
import Domain.Producto;
import Domain.Venta;
import Exepciones.ExcepcionExiste;
import Exepciones.ExcepcionNoExiste;
import Exepciones.ExcepcionVacio;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class LogicaFactura {

    public LogicaFactura() {
    }
    
     public boolean agregarFacturaLista(Factura factura, List<Factura> listaFacturas) throws ExcepcionExiste, ExcepcionVacio {
        if (buscarPorNum(factura.getNumFactura(), listaFacturas).isPresent()) {
            throw new ExcepcionExiste();
        }

        listaFacturas.add(factura);

        FilesXML filesXML = new FilesXML();
        //String[] dataName = {"id", "nombre", "telefono", "email", "descuento"};
        //String[] data = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), String.valueOf(cliente.getDescuento())};
        try {
            filesXML.writeXML("facturas", "Factura", factura.getDatosFactura(), factura.getDatos());
            filesXML.writeXML("facturas", "Cliente", factura.getCliente().getDatosCliente(), factura.getCliente().getDatos());
            filesXML.writeXML("facturas", "Cajero", factura.getCajero().getDatosCajero(), factura.getCajero().getDatos());
/*            filesXML.writeXML("facturas", "Venta", factura.getVenta().getDatosVenta(), factura.getVenta().getDatos());
            
            Compra aux = factura.getVenta().getCompra();
            for(int i = 0; i < factura.getVenta().getContProducto(); i++){
            DecoradorProducto decorador = (DecoradorProducto)aux;
            filesXML.writeXML("facturas", "DecoradorProducto", decorador.getDatosDecorador(), decorador.getDatos());
            filesXML.writeXML("facturas", "Producto", decorador.getProducto().getDatosProducto(), decorador.getProducto().getDatos());
            aux = aux.getArticulo();
            }*/
        } catch (TransformerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Optional<Factura> buscarPorNum(String num, List<Factura> listaFacturas) throws ExcepcionVacio {
        if (num == null || num.isEmpty()) {
        throw new ExcepcionVacio();
        }
        return listaFacturas.stream()
                .filter(factura -> factura.getNumFactura().equals(num))
                .findFirst();
    }
    
   public List<Factura> recuperarFacturas(String archivoXML) {
        List<Factura> listaFacturas = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            document.getDocumentElement().normalize();

            // Buscar todas las facturas
            NodeList listaNodosFacturas = document.getElementsByTagName("Factura");
            for (int i = 0; i < listaNodosFacturas.getLength(); i++) {
                Node nodo = listaNodosFacturas.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
                    
                    // Crear objeto Factura
                    Factura factura = new Factura();
                    factura.setNumFactura(element.getAttribute("num_factura"));
                    factura.setHora(element.getElementsByTagName("hora").item(0).getTextContent());
                    factura.setFecha(element.getElementsByTagName("fecha").item(0).getTextContent());

                    // Obtener y establecer Cliente
                    Cliente cliente = obtenerCliente(document);
                    factura.setCliente(cliente);

                    // Obtener y establecer Cajero
                    Cajero cajero = obtenerCajero(document);
                    factura.setCajero(cajero);

                    // Obtener y establecer Venta
                    Venta venta = obtenerVenta(document);
                    //factura.setVenta(venta);

                    // Agregar factura a la lista
                    listaFacturas.add(factura);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaFacturas;
    }

    private Cliente obtenerCliente(Document document) {
        NodeList clientes = document.getElementsByTagName("Cliente");
        if (clientes.getLength() > 0) {
            Element clienteElement = (Element) clientes.item(0);
            Cliente cliente = new Cliente();
            cliente.setCedula(clienteElement.getAttribute("cedula"));
            cliente.setNombre(clienteElement.getElementsByTagName("nombre").item(0).getTextContent());
            cliente.setTelefono(clienteElement.getElementsByTagName("telefono").item(0).getTextContent());
            cliente.setCorreo(clienteElement.getElementsByTagName("correo").item(0).getTextContent());
            cliente.setDescuento(Double.parseDouble(clienteElement.getElementsByTagName("descuento").item(0).getTextContent()));
            return cliente;
        }
        return null;
    }

    private Cajero obtenerCajero(Document document) {
        NodeList cajeros = document.getElementsByTagName("Cajero");
        if (cajeros.getLength() > 0) {
            Element cajeroElement = (Element) cajeros.item(0);
            Cajero cajero = new Cajero();
            cajero.setCedula(cajeroElement.getAttribute("cedula"));
            cajero.setNombre(cajeroElement.getElementsByTagName("nombre").item(0).getTextContent());
            return cajero;
        }
        return null;
    }

    private Venta obtenerVenta(Document document) {
        NodeList ventas = document.getElementsByTagName("Venta");
        if (ventas.getLength() > 0) {
            Element ventaElement = (Element) ventas.item(0);
            Venta venta = new Venta();
            venta.setCodigoVenta(ventaElement.getAttribute("codigoventa"));
            venta.setContProducto(Integer.parseInt(ventaElement.getElementsByTagName("contProducto").item(0).getTextContent()));

            // Procesar los productos
            NodeList productos = document.getElementsByTagName("Producto");
            int contador = venta.getContProducto();
            for (int i = 0; i < contador; i++) {
                
                Node productoNode = productos.item(i);
                
                if (productoNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element productoElement = (Element) productoNode;
                    Producto producto = new Producto();
                    producto.setCodigo(productoElement.getAttribute("codigo"));
                    producto.setDescripcion(productoElement.getElementsByTagName("descripcion").item(0).getTextContent());
                    producto.setUnidad_m(productoElement.getElementsByTagName("unidad_m").item(0).getTextContent());
                    producto.setPrecio(Double.parseDouble(productoElement.getElementsByTagName("precio").item(0).getTextContent()));
                    producto.setDescuento(Float.parseFloat(productoElement.getElementsByTagName("descuento").item(0).getTextContent()));
                    producto.setExistencia(Integer.parseInt(productoElement.getElementsByTagName("existencia").item(0).getTextContent()));
                    producto.setCategoria(productoElement.getElementsByTagName("categoria").item(0).getTextContent());
                    
                    NodeList decoradores = document.getElementsByTagName("DecoradorProducto");
                    Node decoradorNode = decoradores.item(i);
                    
                        Element decoradorElement = (Element) decoradorNode;
                        String cantidadStr = decoradorElement.getAttribute("cantidad");
                        int cantidad = Integer.parseInt(cantidadStr);
            
                         // Agregar el producto a la venta con la cantidad
                         
                        venta.agregarCarrito(producto, cantidad);
                    
                    
                }
            }
            return venta;
        }
        return null;
    }
    
    public Factura buscarListaFactura(String num, String archivoXML) {
    LogicaCliente logCliente = new LogicaCliente();
    LogicaCajero logCajero = new LogicaCajero();
    LogicaVenta logVenta = new LogicaVenta();
    String numFactura;
    String hora;
    String fecha;
    Cliente cliente;
    Cajero cajero;
    Venta venta;
    Factura factura = new Factura();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Factura");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    numFactura = element.getAttribute("numFactura");

                    if (numFactura.equals(num)) {
                        hora = element.getElementsByTagName("hora").item(0).getTextContent();
                        fecha = element.getElementsByTagName("fecha").item(0).getTextContent();
                        cliente = logCliente.buscarCliente(element.getElementsByTagName("cedula").item(0).getTextContent(), archivoXML);
                        cajero = logCajero.buscarCajeroPorCedula(element.getElementsByTagName("cedula").item(0).getTextContent(), archivoXML);
                        venta = logVenta.buscarVentaPorCodigo(element.getAttribute("codigoVenta"), archivoXML);
                        factura.setHora(hora);
                        factura.setFecha(fecha);
                        factura.setCliente(cliente);
                        factura.setCajero(cajero);
//                        factura.setVenta(venta);
                        
                        return factura;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     
    public List<Factura> buscarFacturas(String archivoXML) {
        List<Factura> listaFacturas = new ArrayList<>();
        LogicaCliente logCliente = new LogicaCliente();
        LogicaCajero logCajero = new LogicaCajero();
        LogicaVenta logVenta = new LogicaVenta();

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Factura");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    Factura factura = new Factura(); //tiene que crearse nuevo objeto en ciclo 
                    factura.setNumFactura(element.getAttribute("numFactura"));
                    factura.setFecha(element.getElementsByTagName("fecha").item(0).getTextContent());
                    factura.setHora(element.getElementsByTagName("hora").item(0).getTextContent());
                    factura.setCliente(logCliente.buscarCliente(element.getElementsByTagName("cedula").item(0).getTextContent(), archivoXML));
                    factura.setCajero(logCajero.buscarCajeroPorCedula(element.getElementsByTagName("cedula").item(0).getTextContent(), archivoXML));
//                    factura.setVenta(logVenta.buscarVentaPorCodigo(element.getElementsByTagName("codigoVenta").item(0).getTextContent(), archivoXML));
                    
                    listaFacturas.add(factura);
                    
                }
            }
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaFacturas;
    }

}
