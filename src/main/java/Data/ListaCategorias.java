/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Categoria;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angie
 */
@XmlRootElement(name = "listacategorias")
public class ListaCategorias {
    private List<Categoria> listaCategorias;
    
    public ListaCategorias() {
        this.listaCategorias = new ArrayList<>();
    }
    
  @XmlElement(name = "categoria")
    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
}
