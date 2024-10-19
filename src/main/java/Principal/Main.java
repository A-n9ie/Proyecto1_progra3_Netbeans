package Principal;

import Business.ControllerMain;
import Business.GraficasVentasController;
import Data.ArchivosXML;
import Data.MiniSuper;
import Domain.Factura;
import Domain.GraficasVentas;

import Presentation.GUIFacturar;
import jakarta.xml.bind.JAXBException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws JAXBException{
      
        GUIFacturar gFacturar = new GUIFacturar();
        ControllerMain controller = new ControllerMain(gFacturar);
        controller.getControllerMain();
    
    }
}
