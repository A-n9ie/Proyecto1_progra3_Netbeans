/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Producto;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class LogicProducto {
    
     public Producto buscarProducto(String archivoXML, String descripcion){
        try{
            
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaProductos.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ListaProductos listaProductos = (ListaProductos) unmarshaller.unmarshal(new File(archivoXML));
            List<Producto> productos = listaProductos.getProductos();
            
              for (Producto producto : productos) {
                if (producto.getDescripcion().equalsIgnoreCase(descripcion)) {
                    return producto;
                }
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
     
     public List<Producto> fillObjet(String fileXML){
        List<Producto> productos = new ArrayList<>();
         try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaProductos.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ListaProductos listaProductos = (ListaProductos) unmarshaller.unmarshal(new File(fileXML));
            return listaProductos.getProductos();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
     
}
