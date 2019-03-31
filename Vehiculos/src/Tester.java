public class Tester {
    public static void main(String[] args) {
        EmpresaAlquiler empresa = new EmpresaAlquiler();
        EntradaSalida es = new EntradaSalida();

        empresa.mostrarMensaje();

        empresa.inicializarArray();
        empresa.rellenarArray();


        boolean fin = false;
        while (!false) {
            System.out.println("1. Mostrar datos\n2. introducir un nuevo vehiculo\n3. Eliminar vehiculos\n4. Busqueda por combustible\n5. Actualizar potencia"
                    + "\n6. Lista de vehiculos ordenada\n7. Consulta de autobuses por capacidad\n99. salir ");
            int selector = es.lectorEnteros();

            switch (selector) {
                case 1:
                    System.out.println("mostrar datos");
                    empresa.mostrarDatos();

                    break;
                case 2:
                    System.out.print("Introduzca el tipo de vehículo\n>");
                    String vehiculo = es.lectorNombre();

                    if (vehiculo.equalsIgnoreCase("coche") || vehiculo.equalsIgnoreCase("autobus")) {
                        empresa.introducirDatos(es, vehiculo);

                    } else {
                        System.out.println("No se reconoce el tipo de vehículo");
                    }
                    break;
                case 3:
                    System.out.println("Eliminar vehículos");
                    System.out.println("Introduzca la matricula");
                    String matricula = es.lectorNombre();
                    empresa.eliminarVehiculo(matricula);
                    break;
                case 4:
                    System.out.println("Consulta por combustible");
                    System.out.println("¿Busca vehiculos diesel o gasolina?");
                    String combustible = es.lectorNombre();
                    empresa.busquedaCombustible(combustible);
                    break;
                case 5:
                    // actualizar potencia vehiculo
                    System.out.println("Introduzca la matricula");
                    matricula = es.lectorNombre();

                    if (empresa.busquedaVehiculo(matricula) == true) {
                        System.out.println("¿Cuanta potencia desea poner?");
                        int potencia = es.lectorEnteros();
                        empresa.actualizarPotencia(matricula, potencia);
                    } else

                        break;
                case 6:
                    //listado ordenado por matricula
                    empresa.ordenarPorMatricula();
                    break;
                case 7:
                    //consulta autobuses por capacidad introducida
                    empresa.ordenarAutobusesCapacidad();
                    break;
                case 0:
                    System.out.println("array rellenado con datos por defecto");
                    empresa.rellenarArray();
                    break;
                case 99:
                    fin = true;
                    break;
                default:
                    System.out.println("No válido");
            }
        }
    }
}
