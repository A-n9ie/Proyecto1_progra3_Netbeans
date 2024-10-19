/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Data.ArchivosXML;
import Domain.Cajero;
import Domain.Cajero;
import Domain.Categoria;
import Domain.Cliente;
import Domain.Cliente;
import Domain.Factura;
import Domain.Factura;
import Domain.Producto;
import Domain.Producto;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MiniSuper {
    private List<Cliente> listaClientes;
    private List<Cajero> listaCajeros;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;
    private List<Categoria> listaCategorias;
    
    public MiniSuper() throws JAXBException {
        try{
            File archivoProductos = new File(ArchivosXML.getFileProductos());
            File archivoCategorias = new File(ArchivosXML.getFileCategorias());
            File archivoClientes = new File(ArchivosXML.getFileClientes());
            File archivoCajeros = new File(ArchivosXML.getFileCajeros());
            File archivoFacturas = new File(ArchivosXML.getFileFacturas());
            
            if(archivoProductos.exists())
                this.listaProductos = ArchivosXML.cargarProductos();
            else
                this.listaProductos = new ArrayList<>();
            
            if(archivoCategorias.exists())
                this.listaCategorias = ArchivosXML.cargarCategorias();
            else
                this.listaCategorias = new ArrayList<>();
            
            if(archivoCajeros.exists())
                this.listaCajeros = ArchivosXML.cargarCajeros();
            else
                this.listaCajeros = new ArrayList<>();
            
            if(archivoClientes.exists())
                this.listaClientes = ArchivosXML.cargarClientes();
            else
                this.listaClientes = new ArrayList<>();
            
            if(archivoFacturas.exists())
                this.listaFacturas = ArchivosXML.cargarFacturas();
            else
                this.listaFacturas = new ArrayList<>();
        }
        catch(JAXBException e){
            e.printStackTrace();
        }
    }
    
    public void restablecerClientes() throws JAXBException{
        this.listaClientes = ArchivosXML.cargarClientes();
    }
    
    public void restablecerProductos() throws JAXBException{
        this.listaProductos = ArchivosXML.cargarProductos();
    }
    
     public void restablecerCajeros() throws JAXBException{
       this.listaCajeros = ArchivosXML.cargarCajeros();
    }
    
    public void restablecerFacturas() throws JAXBException{
        this.listaFacturas = ArchivosXML.cargarFacturas();
    }
    
    public void restablecerCategorias() throws JAXBException{
        this.listaCategorias = ArchivosXML.cargarCategorias();
    }

    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
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
    
    public boolean buscarCategoria(String nombre){
        for(Categoria categoria : listaCategorias){
            if(categoria.getNombre().equals(nombre))
                return true;
        }
        return false;
    }
    
    public Producto buscarProducto(String cod){
        for(Producto producto : listaProductos){
            if(producto.getDescripcion().equalsIgnoreCase(cod) || producto.getCodigo().equals(cod))
                return producto;
        }
        return null;
    }
    
    public Producto eliminarPorCod(String descripcion){
            for(Producto producto : listaProductos){
            if(producto.getDescripcion().equals(descripcion))
                listaProductos.remove(producto);
                return producto;
        }
       return null;
    }
    
      public Cajero eliminarPorNombreCajero(String nombre){
            for(Cajero cajero : listaCajeros){
            if(cajero.getNombre().equals(nombre))
                listaProductos.remove(cajero);
                return cajero;
        }
       return null;
    }
      
      public Cliente eliminarPorNombreCliente(String nombre){
            for(Cliente cliente : listaClientes){
            if(cliente.getNombre().equals(nombre))
                listaProductos.remove(cliente);
                return cliente;
        }
       return null;
    }
      
    
    public Cliente buscarCliente(String nom){
        for(Cliente cliente : listaClientes){
            if(cliente.getNombre().equals(nom) ||cliente.getCedula().equals(nom))
                return cliente;
        }
        return null;
    }
    
    
    public Cajero buscarCajero(String nom){
        for(Cajero cajero : listaCajeros){
            if(cajero.getNombre().equals(nom) || cajero.getCedula().equals(nom))
                return cajero;
        }
        return null;
    }
    
    public Factura buscarFactura(String num){
        for(Factura factura : listaFacturas){
            if(factura.getNumFactura().equals(num))
                return factura;
        }
        return null;
    }
    
    
    public Cliente recorrerListaCliente(){
        for(Cliente cliente : listaClientes){
            return cliente;
        }
        return null;
    }
    
    public Producto buscarProducto(String archivoXML, String descripcion){
        try{
            
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaProductos.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ListaProductos listaProductos = (ListaProductos) unmarshaller.unmarshal(new File(archivoXML));
            List<Producto> productos = listaProductos.getListaProductos();
            
              for (Producto producto : productos) {
                if (producto.getDescripcion().equalsIgnoreCase(descripcion)) {
                    return producto;
                }
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
         public List<Producto> fillObjet(String fileXML){
        List<Producto> productos = new ArrayList<>();
         try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaProductos.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ListaProductos listaProductos = (ListaProductos) unmarshaller.unmarshal(new File(fileXML));
            return listaProductos.getListaProductos();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}