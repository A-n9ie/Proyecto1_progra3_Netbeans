/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Domain;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public abstract class Compra {

    public Compra() {
    }
    
    public abstract double subtotal();
    public abstract double iva();
    public abstract int canTotal();
    public abstract Producto getProducto();
    public abstract Compra getArticulo();
    public abstract void setArticulo(Compra ss);
    @Override
    public abstract String toString();
}
