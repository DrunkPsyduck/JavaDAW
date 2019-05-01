package Ahorcado;

import java.io.IOException;

public class Tester {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();

      //  System.out.println(gestor.codificador());
        System.out.println(gestor.codificador());

        try {
            gestor.leerLetra();
        } catch (IOException ex) {
            ex.getMessage();
        }

        try {
            gestor.juego();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
