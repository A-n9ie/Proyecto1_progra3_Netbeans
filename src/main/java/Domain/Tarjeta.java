/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
public class Tarjeta extends MetodoPago {
    private String tipo;

    public Tarjeta(String tipo, double monto) {
        super(monto);
        this.metodo = "Targeta";
        this.tipo = tipo;
    }
    @XmlElement
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
