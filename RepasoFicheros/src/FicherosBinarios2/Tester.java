package FicherosBinarios2;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) {
        Gestor g = null;
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

        if (cargado){
            try {
                g = new Gestor(gf.leerFichero());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }  else {
            g = new Gestor();
        }

        boolean fin = false;

        while (!fin) {
            System.out.println("1-4. 4 salir");
            int opc = EntradaSalida.leerEnteros();

            switch (opc) {
                case 1:
                    g.nuevoUsuario();
                    break;
                case 2:
                    g.mostrarPersona();
                    break;
                case 3:
                    try {
                        gf.escribirFichero(g);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    fin = true;
                    break;
            }
        }

    }
}
