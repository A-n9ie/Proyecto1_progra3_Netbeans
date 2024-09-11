package Principal;


import Data.FilesXML;
import Data.LogicaCliente;
import Data.LogicaFactura;
import Data.LogicaProducto;
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

public class Main {
    public static void main(String[] args) throws ExcepcionExiste, ExcepcionDescuento, ExcepcionVacio, TransformerException, ExcepcionNoExiste {
    Producto producto1 = new Producto("1112","Salchicha","gramos",
            1222.36,0.15f, 30,"Embutidos");
    Producto producto2 = new Producto("3332","Miel","gramos",
            1100.45,0.0f, 28,"Conserva");
    Cliente cliente1 = new Cliente("allys34@gmail.com","222222222", 0.15, "11111", "Marta");
    Cajero cas = new Cajero("2222", "Marco");
    Cliente cliente2 = new Cliente("rogelo934@gmail.com","44488884", 0.15, "22222", "Roger");
    Cajero cas2 = new Cajero("33333", "Luisiana");
    
    Venta veneta1 = new Venta();
    veneta1.agregarCarrito(producto1, 2);
    producto1.venderProducto(2);
    veneta1.agregarCarrito(producto2, 4);
    producto2.venderProducto(4);
    
    Factura fact1 = new Factura(cliente1,cas,veneta1);
    Factura fact2 = new Factura(cliente2,cas2,veneta1);
    
    
    FilesXML prueba = new FilesXML();
    LogicaProducto pruebaPro = new LogicaProducto();
    LogicaFactura pruebaFactura = new LogicaFactura();
    LogicaCliente pruebaCliente = new LogicaCliente();
    prueba.createXML("Factura", "facturas");
    List<Factura> listaFactura = pruebaFactura.recuperarFacturas("facturas");
    veneta1.eliminarCarrito("1112");
    //pruebaFactura.agregarFacturaLista(fact2, listaFactura);
    List<Producto> listaProductos = pruebaPro.buscarListaProductos("productos");
    //pruebaPro.eliminarProducto(listaProductos, "1112");
    prueba.createXML("Cliente", "clientes");
    List<Cliente> listaCliente = pruebaCliente.buscarListaClientes("clientes");
    pruebaPro.eliminarProducto(listaProductos, "1112");
    System.out.println(listaProductos);
     System.out.println(listaCliente);
        System.out.println(listaFactura);

    //pruebaCliente.agregarClienteLista(cliente1, listaCliente);
    //pruebaPro.agregarProducto(producto2, listaProductos);
    /*System.out.println(cliente1);
    veneta1.agregarCarrito(producto1, 2);
    producto1.venderProducto(2);
    veneta1.agregarCarrito(producto2, 4);
    producto2.venderProducto(4);
    System.out.println(veneta1);
    
    
    
     System.out.println(fact1);
     
     prueba.writeXML("facturas", "Factura", fact1.getDatosFactura(), fact1.getDatos());
     
     System.out.println(listaFactura);
     veneta1.eliminarCarrito("1112");
     System.out.println(veneta1);
     
     System.out.println(fact2);
     
    prueba.createXML("Factura","facturas");
    prueba.writeXML("productos", "Producto", producto1.getDatosProducto(), producto1.getDatos());
    
    
    System.out.println(pruebaPro.buscarPorCodigo("1112", listaProductos));
    System.out.println(listaProductos);*/
    //fin
    
    GUIFacturar gFacturar = new GUIFacturar();
    gFacturar.setVisible(true);
    gFacturar.setLocationRelativeTo(null);
    
    }
}
