/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public interface Compra {
    double subtotal();
    double iva();
    int canTotal();
    Producto getProducto();
    Compra getArticulo();
    void setArticulo(Compra ss);
    @Override
    String toString();
}
