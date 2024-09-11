/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public abstract class MetodoPago {
    protected String metodo;
    protected double monto;

    public MetodoPago() {
        this.metodo = "indefinido";
        this.monto = 0.0;
    }

    public MetodoPago(double monto) {
        this.monto = monto;
    }
@XmlAttribute
    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
@XmlElement
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public abstract String[] getDatosPago();
    public abstract String[] getDatos();
    @Override
    public abstract String toString();
}
