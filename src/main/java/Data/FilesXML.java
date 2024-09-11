
package Data;
import Domain.Cajero;
import Domain.Producto;
import Domain.Cliente;
import Domain.Factura;
import Domain.MetodoPago;
import Domain.Venta;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class FilesXML {
    
    public FilesXML(){
    }
    
    public void createXML(String objectName,String fileName) {

        File file = new File(fileName);

	if(!file.exists()) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.newDocument();

			Element rootElement = doc.createElement(objectName);
			doc.appendChild(rootElement);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);

		}catch(Exception e) {
			e.printStackTrace();
            }
	}
    }
    
    public void writeXML(String FileName, String elementType, String[] dataName, String[] data) throws TransformerException {

            try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse(new File(FileName));
			doc.getDocumentElement().normalize();

			Element rootElement  =  doc.getDocumentElement();

			Element ele = doc.createElement(elementType);
			rootElement.appendChild(ele);

			Attr attr = doc.createAttribute(dataName[0]);
			attr.setValue(data[0]);
			ele.setAttributeNode(attr);

			for(int i = 1; i < data.length; i++){

				Element dato = doc.createElement(dataName[i]);

				dato.appendChild(doc.createTextNode(data[i]));

				ele.appendChild(dato);
			}

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File(FileName));
			transformer.transform(source, result);

		}catch(ParserConfigurationException pce) {

			pce.printStackTrace();

		}catch (SAXException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (TransformerConfigurationException e) {

			e.printStackTrace();
		} catch (TransformerException e) {

			e.printStackTrace();
		}
	}

    public void deleteXML(String fileName) {
        File file = new File(fileName);
        
        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
               
            } else {
                
            }
        } else {
            
        }
    }
    
   
