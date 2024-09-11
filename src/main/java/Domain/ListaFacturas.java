/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "listafacturas")
public class ListaFacturas {
    private List<Factura> listaFacturas;
    
    public ListaFacturas() {
        this.listaFacturas = new ArrayList<>();
    }
    
  @XmlElement(name = "factura")
    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
}
