public class Autobus extends Vehiculo {

    protected int capacidadPasajeros;

    public Autobus(){
        super();
        capacidadPasajeros = 55;
    }

    public Autobus(String matricula, int potencia, Modelo modelo, double precioAlquiler, String tipo, int capacidadPasajeros) {
        super(matricula, potencia, modelo, precioAlquiler, tipo);
        this.capacidadPasajeros = capacidadPasajeros;
    }



}
