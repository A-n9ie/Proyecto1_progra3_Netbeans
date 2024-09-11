/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class Targeta extends MetodoPago {
    private String tipo;

    public Targeta(String tipo, double monto) {
        super(monto);
        this.metodo = "Targeta";
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String[] getDatosPago() {
        String[] dataPago = {"metodo", "monto", "tipo"};
        return dataPago;
    }

    @Override
    public String[] getDatos() {
      String mo = String.valueOf(monto);
      String[] dataPago = {metodo, mo, tipo};
        return dataPago;
    }

    @Override
    public String toString() {
        return "Metodo de pago -> " + metodo +
                "\nTargeta de " + tipo + "\n" +
                "\nMonto pagado: " + monto + "\n";
    }
    
    
}
