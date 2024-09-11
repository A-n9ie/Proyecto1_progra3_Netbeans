/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Cliente;
import Exepciones.ExcepcionDescuento;
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

/**
 *
 * @author angie
 */
public class LogicaCliente {

    public LogicaCliente() {}
   
    public boolean agregarClienteLista(Cliente cliente, List<Cliente> listaClientes) throws ExcepcionExiste, ExcepcionDescuento, ExcepcionVacio {
        if (consultarCliente(cliente.getCedula(), listaClientes).isPresent()) {
            throw new ExcepcionExiste();
        }

        if (cliente.getDescuento() < 0 || cliente.getDescuento() > 100) {
            throw new ExcepcionDescuento();
        }

        listaClientes.add(cliente);

        FilesXML filesXML = new FilesXML();
        //String[] dataName = {"id", "nombre", "telefono", "email", "descuento"};
        //String[] data = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), String.valueOf(cliente.getDescuento())};
        try {
            filesXML.writeXML("clientes", "Cliente", cliente.getDatosCliente(), cliente.getDatos());
        } catch (TransformerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Optional<Cliente> buscarPorCedula(String id, List<Cliente> listaClientes) throws ExcepcionVacio {
        if (id == null || id.isEmpty()) {
        throw new ExcepcionVacio();
    }
        return listaClientes.stream()
                .filter(cliente -> cliente.getCedula().equals(id))
                .findFirst();
    }
    
    public Optional<Cliente> buscarPorNombre(String nom, List<Cliente> listaClientes) throws ExcepcionVacio {
         if (nom == null || nom.isEmpty()) {
        throw new ExcepcionVacio();
    }
        return listaClientes.stream()
                .filter(cliente -> cliente.getNombre().equalsIgnoreCase(nom))
                .findFirst();
    }
    
    public Cliente buscarCliente(String cedula, String archivoXML)throws ExcepcionNoExiste{
        String id;
        String name;
        String email;
        String phone;
        String discount;
        Cliente cliente = new Cliente();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    id = element.getAttribute("cedula");

                    if (id.equals(cedula)) {
                        name = element.getElementsByTagName("nombre").item(0).getTextContent();
                        email = element.getElementsByTagName("correo").item(0).getTextContent();
                        phone = element.getElementsByTagName("telefono").item(0).getTextContent();
                        discount = element.getElementsByTagName("descuento").item(0).getTextContent();
                        
                        cliente.setNombre(name);
                        cliente.setCorreo(email);
                        cliente.setTelefono(phone);
                        cliente.setDescuento(Double.parseDouble(discount));
                        
                        return cliente;
                    }
                }
            }
            throw new ExcepcionNoExiste();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Cliente> buscarListaClientes(String archivoXML) {
       List<Cliente> listaClientes = new ArrayList<>();

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    Cliente cliente = new Cliente(); //tiene que crearse nuevo objeto en ciclo
                    cliente.setCedula(element.getAttribute("cedula"));
                    cliente.setNombre(element.getElementsByTagName("nombre").item(0).getTextContent());
                    cliente.setCorreo(element.getElementsByTagName("correo").item(0).getTextContent());
                    cliente.setTelefono(element.getElementsByTagName("telefono").item(0).getTextContent());
                    cliente.setDescuento(Double.parseDouble(element.getElementsByTagName("descuento").item(0).getTextContent()));
                    listaClientes.add(cliente);
                    
                }
            }
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaClientes;
    }

    public List<Cliente> cambiarCliente(List<Cliente> listActual, Cliente nuevoCliente){
        int index = -1;
        Cliente cliente  = new Cliente();
        
        for (int i = 0; i < listActual.size(); i++) {
				
			cliente = listActual.get(i);
			if (cliente.getCedula().equals(nuevoCliente.getCedula())) {
				index = i;
				break;
			}
		}
		
        if (index != -1) {
			listActual.set(index, nuevoCliente);
		} 
        
        return listActual;
    }

    
    public Optional<Cliente> consultarCliente(String id, List<Cliente> listaClientes) throws ExcepcionVacio {

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
            Document doc = dBuilder.parse(new File("clientes"));
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    if (element.getAttribute("cedula").equals(id)) {
                        String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                        String telefono = element.getElementsByTagName("telefono").item(0).getTextContent();
                        String email = element.getElementsByTagName("correo").item(0).getTextContent();
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
    
    public List<Cliente> eliminarCliente2(List<Cliente> listActual, String cedula){
        int index = -1;
        Cliente cliente = new Cliente();

        for (int i = 0; i < listActual.size(); i++) {
				
			cliente = listActual.get(i);
			if (cliente.getCedula().equals(cedula)) {
				index = i;
				break;
			}
		}
		
        if (index != -1) {
			listActual.remove(index);
		} 
        
        return listActual;
    }
    
    public boolean eliminarCliente(String id, List<Cliente> listaClientes) throws ExcepcionNoExiste, ExcepcionVacio {
        Optional<Cliente> clienteOpt = consultarCliente(id, listaClientes);

        if (!clienteOpt.isPresent()) {
            throw new ExcepcionNoExiste();
        }
        listaClientes.remove(clienteOpt.get());

        eliminarClienteDeXML(id);
        return true;
    }
    
    private void eliminarClienteDeXML(String id) {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("clientes"));
            doc.getDocumentElement().normalize();


            NodeList nodeList = doc.getElementsByTagName("Cliente");


            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;


                    if (element.getAttribute("cedula").equals(id)) {

                        element.getParentNode().removeChild(element);
                        break;
                    }
                }
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("clientes"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public boolean modificarCliente(Cliente nuevo, List<Cliente> listaClientes) throws ExcepcionVacio, ExcepcionDescuento {
        Optional<Cliente> clienteOpt = consultarCliente(nuevo.getCedula(), listaClientes);
        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            cliente.setNombre(nuevo.getNombre());
            cliente.setTelefono(nuevo.getTelefono());
            cliente.setCorreo(nuevo.getCorreo());
            cliente.setDescuento(nuevo.getDescuento());


            eliminarClienteDeXML(nuevo.getCedula());


            FilesXML filesXML = new FilesXML();
            //String[] dataName = {"id", "nombre", "telefono", "email", "descuento"};
            //String[] data = {cliente.getCedula(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), String.valueOf(cliente.getDescuento())};
            try {
                filesXML.writeXML("clientes", "Cliente", cliente.getDatosCliente(), cliente.getDatos());
            } 
            catch (TransformerException e) {
                e.printStackTrace();
                return false;
            }

            return true;
        }
        return false;
    } 
    
    public List<Cliente> listarClientes() {
        FilesXML filesXML = new FilesXML();
        List<Cliente> listaClientes = new ArrayList<>();


        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("clientes"));

            NodeList nodeList = doc.getElementsByTagName("Cliente");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("cedula");
                    String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                    String telefono = element.getElementsByTagName("telefono").item(0).getTextContent();
                    String email = element.getElementsByTagName("correo").item(0).getTextContent();
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
}
    