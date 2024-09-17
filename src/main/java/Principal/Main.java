package Principal;

import Business.ControllerMain;

import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException{
      
        GUIFacturar gFacturar = new GUIFacturar();
        ControllerMain controller = new ControllerMain(gFacturar);
        controller.getControllerMain();
    }
}
