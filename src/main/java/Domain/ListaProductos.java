/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angie
 */
@XmlRootElement(name = "listaproductos")
public class ListaProductos {
    private List<Producto> listaProductos;
    
    public ListaProductos() {
        this.listaProductos = new ArrayList<>();
    }
  @XmlElement(name = "producto")
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
}
