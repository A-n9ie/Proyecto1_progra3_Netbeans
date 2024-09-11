/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public class DetalleVenta {
    private int cantidad;
    private Producto producto;

    public DetalleVenta() {
        this.cantidad = 0;
        this.producto = null;
    }

    public DetalleVenta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
@XmlElement
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
@XmlElement(name = "producto")
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public double importe(){
        return precioNeto() * cantidad;
    }
    
    public double precioNeto(){
        double neto = producto.getPrecio() - (producto.getPrecio() * producto.getDescuento());
        return neto;
    }

    @Override
    public String toString() {
        return producto.getDescripcion() + "  " + 
               producto.getPrecio() + "  " + cantidad + "  " + 
               precioNeto() + "  " + importe() + "\n";
    }
    
}
