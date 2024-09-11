/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.ArrayList;
import java.util.List;

public class MiniSuper {
    private List<Cliente> listaClientes;
    private List<Cajero> listaCajeros;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;
    //private FilesXML filesXML;
    
    public MiniSuper() {
        this.listaClientes = new ArrayList<>();
        this.listaCajeros = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaFacturas = new ArrayList<>();
        //this.filesXML = new FilesXML();
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
}