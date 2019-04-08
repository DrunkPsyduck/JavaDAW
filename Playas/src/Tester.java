public class Tester    {
    public static void main(String[] args) {
        GestorPlaya gp = new GestorPlaya();
        EntradaSalida es = new EntradaSalida();

        gp.inicializarArray(10);
        gp.rellenarArray();

       // gp.mostrarInformacion();

        boolean fin = false;

        while (!fin){
            String nombrePlaya;
            System.out.println("Introduzca opcion");

            int opcion = es.leerEnteros();

            switch(opcion){
                case 1:
                    System.out.println("Introduzca el nombre de la playa que quiera borrar");
                    nombrePlaya = es.leerTexto();
                    gp.borrarPlaya(nombrePlaya);
                    break;
                case 2:
                    gp.nuevaPlaya(es);
                    break;
                case 3:
                    System.out.println("Introduzca la longitud");
                    int longitud = es.leerEnteros();
                    gp.listadoPlayasLongitud(longitud);
                    break;
                case 4:
                    System.out.println("introduzca la comunidad autonoma");
                    String comunidadAutonoma = es.leerTexto();
                    gp.listadoPlayasComunidadAutonoma(comunidadAutonoma);
                    break;
                case 5:
                    gp.modificarDireccion(es);
                    break;
                case 6:
                    System.out.println("Introduzca el nombre de la playa");
                    nombrePlaya = es.leerTexto();
                    System.out.println("Introduzca el color de la bandera");
                    String colorBandera = es.leerTexto();
                    gp.modificarBandera(nombrePlaya,colorBandera);
                    break;
                case 7:
                    gp.oredenarPlayas();
                    break;
                case 8:
                    fin = true;
                    break;
                default:
                    System.out.println("no valido");
            }


        }
    }
}
