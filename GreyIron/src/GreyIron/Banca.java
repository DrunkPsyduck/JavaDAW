package GreyIron;

import java.io.*;

public class Banca {

    private static final String nombre = "C:\\Users\\mario\\Documents\\GitHub\\JavaDAW\\GreyIron\\GreyIron\\FicheroUsuarios.dat";
    protected File ficheroUsuarios = new File(nombre);

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

    public void gestionAdministrador() {
        if (accesoAdministrador()) {
            System.out.println("Bienvenido al sistema de administracion de la banca.\nIntroduzca la opcion deseada.");

            int opcion = EntradaSalida.leerEnteros();
            boolean fin = false;
            while (!fin) {
                switch (opcion) {
                    case 1:
                        //dar de alta a un usuario
                        try {
                            introducirContenidoFicheroUsuarios();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        //dar de baja un usario
                        break;
                    case 3:
                        fin = true;
                        break;
                    default:
                        System.out.println("no valido");
                }
            }
        }

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

    public void generarFicheroUsuarios() throws IOException {
        File ficheroUsuarios = new File(nombre);
        if (!ficheroUsuarios.exists()){
            ficheroUsuarios.createNewFile();
        }
    }

    public void introducirContenidoFicheroUsuarios() throws IOException {
        File ficheroUsuarios = new File(nombre);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        if (ficheroUsuarios.exists()){
            fos = new FileOutputStream(nombre);
            salida = new DataOutputStream(fos);

            System.out.println("introduca el nombre del usuario");
            String nombreUsuario = EntradaSalida.leerTexto();

            salida.writeUTF(nombreUsuario);
            fos.close();
            salida.close();
        }
    }

//    public void ingresoDinero() {
//        System.out.println("Introduzca la cantidad: ");
//        double cantidadIngreso = EntradaSalida.leerDouble();
//    }
//

    //Lectores

}
