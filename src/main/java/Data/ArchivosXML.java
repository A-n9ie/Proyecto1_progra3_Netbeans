/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Cajero;
import Domain.Categoria;
import Domain.Cliente;
import Domain.Factura;
import Domain.Producto;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

import java.io.StringReader;
import java.io.StringWriter;

public class ArchivosXML {
    private static String fileCategorias = "categorias.xml";
    private static String fileProductos = "productos.xml";
    private static String fileCajeros = "cajeros.xml";
    private static String fileClientes = "clientes.xml";
    private static String fileFacturas = "facturas.xml";

    public static String getFileCategorias() {
        return fileCategorias;
    }

    public static String getFileProductos() {
        return fileProductos;
    }

    public static String getFileCajeros() {
        return fileCajeros;
    }

    public static String getFileClientes() {
        return fileClientes;
    }

    public static String getFileFacturas() {
        return fileFacturas;
    }
    
    public static void guardarCategorias(List<Categoria> categorias) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(ListaCategorias.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    ListaCategorias categoriasWrapper = new ListaCategorias();
    categoriasWrapper.setListaCategorias(categorias);

    marshaller.marshal(categoriasWrapper, new File(fileCategorias));
    }

    public static void guardarProductos(List<Producto> productos) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaProductos.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        ListaProductos productosWrapper = new ListaProductos();
        productosWrapper.setListaProductos(productos);

        marshaller.marshal(productosWrapper, new File(fileProductos));
    }
    
    public static void guardarClientes(List<Cliente> clientes) throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaClientes.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    ListaClientes clientesWrapper = new ListaClientes();
    clientesWrapper.setListaClientes(clientes);

    marshaller.marshal(clientesWrapper, new File("clientes.xml"));
    }
    
    public static void guardarCajeros(List<Cajero> cajeros) throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaCajeros.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    ListaCajeros cajerosWrapper = new ListaCajeros();
    cajerosWrapper.setListaCajeros(cajeros);

    marshaller.marshal(cajerosWrapper, new File(fileCajeros));
    }
    
    public static void guardarFacturas(List<Factura> facturas) throws JAXBException {
       JAXBContext context = JAXBContext.newInstance(ListaFacturas.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    ListaFacturas facturasWrapper = new ListaFacturas();
    facturasWrapper.setListaFacturas(facturas);

    marshaller.marshal(facturasWrapper, new File(fileFacturas));
    }
    
    public static List<Categoria> cargarCategorias() throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(ListaCategorias.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();

    ListaCategorias categoriasWrapper = (ListaCategorias) unmarshaller.unmarshal(new File(fileCategorias));

    return categoriasWrapper.getListaCategorias();
    }
    
    public static List<Producto> cargarProductos() throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaProductos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaProductos productosWrapper = (ListaProductos) unmarshaller.unmarshal(new File(fileProductos));
        
        return productosWrapper.getListaProductos();
    }

    public static List<Cliente> cargarClientes() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaClientes.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaClientes clientesWrapper = (ListaClientes) unmarshaller.unmarshal(new File(fileClientes));
        
        return clientesWrapper.getListaClientes();
    }

    public static List<Cajero> cargarCajeros() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaCajeros.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaCajeros cajerosWrapper = (ListaCajeros) unmarshaller.unmarshal(new File(fileCajeros));
        
        return cajerosWrapper.getListaCajeros();
    }

    public static List<Factura> cargarFacturas() throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaFacturas.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
       ListaFacturas facturasWrapper = (ListaFacturas) unmarshaller.unmarshal(new File(fileFacturas));
        
        return facturasWrapper.getListaFacturas();
    }
    
}
