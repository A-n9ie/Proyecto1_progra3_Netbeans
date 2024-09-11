/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

//import java.util.List;

/**
 *
 * @author angie
 */
public class Factura {
    static int contFacturas = 0; 
    private String numFactura;
    private String hora;
    private String fecha;
    private Cliente cliente;
    private Cajero cajero;
    private Venta venta;
    private List<MetodoPago> pagos;

    public Factura() {
        this.numFactura = "0";
        this.hora = "indefinida";
        this.fecha = "indefinids";
        this.cliente = null;
        this.cajero = null;
        this.venta = null;
        this.pagos = null;
    }

    public Factura(Cliente cliente, Cajero cajero, Venta venta, List<MetodoPago> pago) {
        contFacturas++;
        this.numFactura = String.valueOf(contFacturas);
        this.hora = Fecha_Hora.horaActual();
        this.fecha = Fecha_Hora.fechaActual();
        this.cliente = cliente;
        this.cajero = cajero;
        this.venta = venta;
        this.pagos = pago;
    }
    
    public Factura(Cliente cliente, Cajero cajero, Venta venta) {
        contFacturas++;
        this.numFactura = String.valueOf(contFacturas);
        this.hora = Fecha_Hora.horaActual();
        this.fecha = Fecha_Hora.fechaActual();
        this.cliente = cliente;
        this.cajero = cajero;
        this.venta = venta;
        this.pagos = new ArrayList<>();
    }

    public static int getContFacturas() {
        return contFacturas;
    }

    public static void setContFacturas(int contFacturas) {
        Factura.contFacturas = contFacturas;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<MetodoPago> getPagos() {
        return pagos;
    }

    public void setPagos(List<MetodoPago> pagos) {
        this.pagos = pagos;
    }
    
    public double total(){
        double descuentoCliente = venta.getCompra().subtotal() * cliente.getDescuento();
        double total = venta.getCompra().subtotal() - descuentoCliente;
        return total;
    }
    
    public boolean pagado(){
        double totalpagado = total();
        for(MetodoPago cont: pagos){
            totalpagado -= cont.getMonto();
        }
        return totalpagado == 0;
    }
    
     public String[] getDatosFactura(){
     String[] dataFactura = {"num_factura", "hora", "fecha"};
     return dataFactura;
    }
    
    public String[] getDatos(){
        String tt = String.valueOf(total());
        String[] data = {numFactura, hora, fecha};
        return data;
    }

    @Override
    public String toString() {
        return """
               -Factura-
               NumFactura #""" + numFactura +  
                "\nHora: " + hora + " \t\tFecha: " + fecha + 
                "\nCliente:" + cliente.getCedula() + 
                "\nCajero: " + cajero.getNombre() + 
                "\n" + venta +
                "\nDescuento del cliente: " + cliente.getDescuento() +
                "\nTotal: " + total() + "\n" +
                 /*pagos.toString() +*/ "\n";
    }
    
    
}
