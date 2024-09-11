/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.*;

import java.io.StringReader;
import java.io.StringWriter;


@XmlRootElement
public class Carrito extends Compra {

    @Override
    public double subtotal() {
       return 0.0;
    }

    @Override
    public double iva() {
        return 0.0;
        }

    @Override
    public int canTotal() {
        return 0;
    }
    @Override
    public String toString(){
        return "";
    }

    @Override
    public Compra getArticulo() {
        return null;
    }

    @Override
    public void setArticulo(Compra shopping) {
    }

    @Override
    public Producto getProducto() {
        return null;
    }
}
