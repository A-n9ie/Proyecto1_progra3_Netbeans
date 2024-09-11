/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
public class Venta {
    private String codigoVenta;
    private int contProducto;
    private Compra compra;
    private LocalDate fecha;
    
    public Venta(String codigo) {
        this.codigoVenta = codigo;
        this.compra = new Carrito();
        this.fecha = LocalDate.now();
    }

    public Venta() {
        this.codigoVenta = String.valueOf(Factura.contFacturas + 1);
        this.compra = new Carrito();
        this.fecha = LocalDate.now();
    }
@XmlElement(name = "compra")
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    @XmlAttribute
    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
@XmlElement
    public int getContProducto() {
        return contProducto;
    }

    public void setContProducto(int contProducto) {
        this.contProducto = contProducto;
    }
    
    public void agregarCarrito(Producto producto, int cant){
        compra = new DecoradorProducto(producto, cant, compra);
        contProducto++;
    }
    
    public String[] getDatosVenta(){
     String[] dataVenta = {"codigoventa", "contProducto"};
     
     return dataVenta;
    }
    
    public String[] getDatos(){
        String cont = String.valueOf(contProducto);
        String[] data = {codigoVenta,cont};
        return data;
    }
    
    public void eliminarCarrito(String codee){
     Compra aux = compra;
     if (aux.getProducto().getCodigo() == codee) {
        compra = compra.getArticulo();
        aux = null;
        contProducto--;
     }
      else {
            Compra anterior = aux;
            aux = compra.getArticulo();
            while (aux.getArticulo()!= null && aux.getProducto().getCodigo() != codee) {
                anterior = aux;
                aux = aux.getArticulo();
            }
            anterior.setArticulo(aux.getArticulo());
            aux = null;
            contProducto--;
        }
    }

    @Override
    public String toString() {
        return  compra.toString() + "Subtotal: " 
                + compra.subtotal() + "\nCantidad total: " + compra.canTotal();
    }
    @XmlElement
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    @XmlElement
    public String getMes() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
        return fecha.format(formatter);
    }
    @XmlElement
    public String getCategoria(){
        return compra.getProducto().getCategoria();
    }
     public double calcularTotal() {
        return compra.subtotal();
    }
}
