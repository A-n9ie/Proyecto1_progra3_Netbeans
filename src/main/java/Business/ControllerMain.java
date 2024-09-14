
package Business;

import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;



public class ControllerMain {
    private GUIFacturar gFacturar;
    private ControllerProductos controllerProductos;
    private ControllerFacturar controllerFacturar;
    private ControllerClientes controllerClientes;
    private ControllerCajeros controllerCajeros;
    
    public ControllerMain(GUIFacturar gFacturar) throws JAXBException{
        this.controllerProductos = new ControllerProductos(gFacturar);
        this.controllerFacturar = new ControllerFacturar(gFacturar, controllerProductos);
        this.controllerClientes = new ControllerClientes(gFacturar);
        this.controllerCajeros = new ControllerCajeros(gFacturar);
        this.gFacturar = gFacturar;
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
