/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public class Factura {
    static int contFacturas = 0; 
    private String numFactura;
    private String hora;
    private String fecha;
    private Cliente cliente;
    private Cajero cajero;
    private List<DetalleVenta> detalles;
    private List<MetodoPago> pagos;

    public Factura() {
        this.numFactura = "0";
        this.hora = "indefinida";
        this.fecha = "indefinids";
        this.cliente = null;
        this.cajero = null;
        this.detalles = null;
        this.pagos = null;
    }

    public Factura(Cliente cliente, Cajero cajero, List<DetalleVenta> detalles, List<MetodoPago> pago) {
        contFacturas++;
        this.numFactura = String.valueOf(contFacturas);
        this.hora = Fecha_Hora.horaActual();
        this.fecha = Fecha_Hora.fechaActual();
        this.cliente = cliente;
        this.cajero = cajero;
        this.detalles = detalles;
        this.pagos = pago != null ? pago : new ArrayList<>();
    }
    
    public Factura(Cliente cliente, Cajero cajero, List<DetalleVenta> detalles) {
        contFacturas++;
        this.numFactura = String.valueOf(contFacturas);
        this.hora = Fecha_Hora.horaActual();
        this.fecha = Fecha_Hora.fechaActual();
        this.cliente = cliente;
        this.cajero = cajero;
        this.detalles = detalles;
        this.pagos = new ArrayList<>();
    }

    public static int getContFacturas() {
        return contFacturas;
    }

    public static void setContFacturas(int contFacturas) {
        Factura.contFacturas = contFacturas;
    }
@XmlAttribute
    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
@XmlElement
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
@XmlElement
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
@XmlElement(name = "cliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
@XmlElement(name = "cajero")
    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
@XmlElementWrapper(name = "detalles")
    @XmlElement(name = "venta")
    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
    
@XmlElementWrapper(name = "pagos")
    @XmlElement(name = "metodo")
    public List<MetodoPago> getPagos() {
        return pagos;
    }

    public void setPagos(List<MetodoPago> pagos) {
        this.pagos = pagos;
    }
    
    public double subtotal(){
        double sub = 0;
        for(DetalleVenta venta: detalles)
            sub += venta.importe();
        return sub;
    }
    
    public double montoTotal(){
        double descuentoCliente = subtotal() * cliente.getDescuento();
        double total = subtotal() - descuentoCliente;
        return total;
    }
    
    public int cantidadTotal(){
        int cant = 0;
        for(DetalleVenta venta: detalles)
            cant += venta.getCantidad();
        return cant;
    }
    
    public boolean pagado(){
        double totalpagado = montoTotal();
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
        String tt = String.valueOf(montoTotal());
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
                "\n" + detalles.toString() +
                "\n" + cantidadTotal() +
                "\n" + subtotal() +
                "\nDescuento del cliente: " + cliente.getDescuento() +
                "\nTotal: " + montoTotal() + "\n" +
                 /*pagos.toString() +*/ "\n";
    }
    
    
}
