public class Tester {
    public static void main(String[] args) {
        GestorVehiculos gv = new GestorVehiculos();
        EntradaSalida es = new EntradaSalida();
        gv.rellenarArray();
     //   gv.mostrarContenido();

        boolean fin = false;


        while(!fin){
            System.out.println("0. Mostrar contenido del array 1.Añadir vehiculo nuevo. 2. Elimiar vehiculos con potencia inferior a X. 3. Busqueda por combustible. 4. Actualizar potencia. 5. Lista de vheiculos ordenados por matriocula. 6. Mostrar autobuses por capacidad introducida");
            int opcion = es.leerEnteros();

            switch(opcion){
                case 1:
                    gv.añadirVehiculo(es);
                    break;
                case 2:
                    //eliminar vehiculos con potencioa inferior a la introducida
                    System.out.println("Introduzca la potencia");
                    int potencia = es.leerEnteros();
                    gv.elimiarVehiculosPotencia(potencia);
                    break;
                case 3:
                    //consulta vehiculos por combustible
                    System.out.println("Tipo de combustible");
                    String combustible = es.leerTexto();
                    gv.busquedaPorCombustible(combustible);
                    break;
                case 4:
                    System.out.println("introduzca la matricula");
                    String busquedaMatricula = es.leerTexto();

                    gv.actualizarPotencia(busquedaMatricula,es);
                    break;
                case 5:
                    //Listado ordenado por matricula
                    gv.ordenarporMatricula();
                    break;
                case 6:
                    //consulta autobuses por capacidad
                    System.out.println("Introduzca la capacidad");
                    int capacidad = es.leerEnteros();

                    gv.busquedaCapacidad(capacidad);
                    break;
                case 8:
                    fin = true;
                    break;
                case 0:
                    gv.mostrarContenido();
                    break;
                default: break;
            }


        }

    }
}
