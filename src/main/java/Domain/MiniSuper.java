/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import Exepciones.ExcepcionNoExiste;
import Exepciones.ExcepcionValor;
import Exepciones.ExcepcionVacio;
import Exepciones.ExcepcionExiste;
import Exepciones.ExcepcionIdentificador;
import Data.FilesXML;
/**
 * 
 *
 * @author angie
 */

import javax.xml.transform.TransformerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MiniSuper {
    private List<Cliente> listaClientes;
    private List<Cajero> listaCajeros;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;
    private FilesXML filesXML;
    
    public MiniSuper() {
        this.listaClientes = new ArrayList<>();
        this.listaCajeros = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaFacturas = new ArrayList<>();
        this.filesXML = new FilesXML();
        //cargarDatosDesdeXML();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Cajero> getListaCajeros() {
        return listaCajeros;
    }

    public void setListaCajeros(List<Cajero> listaCajeros) {
        this.listaCajeros = listaCajeros;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }


    /*Gestion de clientes*/
/*
    public boolean agregarCliente(Cliente cliente) throws ExcepcionExiste, ExcepcionValor, ExcepcionVacio {
        if (consultarCliente(cliente.getCedula()).isPresent()) {
            throw new ExcepcionExiste();
        }


        if (cliente.getDescuento() < 0 || cliente.getDescuento() > 100) {
            throw new ExcepcionValor();
        }

        listaClientes.add(cliente);


        FilesXML filesXML = new FilesXML();
        String[] dataName = {"id", "nombre", "telefono", "email", "descuento"};
        String[] data = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), String.valueOf(cliente.getDescuento())};
        try {
            filesXML.writeXML("clientes.xml", "Cliente", dataName, data);
        } catch (TransformerException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean modificarCliente(String id, String nuevoNombre, String nuevoTelefono, String nuevoEmail, double nuevoDescuento) throws ExcepcionIdentificador, ExcepcionValor {
        Optional<Cliente> clienteOpt = consultarCliente(id);
        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            cliente.setNombre(nuevoNombre);
            cliente.setTelefono(nuevoTelefono);
            cliente.setCorreo(nuevoEmail);
            cliente.setDescuento(nuevoDescuento);


            eliminarClienteDeXML(id);


            FilesXML filesXML = new FilesXML();
            String[] dataName = {"id", "nombre", "telefono", "email", "descuento"};
            String[] data = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), String.valueOf(cliente.getDescuento())};
            try {
                filesXML.writeXML("clientes.xml", "Cliente", dataName, data);
            } catch (TransformerException e) {
                e.printStackTrace();
                return false;
            }

            return true;
        }
        return false;
    }

    private void eliminarClienteDeXML(String id) {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("clientes.xml"));
            doc.getDocumentElement().normalize();


            NodeList nodeList = doc.getElementsByTagName("Cliente");


            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;


                    if (element.getAttribute("id").equals(id)) {

                        element.getParentNode().removeChild(element);
                        break;
                    }
                }
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("clientes.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean eliminarCliente(String id) throws ExcepcionIdentificador, ExcepcionNoExiste {
        Optional<Cliente> clienteOpt = consultarCliente(id);

        if (!clienteOpt.isPresent()) {
            throw new ExcepcionNoExiste();
        }


        listaClientes.remove(clienteOpt.get());


        eliminarClienteDeXML(id);

        return true;
    }

public Optional<Cliente> consultarCliente(String id) throws ExcepcionVacio {

    if (id == null || id.isEmpty()) {
        throw new ExcepcionVacio();
    }


    Optional<Cliente> clienteOpt = listaClientes.stream()
            .filter(cliente -> cliente.getCedula().equals(id))
            .findFirst();

    if (clienteOpt.isPresent()) {
        return clienteOpt;
    } else {

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("clientes.xml"));
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    if (element.getAttribute("id").equals(id)) {
                        String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                        String telefono = element.getElementsByTagName("telefono").item(0).getTextContent();
                        String email = element.getElementsByTagName("email").item(0).getTextContent();
                        double descuento = Double.parseDouble(element.getElementsByTagName("descuento").item(0).getTextContent());

                        Cliente cliente = new Cliente(email, telefono, descuento, id, nombre);
                        return Optional.of(cliente);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    return Optional.empty();
}

    public List<Cliente> listarClientes() {
        FilesXML filesXML = new FilesXML();
        listaClientes.clear();


        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("clientes.xml"));

            NodeList nodeList = doc.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("id");
                    String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                    String telefono = element.getElementsByTagName("telefono").item(0).getTextContent();
                    String email = element.getElementsByTagName("email").item(0).getTextContent();
                    double descuento = Double.parseDouble(element.getElementsByTagName("descuento").item(0).getTextContent());

                    Cliente cliente = new Cliente(email, telefono, descuento, id, nombre);
                    listaClientes.add(cliente);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaClientes;
    }

    /*Gestion de cajeros*/
    /*
    public Optional<Cajero> buscarPorId(String id) {
        return listaCajeros.stream()
                .filter(cajero -> cajero.getCedula().equals(id))
                .findFirst();
    }

    public Optional<Cajero> buscarPorNombre(String nombre) {
        return listaCajeros.stream()
                .filter(cajero -> cajero.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }

    public void agregarCajero(Cajero nuevoCajero) throws ExcepcionExiste {
        if (buscarPorId(nuevoCajero.getCedula()).isPresent()) {
            throw new ExcepcionExiste();
        }
        listaCajeros.add(nuevoCajero);
        escribirCajeroXML(nuevoCajero);
    }

    public boolean modificarCajero(String id, String nuevoNombre) throws ExcepcionNoExiste {
        Optional<Cajero> cajeroOpt = buscarPorId(id);
        if (cajeroOpt.isPresent()) {
            Cajero cajero = cajeroOpt.get();
            cajero.setNombre(nuevoNombre);
            eliminarCajeroDeXML(id);
            escribirCajeroXML(cajero);
            return true;
        }
        throw new ExcepcionNoExiste();
    }

    public boolean eliminarCajero(String id) throws ExcepcionNoExiste {
        Optional<Cajero> cajeroOpt = buscarPorId(id);
        if (cajeroOpt.isPresent()) {
            listaCajeros.remove(cajeroOpt.get());
            eliminarCajeroDeXML(id);
            return true;
        }
        throw new ExcepcionNoExiste();
    }

    public List<Cajero> listarCajeros() {
        listaCajeros.clear();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("cajeros.xml"));

            NodeList nodeList = doc.getElementsByTagName("Cajero");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("id");
                    String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();

                    Cajero cajero = new Cajero(id, nombre);
                    listaCajeros.add(cajero);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCajeros;
    }

    private void escribirCajeroXML(Cajero cajero) {
        String[] dataName = {"id", "nombre"};
        String[] data = {cajero.getCedula(), cajero.getNombre()};
        try {
            filesXML.writeXML("cajeros.xml", "Cajero", dataName, data);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    private void eliminarCajeroDeXML(String id) {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("cajeros.xml"));
            doc.getDocumentElement().normalize();


            NodeList nodeList = doc.getElementsByTagName("Cajero");


            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;


                    if (element.getAttribute("id").equals(id)) {

                        element.getParentNode().removeChild(element);
                        break;
                    }
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("cajeros.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


private void cargarDatosDesdeXML() {

    listaClientes = filesXML.cargarDatosClientes("clientes.xml");


    listaCajeros = filesXML.cargarDatosCajeros("cajeros.xml");


    listaProductos = filesXML.cargarDatosProductos("productos.xml");


    List<Venta> ventas = filesXML.cargarDatosVentas("ventas.xml", listaProductos);

    listaFacturas = filesXML.cargarDatosFacturas("facturas.xml", listaClientes, listaCajeros, ventas);
    }
*/
}