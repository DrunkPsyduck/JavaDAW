package Ejercicio1;

public class Tester {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        boolean fin = false;

        while (!fin) {
            System.out.println("Opciones");
            int opcion = EntradaSalida.leerEnteros();

            switch (opcion) {
                case 1:
                    gestor.nuevoJugador();
                    break;
                case 2:
                    gestor.consultaPorNombre();

                    break;
                case 3:
                    gestor.consultaPorProvincia();
                    break;
                case 4:
                    gestor.modificarCanastas();
                    break;
                case 5:
                    gestor.borradoJugadorRangoCanastas();
                    break;
                case 6:
                    gestor.borradoCompleto();
                    break;
                case 7:
                    gestor.mostrarColeccion();
                    break;
                case 8:
                    gestor.mostrarColeccion();
                    break;
                case 9:
                    fin = true;
                    break;
                default:
                    System.out.println("no válido");
            }


        }
    }
}
