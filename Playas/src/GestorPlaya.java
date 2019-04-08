public class GestorPlaya {

    private Playas playas[];

    public void inicializarArray(int tamaño) {
        playas = new Playas[tamaño];
    }

    public void rellenarArray() {
        for (int i = 0; i < playas.length; i++) {
            if (i % 2 == 0) {
                playas[i] = new PlayaGrande("fahj", new Direccion("calle falsa", 4546, "madrid"), 4562, 4.4, "Verde");
            } else {
                playas[i] = new Cala("cala maoa", new Direccion("oeic", 44444, "Murcia"), 250, 2.0, true);
            }
        }
    }

    public void mostrarInformacion() {
        for (int i = 0; i < playas.length; i++) {
            if (playas[i] != null)
                System.out.println(playas[i]);
        }
    }

    public void borrarPlaya(String nombrePlaya){
        for (int i = 0; i < playas.length; i++) {
            if(playas[i]!=null && playas[i].nombrePlaya.equalsIgnoreCase(nombrePlaya) && playas[i] instanceof PlayaGrande){
                playas[i] = null;
            }
        }
    }

    public void nuevaPlaya(EntradaSalida es){

        System.out.println("Nombre de la playa");
        String nombrePlaya=es.leerTexto();
        System.out.println("nombre de la calle");
        String nombreCalle = es.leerTexto();
        System.out.println("Codigo Postal");
        int codigoPostal = es.leerEnteros();
        System.out.println("Comunidad autonoma");
        String comunidadAutonoma = es.leerTexto();
        System.out.println("Longitud de la playa");
        int longitud = es.leerEnteros();
        System.out.println("Valoracion");
        double valoracion = es.leerdouble();
        String bandera = es.leerTexto();


        boolean nuevaPlaya = false;
        for (int i = 0; i < playas.length && !nuevaPlaya; i++) {
            if(playas[i]==null){
                playas[i] = new PlayaGrande(nombrePlaya, new Direccion(nombreCalle,codigoPostal,comunidadAutonoma),longitud, valoracion, bandera);
                nuevaPlaya = true;
            } else {
                System.out.println("No se pudo dar de alta la playa");
            }
        }
    }

    public void listadoPlayasLongitud(int longitud){
        for (int i = 0; i < playas.length; i++) {
            if(playas[i] != null && playas[i].longitud > longitud){
                System.out.println(playas[i]);
            } else {
                System.out.println("No se ha encontrado nada");
            }
        }
    }

    public void listadoPlayasComunidadAutonoma(String comunidadAutonoma){
        for (int i = 0; i < playas.length; i++) {
            if(playas[i]!=null && playas[i].direccion.getComunidadAutonoma().equalsIgnoreCase(comunidadAutonoma)){
                System.out.println(playas[i]);
            } else{
                System.out.println("No se ha encontrado ninguna playa con esas caracteristicas");
            }
        }
    }

    public void modificarDireccion(EntradaSalida es){
        boolean encontrado= false;
        for (int i = 0; i < playas.length && !encontrado; i++) {


            System.out.println("1. cambiar la calle. 2. cambiar el codigo postal. 3.Cambiar La comunidad autonoma");
            int seleccion = es.leerEnteros();
            switch (seleccion){
                case 1:
                    System.out.println("Introduzca el nuevo nombre");
                    String nuevoNombre = es.leerTexto();

                    playas[i].direccion.setCalle(nuevoNombre);
                    System.out.println(playas[i].toString());
                    break;
                case 2:
                    System.out.println("introduzca el nuevo codigo postal");
                    int nuevoCP = es.leerEnteros();

                    playas[i].direccion.setCodigoPostal(nuevoCP);
                    System.out.println(playas[i]);
                    break;
                case 3:

                    System.out.println("Introduzca la nueva CA");
                    String nuevaComunidad = es.leerTexto();

                    playas[i].direccion.setComunidadAutonoma(nuevaComunidad);
                    System.out.println(playas[i]);
                    break;
                default:
                    System.out.println("no válido");
            }
            encontrado = true;
        }
    }

    public void modificarBandera(String nombrePlaya, String nuevaBandera){
        for (int i = 0; i < playas.length; i++) {
            if(playas[i]!=null && playas[i].nombrePlaya.equalsIgnoreCase(nombrePlaya) && playas[i] instanceof PlayaGrande){
                playas[i] = new PlayaGrande(playas[i].nombrePlaya, playas[i].direccion,playas[i].longitud, playas[i].valoracion, nuevaBandera);
            }
        }
    }

    public void oredenarPlayas(){
        Playas aux;

        for (int i = 0; i < playas.length ; i++) {
            for (int j = i; j < playas.length-1; j++) {
                if (playas[i]!=null && playas[j]!=null && playas[i].valoracion>playas[j].valoracion) {
                    aux = playas[j];
                    playas[i] = playas[j];
                    playas[j] = aux;
                }
            }
        }
        for (int i = 0; i < playas.length; i++) {
            System.out.println(playas[i]);
        }
    }
}
