package controller;

public class ControllerCorridaDeSapos extends Thread {
    
    private String sapo;
    private int tamSalto;
    private int distanciaPercorrer;
    private static int posicao = 1; 
    private static final Object lock = new Object();

    public ControllerCorridaDeSapos(String sapo, int tamSalto, int distanciaPercorrer) {
        this.sapo = sapo;
        this.tamSalto = tamSalto;
        this.distanciaPercorrer = distanciaPercorrer;
    }
    
    public void run(){
        calc();
    }
    
    private void calc(){
        int distanciaPercorrida = 0;
         while (distanciaPercorrida < distanciaPercorrer) {
            int salto = (int) (Math.random() * tamSalto) + 1;
            distanciaPercorrida = distanciaPercorrida + salto;
            System.out.println(sapo + " saltou " + salto + " m. Total percorrido: " + distanciaPercorrida + "m.");
         }
            synchronized (lock) {
            int lugar = posicao++; 
            System.out.println("------------------------");
            System.out.println(lugar + "° LUGAR: " + sapo);
            System.out.println("------------------------");
        }
    }
}