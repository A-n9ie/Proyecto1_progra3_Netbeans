/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
public abstract class DecoradorAbstracto extends Compra{
    protected int cantidad;
    protected Compra articulo;

    public DecoradorAbstracto() {
        this.cantidad = 0;
        this.articulo = null;
    }

    public DecoradorAbstracto(int cantidad, Compra article) {
        this.cantidad = cantidad;
        this.articulo = article;
    }
@XmlElement
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     @XmlElement(name = "compra")
      @Override
    public Compra getArticulo() {
       return articulo;
    }

    @Override
    public void setArticulo(Compra ss) {
        articulo = ss;
    }
    
    @Override
    public abstract Producto getProducto();
    
    public abstract double importe();
    
    public abstract double precioNeto();

    @Override
    public abstract double subtotal();

    @Override
    public abstract double iva();

    @Override
    public abstract int canTotal();
    
    @Override
    public abstract String toString();
    
}
