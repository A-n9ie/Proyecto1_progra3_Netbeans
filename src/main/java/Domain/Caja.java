/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.List;

/**
 *
 * @author angie
 */
public class Caja {
    
    public Cliente buscarCliente(String identificador, List<Cliente> list){
        for(Cliente cliente: list){
            if(cliente.getCedula() == identificador || cliente.getNombre() == identificador)
                return cliente;
        }
        return null;
    }
    
    public Cajero buscarCajero(String identificador, List<Cajero> list){
        for(Cajero cajero: list){
            if(cajero.getCedula() == identificador || cajero.getNombre() == identificador)
                return cajero;
        }
        return null;
    }
    
    public Producto buscarProducto(String identificador, List<Producto> list){
        for(Producto producto: list){
            if(producto.getCodigo() == identificador || producto.getDescripcion() == identificador)
                return producto;
        }
        return null;
    }
    
    public Factura buscarFactura(String num, List<Factura> list){
        for(Factura factura: list){
            if(factura.getNumFactura() == num)
                return factura;
        }
        return null;
    }
}
