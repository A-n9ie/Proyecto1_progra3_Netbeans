/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class Sinpe extends MetodoPago {
    private String telefono;

    public Sinpe(String telefono, double monto) {
        super(monto);
        this.metodo = "Sinpe";
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String[] getDatosPago() {
        String[] dataPago = {"metodo", "monto", "telefono"};
        return dataPago;
    }

    @Override
    public String[] getDatos() {
      String mo = String.valueOf(monto);
      String[] dataPago = {metodo, mo, telefono};
        return dataPago;
    }

    @Override
    public String toString() {
        return "Metodo de pago -> " + metodo +
                "\nTelefono: " + telefono + "\n" +
                "\nMonto pagado: " + monto + "\n"
                ;}
    
}
