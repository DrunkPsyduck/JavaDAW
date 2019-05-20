package Ejercicio2;

public class Tester {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

//        gestor.añadirNuevoJuego();
//        System.out.println("otro");
//
//        gestor.añadirNuevoJuego();
//        gestor.consulta();

        boolean fin = false;
        while (!fin) {
            System.out.println("Opciones");
            int opciones = EntradaSalida.leerEnteros();

            switch (opciones) {
                case 1:
                    gestor.añadirNuevoJuego();
                    break;
                case 2:
                    // listar
                    gestor.mostrarContenido();
                    //gestor.
                    break;
                case 3:
                    //consulta por precio
                    break;
                case 4:
                    break;
                case 5:
                    fin = true;
                    break;
            }

        }
    }
}
