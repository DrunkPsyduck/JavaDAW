public class GestorVehiculos {

    Vehiculos[] vehiculos = new Vehiculos[20];

    public void tamañoArray(int size) {
        vehiculos = new Vehiculos[size];
    }

    public void rellenarArray() {
        for (int i = 0; i < vehiculos.length / 2; i++) {
            if (vehiculos[i] == null && i % 2 == 0) {
                vehiculos[i] = new Coche(generarMatriculas(), new Modelo(devuelveMarcas(), devuelveModelo(), devuelveAño()), potencia(), combustible(), devuelveprecioAlquiler(), devuelveColor());
            } else {
                vehiculos[i] = new Autobus(generarMatriculas(), new Modelo(devuelveMarcas(), devuelveModelo(), devuelveAño()), potencia(), combustible(), devuelveprecioAlquiler(), devuelveCapacidad());
            }
        }
    }

    public void mostrarContenido() {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null)
                System.out.println(vehiculos[i]);
        }
    }

    public void añadirVehiculo(EntradaSalida es) {
        boolean tareaFinalizada = false;

        System.out.println("añadir coche o autobus");
        String tipoVehiculo = es.leerTexto();

        if (tipoVehiculo.equalsIgnoreCase("coche") || tipoVehiculo.equalsIgnoreCase("autobus")) {

            //Entrada parametros
            System.out.println("Matricula: ");
            String Matricula = es.leerTexto();
            System.out.println("Marca");
            String marca = es.leerTexto();
            System.out.println("Modelo");
            String modelo = es.leerTexto();
            System.out.println("Año lanzamiento");
            String lanzamiento = es.leerTexto();
            System.out.println("Potencia");
            int potencia = es.leerEnteros();
            System.out.println("Combustible");
            String combustible = es.leerTexto();
            System.out.println("Precio Alquiler");
            double precioAlquiler = es.leerdouble();


            for (int i = 0; i < vehiculos.length && !tareaFinalizada; i++) {
                if (vehiculos[i] == null && tipoVehiculo.equalsIgnoreCase("coche")) {
                    System.out.println("Color");
                    String color = es.leerTexto();
                    vehiculos[i] = new Coche(Matricula, new Modelo(marca, modelo, lanzamiento), potencia, combustible, precioAlquiler, color);
                    tareaFinalizada = true;
                    System.out.println("Vehiculo añadido");
                } else if (vehiculos[i] == null & tipoVehiculo.equalsIgnoreCase("autobus")) {
                    System.out.println("Capacidad");
                    int capacidad = es.leerEnteros();
                    vehiculos[i] = new Autobus(Matricula, new Modelo(marca, modelo, lanzamiento), potencia, combustible, precioAlquiler, capacidad);
                    tareaFinalizada = true;
                    System.out.println("Vehiculo añadido");
                }
            }
        } else {
            System.out.println("Vehiculo no reconocido");
        }

    }

    public void elimiarVehiculosPotencia(int potencia) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getPotencia() < potencia) {
                vehiculos[i] = null;
                System.out.println("Vehiculo eliminado");
            }
        }
    }

    public void busquedaPorCombustible(String combustible) {

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].combustible.equalsIgnoreCase(combustible)) {
                System.out.println(vehiculos[i]);
            }

        }
    }

    public void actualizarPotencia(String nuevaMatricula, EntradaSalida es) {
        boolean potenciaActualizada = false;

        for (int i = 0; i < vehiculos.length && !potenciaActualizada; i++) {
            if (vehiculos[i] != null && vehiculos[i].matricula.equalsIgnoreCase(nuevaMatricula)) {

                System.out.println("Nueva potencia");
                int potencia = es.leerEnteros();

                vehiculos[i].potencia = potencia;
                potenciaActualizada = true;

            }
        }
    }

    public void ordenarporMatricula() {
        Vehiculos aux;

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if (vehiculos[i] != null && vehiculos[j] != null && vehiculos[i].matricula.compareToIgnoreCase(vehiculos[j].matricula) < 0) {
                    aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;
                }
            }
        }

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null)
                System.out.println(vehiculos[i]);
        }
    }

    public void busquedaCapacidad(int capacidad) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i] instanceof Autobus) {
                System.out.println(vehiculos[i]);
            }
        }
    }

    public String generarMatriculas() {
        int matriculas = (int) (Math.random() * 8999)+1000;

        return matriculas + "";
    }

    public String devuelveMarcas() {
        String[] marcas = {"Porsche", "Nissan", "Ferrari", "BMW", "Ford", "Lada", "Bentley", "Mercedes", "Fiat", "Vauxhall"};
        int random = (int) (Math.random() * marcas.length);
        return marcas[random];
    }

    public String devuelveModelo() {
        String[] modelo = {"917", "GTR R-35", "f450", "M5", "Mustang", "Niva", "Continental", "E180", "Multipla", "Corsa"};
        int random = (int) (Math.random() * modelo.length);
        return modelo[random];
    }

    public String devuelveAño() {
        String[] año = {"2000", "2001", "2010", "2012", "2016", "2018", "2017", "2015"};
        int random = (int) (Math.random() * año.length);
        return año[random];
    }

    public int potencia() {
        int potencia = (int) (Math.random() * 600) + 90;
        return potencia;
    }

    public String combustible() {
        String combustible = "Gasolina";
        int random = (int) (Math.random() * 100);

        if (random % 2 == 0) {
            combustible = "Diesel";
        }
        return combustible;
    }

    public double devuelveprecioAlquiler() {
        double precio = (Math.random() * 200) + 60;

        precio = (Math.round(precio) * 0.10);
        return precio;
    }

    public String devuelveColor() { //Solo coche
        String[] color = {"Verde", "Rojo", "Negro", "Azul", "Plateado", "Amarillo", "Negro mate", "Blanco", "Marron",};
        int random = (int) (Math.random() * color.length);
        return color[random];
    }

    public int devuelveCapacidad() {
        int capacidad = (int) (Math.random() * 80);
        return capacidad;
    }
}
