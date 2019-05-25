package FicherosBinarios1;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) {
        //TODO El tipo padre tiene que implementar Serializable -> Repositorio Implements Serializable
        Gestor gest = null;
        GestorFicheros gf = new GestorFicheros();

        boolean cargado = false;

        try {
            if (gf.leerFichero()==null ){
                gf.generarFichero();
            } else{
                cargado = true;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (cargado){

            try {
                gest = new Gestor(gf.leerFichero());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } 
        } else {
            gest = new Gestor();
        }

        boolean fin = false;

        while (!fin) {
            System.out.println("opciones");
            int opc = EntradaSalida.leerEnteros();

            switch (opc) {
                case 1:
                    gest.nuevoRepo();
                    break;
                case 2:
                    gest.mostrarRepositorios();
                    break;
                case 3:
                    try {
                        gf.escribirFichero(gest);
                        System.out.println("EE");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    fin = true;
                    System.out.println("F I N");
                    break;

            }
        }

    }
}
