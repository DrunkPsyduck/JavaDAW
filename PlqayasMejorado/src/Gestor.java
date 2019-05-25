import java.util.ArrayList;

public class Gestor {

    ArrayList<Playas> playas;

    public Gestor() {

    }

    public Gestor(ArrayList<Playas> playas) {
        this.playas = playas;
    }

    public void nuevoRegistro() {
        System.out.println("Playa o cala");
        String selector = EntradaSalida.leerTexto();

        System.out.println("nombre");
        String nombre = EntradaSalida.leerTexto();
        //newe direccion
        System.out.println("Introduzca la calle");
        String direccion = EntradaSalida.leerTexto();
        System.out.println("introduzca el codigo postal");
        int codigoPostal = EntradaSalida.leerEntero();
        System.out.println("Comunidad autonoma");
        String comunidadAutonoma = EntradaSalida.leerTexto();
        //
        System.out.println("longitud en metros");
        int longitud = EntradaSalida.leerEntero();

        double valoracion = EntradaSalida.leerDouble();


        if (selector.equalsIgnoreCase("playa")) {
            String colorBandera = EntradaSalida.leerTexto(); //modofocar para color random

            playas.add(playas.size(), new PlayaGrande(nombre, new Direccion(direccion, codigoPostal, comunidadAutonoma), longitud, valoracion, colorBandera));

        } else if (selector.equalsIgnoreCase("cala")) {

            boolean accesoMinusvalidos = false;
            System.out.println("Tiene acceso para minusvalidos");
            String acceso = EntradaSalida.leerTexto();
            if (acceso.equalsIgnoreCase("si")) {
                accesoMinusvalidos = true;
            }

            playas.add(playas.size(), new Cala(nombre, new Direccion(direccion, codigoPostal, comunidadAutonoma), longitud, valoracion, accesoMinusvalidos));
        }

    }

    public void eliminarPlaya(String nombre) {
        boolean playaBaja = false;
        for (int i = 0; i < playas.size() && !playaBaja; i++) {
            if (playas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Playa " + playas.get(i).getNombre() + "encontrada. Porcediendo a su borrado");
                playas.remove(i);
                playaBaja = true;
            }
        }

    }

    public void listadoPlayasPorLongitud(int longitud) {
        for (int i = 0; i < playas.size(); i++) {
            if (playas.get(i).getLongitud() >= longitud) {
                System.out.println(playas.get(i));
            }

        }
    }
//    public void playasPorComunidad(String comunidad){
//        for (int i = 0; i < playas.size(); i++) {
//
//        }
//    }

}
