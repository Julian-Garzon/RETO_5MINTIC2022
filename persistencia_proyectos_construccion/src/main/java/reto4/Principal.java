package reto4;

import Vista.VistaRequerimientos;
import Controlador.ElControladorDeRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class Principal {
    public static void main(String[] args) {

        //instanciar controlador e iniciarlo
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        controlador.inicio();
        




        // System.out.println("Requerimiento 1");
        // VistaRequerimientos.requerimiento1();

        // System.out.println("\nRequerimiento 2");
        // VistaRequerimientos.requerimiento2();

        // System.out.println("\nRequerimiento 3");
        // VistaRequerimientos.requerimiento3();
    }



}
