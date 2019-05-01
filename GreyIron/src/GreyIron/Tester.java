package GreyIron;

public class Tester {
    public static void main(String[] args) {
        Banca banca = new Banca();

        System.out.println("GreyIron");


        boolean salir = false;

        while (!salir) {
            System.out.println("que desea hacer");
            int opciones = EntradaSalida.leerEnteros();
            switch (opciones) {
                case 1:
                    //llamada al juego
                    System.out.println("No disponible");
                    break;
                case 2:

                    banca.gestionAdministrador();
                    break;
                case 3:
                    try {
                        banca.cuentaCliente();
                    } catch (InterruptedException ex) {
                        ex.getCause();
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        }
    }
}
