/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class Carrito implements Compra {

    @Override
    public double subtotal() {
       return 0.0;
    }

    @Override
    public double iva() {
        return 0.0;
        }

    @Override
    public int canTotal() {
        return 0;
    }
    @Override
    public String toString(){
        return "";
    }

    @Override
    public Compra getArticulo() {
        return null;
    }

    @Override
    public void setArticulo(Compra shopping) {
    }

    @Override
    public Producto getProducto() {
        return null;
    }
}