public static List<Cliente> cargarDatosClientes(String fileName) {
	List<Cliente> clientes = new ArrayList<>();

	try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document doc = dBuilder.parse(new File(fileName));
		doc.getDocumentElement().normalize();

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
				clientes.add(cliente);
			}
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return clientes;
}

	public static List<Cajero> cargarDatosCajeros(String fileName) {
		List<Cajero> cajeros = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(new File(fileName));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("Cajero");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					String id = element.getAttribute("cedula");
					String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();

					Cajero cajero = new Cajero(id, nombre);
					cajeros.add(cajero);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cajeros;
	}
	public static List<Factura> cargarDatosFacturas(String fileName, List<Cliente> clientes, List<Cajero> cajeros, List<Venta> ventas) {
		List<Factura> facturas = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(new File(fileName));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("Factura");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					int numFactura = Integer.parseInt(element.getAttribute("numFactura"));
					String hora = element.getElementsByTagName("hora").item(0).getTextContent();
					String fecha = element.getElementsByTagName("fecha").item(0).getTextContent();

					Cliente cliente = obtenerClientePorId(element.getElementsByTagName("clienteId").item(0).getTextContent(), clientes);
					Cajero cajero = obtenerCajeroPorId(element.getElementsByTagName("cajeroId").item(0).getTextContent(), cajeros);
					Venta venta = obtenerVentaPorCodigo(element.getElementsByTagName("codigoVenta").item(0).getTextContent(), ventas);

					Factura factura = new Factura(cliente, cajero, venta);
					facturas.add(factura);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return facturas;
	}

	private static Cliente obtenerClientePorId(String id, List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(id)) {
				return cliente;
			}
		}
		return null;
	}

	private static Cajero obtenerCajeroPorId(String id, List<Cajero> cajeros) {
		for (Cajero cajero : cajeros) {
			if (cajero.getCedula().equals(id)) {
				return cajero;
			}
		}
		return null;
	}
        
        /*private static Venta obtenerVentaPorFactura(String num, List<Factura> facturas){
            for(Factura factura: facturas){
                if(factura.getNumFactura().equals(num))
                    return factura.getVenta();
            }
            return null;
        }*/

	private static Venta obtenerVentaPorCodigo(String cod, List<Venta> ventas) {
		for (Venta venta : ventas) {
			if (venta.getCodigoVenta().equals(cod)) {
				return venta;
			}
		}
		return null;
	}
	public List<Venta> cargarDatosVentas(String fileName, List<Producto> productos) {
		List<Venta> ventas = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(new File(fileName));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("Venta");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					String cod = element.getAttribute("codigoVenta");
					Venta venta = new Venta(cod);

					NodeList productosNodeList = element.getElementsByTagName("Producto");
					for (int j = 0; j < productosNodeList.getLength(); j++) {
						Element productoElement = (Element) productosNodeList.item(j);

						String codigo = productoElement.getElementsByTagName("codigo").item(0).getTextContent();
						int cantidad = Integer.parseInt(productoElement.getElementsByTagName("cantidad").item(0).getTextContent());

						Producto producto = obtenerProductoPorCodigo(codigo, productos);
						if (producto != null) {
							venta.agregarCarrito(producto, cantidad);
						}
					}

					ventas.add(venta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ventas;
	}
/*
        public List<MetodoPago> cargarPagos(String fileName) {
		List<MetodoPago> pagos = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(new File(fileName));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("MetodoPago");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					String metodo = element.getAttribute("metodo");
                                        double monto = Double.parseDouble(element.getElementsByTagName("monto").item(0).getTextContent());
					String unidad_m = element.getElementsByTagName("unidad_m").item(0).getTextContent();
					Venta venta = new Venta(cod);

					NodeList productosNodeList = element.getElementsByTagName("Producto");
					for (int j = 0; j < productosNodeList.getLength(); j++) {
						Element productoElement = (Element) productosNodeList.item(j);

						String codigo = productoElement.getElementsByTagName("codigo").item(0).getTextContent();
						int cantidad = Integer.parseInt(productoElement.getElementsByTagName("cantidad").item(0).getTextContent());

						Producto producto = obtenerProductoPorCodigo(codigo, productos);
						if (producto != null) {
							venta.agregarCarrito(producto, cantidad);
						}
					}

					ventas.add(venta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ventas;
	}
*/
	private Producto obtenerProductoPorCodigo(String codigo, List<Producto> productos) {
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo)) {
				return producto;
			}
		}
		return null;
	}
	public static List<Producto> cargarDatosProductos(String fileName) {
		List<Producto> productos = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(new File(fileName));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("Producto");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					String codigo = element.getAttribute("codigo");
					String descripcion = element.getElementsByTagName("descripcion").item(0).getTextContent();
					String unidad_m = element.getElementsByTagName("unidad_m").item(0).getTextContent();
					double precio = Double.parseDouble(element.getElementsByTagName("precio").item(0).getTextContent());
					float descuento = Float.parseFloat(element.getElementsByTagName("descuento").item(0).getTextContent());
					int existencia = Integer.parseInt(element.getElementsByTagName("existencia").item(0).getTextContent());
					String categoria = element.getElementsByTagName("categoria").item(0).getTextContent();

					Producto producto = new Producto(codigo, descripcion, unidad_m, precio, descuento, existencia, categoria);
					productos.add(producto);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return productos;
	}
        
        public void escribirCajeroXML(String fileName, List<Cajero> lista) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(fileName));
            doc.getDocumentElement().normalize();

            Element rootElement = doc.getDocumentElement();

            for (Cajero u : lista) {
                Element ele = doc.createElement("Cajero");
                rootElement.appendChild(ele);

                Attr attr = doc.createAttribute(u.getDatosCajero()[0]);
                attr.setValue(u.getDatos()[0]);
                ele.setAttributeNode(attr);

                for (int i = 1; i < u.getDatos().length; i++) {
                    Element dato = doc.createElement(u.getDatosCajero()[i]);
                    dato.appendChild(doc.createTextNode(u.getDatos()[i]));
                    ele.appendChild(dato);
                }
            }

         
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);

            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
            
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
    
}


