/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class Cheque extends MetodoPago {
    private String numCheque;

    public Cheque(String numCheque, double monto) {
        super(monto);
        this.numCheque = numCheque;
    }

    @Override
    public String[] getDatosPago() {
        String[] dataPago = {"metodo", "monto", "numcheque"};
        return dataPago;
    }

    @Override
    public String[] getDatos() {
      String mo = String.valueOf(monto);
      String[] dataPago = {metodo, mo, numCheque};
        return dataPago;
    }

    @Override
    public String toString() {
        return "Metodo de pago -> " + metodo +
                 "\nNumero de cheque: " + numCheque + "\n" +
                "\nMonto pagado: " + monto + "\n";
    }
    
}
