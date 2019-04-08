public class Modelo {
    protected String marca;
    protected String modelo;
    protected String lanzamiento;

    public Modelo(String marca, String modelo, String lanzamiento){
        this.marca = marca;
        this.modelo = modelo;
        this.lanzamiento = lanzamiento;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", lanzamiento='" + lanzamiento + '\'' +
                '}';
    }
}
