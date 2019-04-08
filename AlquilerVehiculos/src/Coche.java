public class Coche extends Vehiculos {

    private String color;

    public Coche(String matricula, Modelo modelo, int potencia, String combustible,double precioAlquiler, String color) {
        super(matricula, modelo, potencia, combustible, precioAlquiler);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo=" + modelo +
                ", potencia=" + potencia +
                ", combustible='" + combustible + '\'' +
                ", precioAlquiler= " + precioAlquiler +
                ", color='" + color + '\'' +
                '}';
    }
}
