package FicherosBinarios0;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) {
        Gestor gestor = null;
        GestorFicheros gf = new GestorFicheros();

        boolean cargado = false;
        try {
            if (gf.leerFichero() == null) {
                gf.generarFichero();
            } else {
                cargado = true;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (cargado) {
            try {
                gestor = new Gestor(gf.leerFichero());
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        } else {
            gestor = new Gestor();
        }


        boolean fin = false;

        while (!fin) {
            System.out.println("1.2.3.4-> SALIR");
            int opc = EntradaSalida.leerEnteros();
            switch (opc) {
                case 1:
                    gestor.mostrarusuarios();
                    break;
                case 2:
                    gestor.nuevoUsuario();
                    break;
                case 3:
                    try {
                        gf.escribirFichero(gestor);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 4:
                    fin = true;
                    System.out.println("fin");
                    break;
            }
        }
    }

}
