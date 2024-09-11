/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Producto;
import Exepciones.ExcepcionExiste;
import Exepciones.ExcepcionNoExiste;
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
public class LogicaProducto {

    public LogicaProducto() {
    }
    
    private boolean escribirProductoXML(Producto producto) {
        FilesXML filesXML = new FilesXML();
        try {
            filesXML.writeXML("productos", "Producto", producto.getDatosProducto(), producto.getDatos());
            return true;
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean agregarProducto(Producto nuevo, List<Producto> listaProductos) throws ExcepcionExiste {
        if (buscarPorCodigo(nuevo.getCodigo(), listaProductos).isPresent()) {
            throw new ExcepcionExiste();
        }
        listaProductos.add(nuevo);

        return escribirProductoXML(nuevo);
    }
    
    public Optional<Producto> buscarPorCodigo(String cod, List<Producto> listaProductos) {
        return listaProductos.stream()
                .filter(producto -> producto.getCodigo().equals(cod))
                .findFirst();
    }
    
    public Optional<Producto> buscarPorDescripcion(String descripcion, List<Producto> listaProductos) {
         
        return listaProductos.stream()
                .filter(producto -> producto.getDescripcion().equalsIgnoreCase(descripcion))
                .findFirst();
    }
    
    public Producto buscarProducto(String cod, String archivoXML){
        String codigo;
        String descripcion;
        String unidad_m;
        double precio;
        float descuento;
        int existencia;
        String categoria;
        
        Producto producto = new Producto();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Producto");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    codigo = element.getAttribute("codigo");

                    if (codigo.equals(cod)) {
                    	
                    	descripcion = element.getElementsByTagName("descripcion").item(0).getTextContent();
                        unidad_m = element.getElementsByTagName("unidad_m").item(0).getTextContent();
                        precio = Double.parseDouble(element.getElementsByTagName("precio").item(0).getTextContent());
                        descuento = Float.parseFloat(element.getElementsByTagName("descuento").item(0).getTextContent());
                        existencia = Integer.parseInt(element.getElementsByTagName("existencia").item(0).getTextContent());
                        categoria = element.getElementsByTagName("categoria").item(0).getTextContent();
                        
                        producto.setDescripcion(descripcion);
                        producto.setUnidad_m(unidad_m);
                        producto.setPrecio(precio);
                        producto.setDescuento(descuento);
                        producto.setExistencia(existencia);
                        producto.setCategoria(categoria);
                        
                        return producto;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
    public List<Producto> buscarListaProductos(String archivoXML) {
        List<Producto> listaProductos = new ArrayList<>();

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXML);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("Producto");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    Producto producto = new Producto();
                    producto.setCodigo(element.getAttribute("codigo"));
                    producto.setDescripcion(element.getElementsByTagName("descripcion").item(0).getTextContent());
                    producto.setUnidad_m(element.getElementsByTagName("unidad_m").item(0).getTextContent());
                    producto.setPrecio(Double.parseDouble(element.getElementsByTagName("precio").item(0).getTextContent()));
                    producto.setDescuento(Float.parseFloat(element.getElementsByTagName("descuento").item(0).getTextContent()));
                    producto.setExistencia(Integer.parseInt(element.getElementsByTagName("existencia").item(0).getTextContent()));
                    producto.setCategoria(element.getElementsByTagName("categoria").item(0).getTextContent());
                    
                    listaProductos.add(producto);
                }
            }
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProductos;
    }

    public List<Producto> eliminarProducto(List<Producto> listActual, String codigo) throws ExcepcionNoExiste{
         if (!buscarPorCodigo(codigo, listActual).isPresent()) {
            throw new ExcepcionNoExiste();
        }
        int index = -1;
        Producto producto = new Producto();

        for (int i = 0; i < listActual.size(); i++) {
				
			producto = listActual.get(i);
			if (producto.getCodigo().equals(codigo)) {
				index = i;
				break;
			}
		}
		
        if (index != -1) {
        	listActual.remove(index);
		} 
        
        return listActual;
    }
    
   /* public String[] getRegisteredModels(ArrayList<Model> models) {
        ArrayList<String> regModels = new ArrayList<>();

        regModels.add("Ninguno");
        for (Model m : models) {
        	regModels.add(m.getName());
        }

        return regModels.toArray(new String[0]);
    }*/
    private void eliminarProductoDeXML(String cod) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("productos"));
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Producto");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;


                    if (element.getAttribute("codigo").equals(cod)) {

                        element.getParentNode().removeChild(element);
                        break;
                    }
                }
            }
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("productos"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public boolean modificarProducto(Producto nuevo, List<Producto> listaProductos) throws ExcepcionNoExiste {
     Optional<Producto> productoOpt = buscarPorCodigo(nuevo.getCodigo(), listaProductos);
        if (productoOpt.isPresent()) {
            Producto producto = productoOpt.get();
            producto.setDescripcion(nuevo.getDescripcion());
            producto.setUnidad_m(nuevo.getUnidad_m());
            producto.setPrecio(nuevo.getPrecio());
            producto.setDescuento(nuevo.getDescuento());
            producto.setExistencia(nuevo.getExistencia());
            producto.setCategoria(nuevo.getCategoria());
            
            eliminarProductoDeXML(nuevo.getCodigo());
            FilesXML filesXML = new FilesXML();
        
            try {
                filesXML.writeXML("productos", "Producto", nuevo.getDatosProducto(), producto.getDatos());
            } catch (TransformerException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
        throw new ExcepcionNoExiste();
        
    }
     public List<Producto> modificarProductoLista(List<Producto> listActual, Producto nuevo) throws ExcepcionNoExiste{
         if (!buscarPorCodigo(nuevo.getCodigo(), listActual).isPresent()) {
            throw new ExcepcionNoExiste();
        }
        int index = -1;
        Producto producto = new Producto();

        for (int i = 0; i < listActual.size(); i++) {
				
			producto = listActual.get(i);
			if (producto.getCodigo().equals(nuevo.getCodigo())) {
				index = i;
				break;
			}
		}
		
        if (index != -1) {
			listActual.set(index, nuevo);
		} 
        
        return listActual;
    }
    
}
