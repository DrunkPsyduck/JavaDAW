package GreyIron;

public class Banca {

    private String contraseña = "0000";

    public boolean accesoAdministrador() {
        boolean accesoValido = false;
        System.out.println("Para acceder a la banca debe introducir una contraseña válida.");
        String intentoPass = EntradaSalida.leerTexto();

        if (contraseña.equals(intentoPass)) {
            accesoValido = true;
        }
        return accesoValido;
    }

    public void cuentaCliente() throws InterruptedException {
        System.out.println("introduzca su identificador: ");
        String identificador = EntradaSalida.leerTexto();
        //Comprobar idebntificador en el fichero. Si existe se accede a la consola de administracion del usuario IF/ELSE

        System.out.println("Que operación desea realizar");
        String operacion = EntradaSalida.leerTexto();

        boolean salir = false;

        while (!salir) {
            switch (operacion.toLowerCase()) {
                case "ingreso":
                    System.out.println("introduzca la cantidad ");
                    double cantidad = EntradaSalida.leerDouble();

                    //if esle verificando si se ha escrito en el fichero

                    break;
                case "informacion":
                    //Muestra toda la informacion de la cuenta

                    break;
                case "borrar":
                    //eliminar la informacion del usuario
                    break;
                case "salir":
                    System.out.println("Saliendo al menu principal");
                    Thread.sleep(600);
                    salir = true;
                    break;
                default:
                    System.out.println("No valido");
                    break;

            }
        }

    }

//    public void ingresoDinero() {
//        System.out.println("Introduzca la cantidad: ");
//        double cantidadIngreso = EntradaSalida.leerDouble();
//    }
//

}
