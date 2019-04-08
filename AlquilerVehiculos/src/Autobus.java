public class Autobus extends Vehiculos {

    private int capacidadPasajeros;

    public Autobus(String matricula, Modelo modelo, int potencia, String combustible, double precioAlquiler,int capacidadPasajeros) {
        super(matricula, modelo, potencia, combustible, precioAlquiler);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "matricula='" + matricula + '\'' +
                ", modelo=" + modelo +
                ", potencia=" + potencia +
                ", combustible='" + combustible + '\'' +
                ", precioAlquiler= " + precioAlquiler +
                ", capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}
