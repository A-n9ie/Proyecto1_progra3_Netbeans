/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Cajero;
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

public class LogicaCajero {

    public LogicaCajero() {
    }
    
     public boolean agregarCajero(Cajero nuevoCajero, List<Cajero> listaCajeros) throws ExcepcionExiste, ExcepcionVacio {
        if (buscarPorCedula(nuevoCajero.getCedula(), listaCajeros).isPresent()) {
            throw new ExcepcionExiste();
        }
        listaCajeros.add(nuevoCajero);

        FilesXML filesXML = new FilesXML();
        try {
            filesXML.writeXML("cajeros", "Cajero", nuevoCajero.getDatosCajero(), nuevoCajero.getDatos());
        } catch (TransformerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
     
     public Cajero buscarCajeroPorCedula(String cedula, String archivoXML)throws ExcepcionNoExiste{
        String id;
        String name;
        Cajero cajero = new Cajero();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Cajero");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    id = element.getAttribute("cedula");

                    if (id.equals(cedula)) {
                        name = element.getElementsByTagName("nombre").item(0).getTextContent();
                        
                        cajero.setNombre(name);
                        
                        return cajero;
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
     
     public Optional<Cajero> buscarPorCedula(String id, List<Cajero> listaCajeros) throws ExcepcionVacio {
        if (id == null || id.isEmpty()) {
        throw new ExcepcionVacio();
        }
        return listaCajeros.stream()
                .filter(cajero -> cajero.getCedula().equals(id))
                .findFirst();
    }

    public Optional<Cajero> buscarPorNombre(String nombre, List<Cajero> listaCajeros) throws ExcepcionVacio {
        if (nombre == null || nombre.isEmpty()) {
        throw new ExcepcionVacio();
    }
        return listaCajeros.stream()
                .filter(cajero -> cajero.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
    
    public List<Cajero> buscarListaCajero(String archivoXML) {
       List<Cajero> listaCajeros = new ArrayList<>();

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Cajero");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    Cajero cajero = new Cajero(); //tiene que crearse nuevo objeto en ciclo
                    cajero.setCedula(element.getAttribute("cedula"));
                    cajero.setNombre(element.getElementsByTagName("nombre").item(0).getTextContent());
                    listaCajeros.add(cajero);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCajeros;
    }
    
    public boolean eliminarCajero(String id, List<Cajero> listaCajeros) throws ExcepcionNoExiste, ExcepcionVacio {
        Optional<Cajero> cajeroOpt = buscarPorCedula(id, listaCajeros);
        if (cajeroOpt.isPresent()) {
            listaCajeros.remove(cajeroOpt.get());
            eliminarCajeroDeXML(id);
            return true;
        }
        throw new ExcepcionNoExiste();
    }
    
    private void eliminarCajeroDeXML(String id) {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("cajeros"));
            doc.getDocumentElement().normalize();


            NodeList nodeList = doc.getElementsByTagName("Cajero");


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
            StreamResult result = new StreamResult(new File("cajeros"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*private void escribirCajeroXML(Cajero cajero) {
        FilesXML filesXML = new FilesXML(); //
        //String[] dataName = {"id", "nombre"};
        //String[] data = {cajero.getCedula(), cajero.getNombre()};
        try {
            filesXML.writeXML("cajeros.xml", "Cajero", cajero.datosCajero(), cajero.datos());
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }*/
    
    public List<Cajero> listarCajeros() {
        List<Cajero> listaCajeros = new ArrayList<>();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("cajeros"));

            NodeList nodeList = doc.getElementsByTagName("Cajero");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("cedula");
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
    
    public boolean modificarCajero(Cajero nuevo, List<Cajero> listaCajeros) throws ExcepcionNoExiste, ExcepcionVacio {
        Optional<Cajero> cajeroOpt = buscarPorCedula(nuevo.getCedula(), listaCajeros);
        if (cajeroOpt.isPresent()) {
            Cajero cajero = cajeroOpt.get();
            cajero.setNombre(nuevo.getNombre());
            eliminarCajeroDeXML(nuevo.getCedula());
           FilesXML filesXML = new FilesXML();
        
            try {
                filesXML.writeXML("cajeros", "Cajero", cajero.getDatosCajero(), cajero.getDatos());
            } catch (TransformerException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
        throw new ExcepcionNoExiste();
    }
}
