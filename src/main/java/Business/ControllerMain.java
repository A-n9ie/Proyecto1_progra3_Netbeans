
package Business;

import Data.ArchivosXML;
import Domain.Producto;
import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import Presentation.VentanaEstadisticas;
import Domain.GraficoEstadisticas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ControllerMain {
    private GUIFacturar gFacturar;
    private ControllerProductos controllerProductos;
    private ControllerFacturar controllerFacturar;
    private ControllerClientes controllerClientes;
    private ControllerCajeros controllerCajeros;
    private ControllerEstadisticas controllerEstadisticas;

    public ControllerMain(GUIFacturar gFacturar) throws JAXBException{
        this.controllerProductos = new ControllerProductos(gFacturar);
        this.controllerFacturar = new ControllerFacturar(gFacturar, controllerProductos);
        this.controllerClientes = new ControllerClientes(gFacturar);
        this.controllerCajeros = new ControllerCajeros(gFacturar);
        this.controllerEstadisticas = new ControllerEstadisticas(
                gFacturar.getVentanaEstadisticas(),
                new GraficoEstadisticas(),
                new ArchivosXML()
        );
        this.gFacturar = gFacturar;
    }

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
    }

    public void getControllerMain(){
        gFacturar.setVisible(true);
        gFacturar.setLocationRelativeTo(null);
        controllerFacturar.getControllerFacturar();
        controllerFacturar.cargarClientesEnGUI();
        controllerFacturar.cargarCajerosEnGUI();
        controllerClientes.getVentanaClientes();
        controllerCajeros.getVentanaCajeros();
        controllerProductos.getVentanaProductos();


    }
}
