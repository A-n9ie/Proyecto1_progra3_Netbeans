
package Business;

import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;



public class ControllerMain {
    private GUIFacturar gFacturar;
    private ControllerFacturar controllerFacturar;
    private ControllerClientes controllerClientes;
    private ControllerCajeros controllerCajeros;
    private ControllerProductos controllerProductos;
    
    public ControllerMain(GUIFacturar gFacturar) throws JAXBException{
        this.controllerFacturar = new ControllerFacturar(gFacturar);
        this.controllerClientes = new ControllerClientes(gFacturar);
        this.controllerCajeros = new ControllerCajeros(gFacturar);
        this.controllerProductos = new ControllerProductos(gFacturar);
        this.gFacturar = gFacturar;
    }
    
    public void getControllerMain(){
        gFacturar.setVisible(true);
        gFacturar.setLocationRelativeTo(null);
        controllerFacturar.getControllerFacturar();
        controllerClientes.getVentanaClientes();
        controllerCajeros.getVentanaCajeros();
        controllerProductos.getVentanaProductos();
    }
}
