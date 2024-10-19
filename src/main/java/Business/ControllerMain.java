
package Business;

import Data.ArchivosXML;
import Data.MiniSuper;
import Domain.Categoria;
import Domain.Producto;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import Presentation.VentanaEstadisticas;
import Domain.GraficoEstadisticas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ControllerMain {
    private MiniSuper mercado;
    private GUIFacturar gFacturar;
    private ControllerProductos controllerProductos;
    private ControllerFacturar controllerFacturar;
    private ControllerClientes controllerClientes;
    private ControllerCajeros controllerCajeros;
    //private ControladoraEsta controllerEstadisticas;
    private ControllerHistorico controllerHistorico;
    private GraficasVentasController controllerGrafica;

    public ControllerMain(GUIFacturar gFacturar) throws JAXBException{
        this.gFacturar = gFacturar;
        this.mercado = new MiniSuper();
        this.controllerProductos = new ControllerProductos(gFacturar, mercado);
        this.controllerFacturar = new ControllerFacturar(gFacturar, controllerProductos, mercado);
        this.controllerClientes = new ControllerClientes(gFacturar, mercado);
        this.controllerCajeros = new ControllerCajeros(gFacturar, mercado);
        this.controllerHistorico = controllerFacturar.getControllerHistorico();
        //this.controllerEstadisticas = new ControladoraEsta(gFacturar);
        this.controllerGrafica = new GraficasVentasController(gFacturar, mercado);
        
        
    }
/*
    private Set<String> obtenerCategoriasDisponibles() {
        Set<String> categorias = new HashSet<>();
        try {
            List<Producto> productos = ArchivosXML.cargarProductos();
            for (Producto producto : productos) {
                categorias.add(producto.getCategoria());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias;
    }*/

    public void getControllerMain(){
        gFacturar.setVisible(true);
        gFacturar.setLocationRelativeTo(null);
        controllerFacturar.getControllerFacturar();
        controllerFacturar.cargarClientesEnGUI();
        controllerFacturar.cargarCajerosEnGUI();
        controllerClientes.getVentanaClientes();
        controllerCajeros.getVentanaCajeros();
        controllerProductos.getVentanaProductos();
        controllerHistorico.getControllerHistorico();
//        controllerEstadisticas.generarGraficaConFacturas(mercado);
        this.controllerGrafica.mostrarGrafica();
        
    }
}
