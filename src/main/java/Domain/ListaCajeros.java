/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "listacajeros")
public class ListaCajeros {
    private List<Cajero> listaCajeros;
    
    public ListaCajeros() {
        this.listaCajeros = new ArrayList<>();
    }
    
  @XmlElement(name = "cajero")
    public List<Cajero> getListaCajeros() {
        return listaCajeros;
    }

    public void setListaCajeros(List<Cajero> listaCajeros) {
        this.listaCajeros = listaCajeros;
    }
}
