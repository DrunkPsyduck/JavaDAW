import java.util.Arrays;

public class EmpresaAlquiler {

    protected Vehiculo vehiculos[];

    public void mostrarMensaje() {
        System.out.println("                                                                                                                    \n" +
                "  ,---.  ,--.               ,--.,--.                  ,--.   ,--.     ,--.     ,--.              ,--.               \n" +
                " /  O  \\ |  | ,---. ,--.,--.`--'|  | ,---. ,--.--.     \\  `.'  /,---. |  ,---. `--' ,---.,--.,--.|  | ,---.  ,---.  \n" +
                "|  .-.  ||  || .-. ||  ||  |,--.|  || .-. :|  .--'      \\     /| .-. :|  .-.  |,--.| .--'|  ||  ||  || .-. |(  .-'  \n" +
                "|  | |  ||  |' '-' |'  ''  '|  ||  |\\   --.|  |          \\   / \\   --.|  | |  ||  |\\ `--.'  ''  '|  |' '-' '.-'  `) \n" +
                "`--' `--'`--' `-|  | `----' `--'`--' `----'`--'           `-'   `----'`--' `--'`--' `---' `----' `--' `---' `----'  \n" +
                "                `--'                                                                                                ");

    }

    public void inicializarArray() {
        vehiculos = new Vehiculo[20];
    }

    public void inicializarArray(int size) {

        vehiculos = new Vehiculo[size];
    }

    public void rellenarArray() {

        for (int i = 0; i < vehiculos.length / 2; i++) {
            if (i % 2 == 0) {
                vehiculos[i] = new Coche("0000aaa", 90, new Modelo("BMW", "M5", "2016"), 50, "gasolina", "azul");
            } else {
                vehiculos[i] = new Autobus("0001aaa", 150, new Modelo("DRS", "mig", "fechaSalida"), 120, "diesel", 55);
            }
        }
        System.out.println("Aplicación lista para funcionar");
    }

    public void nuevoCoche(String matricula, int potencia, double precioAlquiler, String tipo, String color, String marca, String modelos, String fechaSalida) {
        for (int i = 0; i < vehiculos.length && i % 2 == 0; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = new Coche(matricula, potencia, new Modelo(marca, modelos, fechaSalida), precioAlquiler, tipo, color);
            } else {
                System.out.println("No se ha podido crear el vehiculo seleccionado");
            }
        }
    }

    public String generarMatricula() {
        String matricula = "0000aaa";
        matricula = String.valueOf(Integer.parseInt(matricula) + 1);
        return matricula;
    }

    public void mostrarDatos() {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null)
                System.out.println(vehiculos[i]);
        }
    }

    public void introducirDatos(EntradaSalida es, String tipoVehiculo) {
        System.out.println("introduzca la matricula");
        String matricula = es.lectorNombre();
        System.out.println("introduzca la potencia");
        int potencia = es.lectorEnteros();
        System.out.println("introduzca el precio del alquiler");
        double alquiler = es.lectorDouble();
        System.out.println("introduzca el tipo de combustible");
        String tipo = es.lectorNombre();

        System.out.println("introduzca la marca");
        String marca = es.lectorNombre();
        System.out.println("introduzca el modelo");
        String modelo = es.lectorNombre();
        System.out.println("introduzca el año de lanzamiento");
        String lanzamiento = es.lectorNombre();


        if (tipoVehiculo.equalsIgnoreCase("coche")) {
            System.out.println("introduzca el color");
            String color = es.lectorNombre();
            for (int i = 0; i < vehiculos.length && i % 2 == 0; i++) {
                vehiculos[i] = new Coche(matricula, potencia, new Modelo(marca, modelo, lanzamiento), alquiler, tipo, color);
            }
        } else {
            System.out.println("introduzca la capacidad");
            String capacidad = es.lectorNombre();
            for (int i = 0; i < vehiculos.length && i % 2 == 0; i++) {
                vehiculos[i] = new Coche(matricula, potencia, new Modelo(marca, modelo, lanzamiento), alquiler, tipo, capacidad);
            }
        }


    }

    public void nuevoAutobus(String matricula, int potencia, int precioAlquiler, String tipo, int capacidad, String marca, String modelos, String fechaSalida) {
        for (int i = 0; i < vehiculos.length && i % 3 == 0; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = new Autobus(matricula, potencia, new Modelo(marca, modelos, fechaSalida), precioAlquiler, tipo, capacidad);
            }
        }

    }

    public void borrarElemento(int posicion) {
        vehiculos[posicion] = null;
    }

    public void busquedaCombustible(String combustible) {

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].tipo.equalsIgnoreCase(combustible)) {
                System.out.println(vehiculos[i]);
            } else {
                System.out.print("");
            }
        }
    }


    public boolean busquedaVehiculo(String matricula) {
        boolean encontrado = false;
        for (int i = 0; i < vehiculos.length; i++) {

            if (vehiculos[i] != null && vehiculos[i].matricula.equalsIgnoreCase(matricula)) {
                encontrado = true;
            }

        }
        return encontrado;
    }

    public void eliminarVehiculo(String matricula) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].matricula.equalsIgnoreCase(matricula)) {
                vehiculos[i] = null;
            }
        }
    }

    public void actualizarPotencia(String matricula, int potencia) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].matricula.equalsIgnoreCase(matricula)) {
                vehiculos[i].potencia = potencia;
            }
        }
    }

    public void ordenarPorMatricula() {
        Vehiculo aux[];

        int cont = 0;

        for (int i = 0; i < vehiculos.length; i++) {

            if (vehiculos[i] != null) {
                cont++;
            }
        }

        aux = new Vehiculo[cont];

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                aux[i] = vehiculos[i];
            }
        }

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = i + 1; j < vehiculos.length - 1; j++) {
                if (vehiculos[j] != null && vehiculos[j + 1] != null && vehiculos[j].matricula.compareToIgnoreCase(vehiculos[j + 1].matricula) == 1) {
                    aux[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = vehiculos[j];
                    vehiculos[j] = aux[j];
                }
            }
        }

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null)
                System.out.println(vehiculos[i]);
        }
    }

    public void ordenarAutobusesCapacidad() {

        Vehiculo aux[];
        int cont = 0;
        for (int i = 0; i < vehiculos.length ; i++) {
            if (vehiculos[i] != null) {
                cont++;
            }
        }

        aux = new Vehiculo[cont];

        for (int i = 0; i < vehiculos.length ; i++) {
            if (vehiculos[i] != null) {
                aux[i] = vehiculos[i];
            }
        }

        for (int i = 0; i < vehiculos.length; i++) {
            if (i % 3 == 0) {
                for (int j = 0; j < vehiculos.length - 1; j++) {
                    if (vehiculos[j] != null && vehiculos[j + 1] != null && vehiculos[j] instanceof Autobus) {
                        aux[j] = vehiculos[j + 1];
                        vehiculos[j + 1] = vehiculos[j];
                        vehiculos[j] = aux[j];
                    }
                }
            }
        }
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i] instanceof Autobus)
                System.out.println(vehiculos[i]);
        }
    }
    
}


