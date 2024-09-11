/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class Efectivo extends MetodoPago {
    private double pago;
    private double cambio;

    public Efectivo(double pago, double monto) {
        super(monto);
        this.metodo = "Efectivo";
        this.pago = pago;
        this.cambio = pago - monto;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
    
    @Override
    public String[] getDatosPago() {
        String[] dataPago = {"metodo", "monto", "pago", "cambio"};
        return dataPago;
    }

    @Override
    public String[] getDatos() {
        String mo = String.valueOf(monto);
        String pa = String.valueOf(pago);
        String ca = String.valueOf(cambio);
        String[] data = {metodo, mo, pa, ca};
        return data;
    }

    @Override
    public String toString() {
        return "Metodo de pago -> " + metodo +
                "\nPago: " + pago +
                "\nCambio: "+ cambio + "\n";
    } 
    
}
