package GreyIron;

public class Juego {

    public void administracionBanca(Banca banca) {
        if (banca.acceso()) {
            System.out.println("Bienvenido al sistema de administración.\n¿Qué accion desea realizar?");
            int opciones = EntradaSalida.leerEnteros();

            switch (opciones) {
                case 1:
                    //llmadas a metodos correspondientes con la administracion
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }
        } else {
            System.out.println("No se ha podido acceder al sistema de administración");
        }

    }
}
