/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Cajero;
import Domain.Cliente;
import Domain.Factura;
import Domain.ListaCajeros;
import Domain.ListaClientes;
import Domain.ListaFacturas;
import Domain.ListaProductos;
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
    
    public static void guardarProductos(List<Producto> productos) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaProductos.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        ListaProductos productosWrapper = new ListaProductos();
        productosWrapper.setListaProductos(productos);

        marshaller.marshal(productosWrapper, new File("productos.xml"));
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

    marshaller.marshal(cajerosWrapper, new File("cajeros.xml"));
    }
    
    public static void guardarFacturas(List<Factura> facturas) throws JAXBException {
       JAXBContext context = JAXBContext.newInstance(ListaFacturas.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    ListaFacturas facturasWrapper = new ListaFacturas();
    facturasWrapper.setListaFacturas(facturas);

    marshaller.marshal(facturasWrapper, new File("facturas.xml"));
    }

    public static List<Producto> cargarProductos() throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaProductos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaProductos productosWrapper = (ListaProductos) unmarshaller.unmarshal(new File("productos.xml"));
        
        return productosWrapper.getListaProductos();
    }

    public static List<Cliente> cargarClientes() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaClientes.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaClientes clientesWrapper = (ListaClientes) unmarshaller.unmarshal(new File("clientes.xml"));
        
        return clientesWrapper.getListaClientes();
    }

    public static List<Cajero> cargarCajeros() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaCajeros.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ListaCajeros cajerosWrapper = (ListaCajeros) unmarshaller.unmarshal(new File("cajeros.xml"));
        
        return cajerosWrapper.getListaCajeros();
    }

    public static List<Factura> cargarFacturas() throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(ListaFacturas.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
       ListaFacturas facturasWrapper = (ListaFacturas) unmarshaller.unmarshal(new File("facturas.xml"));
        
        return facturasWrapper.getListaFacturas();
    }
    
}
