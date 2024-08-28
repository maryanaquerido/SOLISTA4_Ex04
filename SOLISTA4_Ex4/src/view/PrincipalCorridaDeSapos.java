package view;
import controller.ControllerCorridaDeSapos;
public class PrincipalCorridaDeSapos {
    public static void main (String[] args){
        
        int distanciaCorrida = 100;
        
        Thread sapo1 = new ControllerCorridaDeSapos("Sapo 1", 5, distanciaCorrida);
        Thread sapo2 = new ControllerCorridaDeSapos("Sapo 2", 5, distanciaCorrida);
        Thread sapo3 = new ControllerCorridaDeSapos("Sapo 3", 5, distanciaCorrida);
        Thread sapo4 = new ControllerCorridaDeSapos("Sapo 4", 5, distanciaCorrida);
        Thread sapo5 = new ControllerCorridaDeSapos("Sapo 5", 5, distanciaCorrida);
        
        sapo1.start();
        sapo2.start();
        sapo3.start();
        sapo4.start();
        sapo5.start();
    }
    
}
