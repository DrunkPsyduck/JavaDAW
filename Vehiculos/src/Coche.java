public class Coche extends Vehiculo {

    protected String color;

    public Coche() {
        super();
        this.color = "Plateado";
    }

    public Coche(String matricula, int potencia, Modelo modelo, double precioAlquiler, String tipo, String color) {
        super(matricula, potencia, modelo, precioAlquiler, tipo);
        this.color = color;
    }


}
