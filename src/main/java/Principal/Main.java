package Principal;

import Business.PDF;
import Domain.Persona;
import Domain.Cliente;
import Domain.Cajero;
import Domain.Fecha_Hora;
import Domain.Factura;
import Domain.Producto;
import Domain.Venta;
import Exepciones.ExcepcionDescuento;
import Exepciones.ExcepcionExiste;
import Exepciones.ExcepcionNoExiste;
import Exepciones.ExcepcionVacio;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.TransformerException;
import Presentation.GUIFacturar;
import Data.ArchivosXML;
import Domain.DetalleVenta;
import Domain.MetodoPago;
import Domain.Tarjeta;
import jakarta.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws ExcepcionExiste, ExcepcionDescuento, ExcepcionVacio, TransformerException, ExcepcionNoExiste, JAXBException {
    Producto producto1 = new Producto("1112","Salchicha","gramos",
            1222.36f,0.15f, 30,"Embutidos");
    Producto producto2 = new Producto("3332","Miel","gramos",
            1100.45f,0.0f, 28,"Conserva");
    Cliente cliente1 = new Cliente("allys34@gmail.com","222222222", 0.15f, "11111", "Marta");
    Cajero cas = new Cajero("2222", "Marco");
    Cliente cliente2 = new Cliente("rogelo934@gmail.com","44488884", 0.35f, "22222", "Roger");
    Cajero cas2 = new Cajero("33333", "Luisiana");
    
    List<DetalleVenta> veneta1 = new ArrayList<>();
    veneta1.add(new DetalleVenta(4,producto1));
    veneta1.add(new DetalleVenta(2,producto2));
    
    Factura fact1 = new Factura(cliente1,cas,veneta1);
    
    List<MetodoPago> listapagos = new ArrayList<>();
    listapagos.add(new Tarjeta("Credito", fact1.montoTotal()));
    fact1.setPagos(listapagos);
    //veneta1.agregarCarrito(producto2, 4);
    //producto2.venderProducto(4);
    Factura fact2 = new Factura(cliente2,cas2,veneta1);
    
    List<Producto> listaProductos = ArchivosXML.cargarProductos();
    ArchivosXML.guardarProductos(listaProductos);
    
    List<Factura> listaFacturas = new ArrayList<>();
    listaFacturas.add(fact2);
    ArchivosXML.guardarFacturas(listaFacturas);
    
    
    List<Cliente> listaClientes = new ArrayList<>();
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    ArchivosXML.guardarClientes(listaClientes);
    
    System.out.println(listaProductos);
     List<Cajero> listaCajeros = new ArrayList<>();
    listaCajeros.add(cas);
    listaCajeros.add(cas2);
    ArchivosXML.guardarCajeros(listaCajeros);
    
    
    System.out.println(listaProductos);
      System.out.println("------------------------------");
      System.out.println(listaFacturas);
      System.out.println("------------------------------");
      System.out.println(listaClientes);
      System.out.println("------------------------------");
      System.out.println(listaCajeros);
      
      
      PDF pdf = new PDF(listaFacturas.get(0));
      pdf.generarPDF();
      
      /*
    GUIFacturar gFacturar = new GUIFacturar();
    gFacturar.setVisible(true);
    gFacturar.setLocationRelativeTo(null);
    */
    }
}
