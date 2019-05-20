package Ejercicio2;

public class Videojuegos  implements Comparable<Videojuegos>{

    private int codigo;
    private int categoria;
    private String nombre;
    private double precioAlquiler;

    public Videojuegos(int codigo, int categoria, String nombre, double precioAlquiler) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precioAlquiler = precioAlquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "codigo=" + codigo +
                ", categoria=" + categoria +
                ", nombre='" + nombre + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                '}';
    }

    @Override
    public int compareTo(Videojuegos videojuegos) {
        return (this.codigo-videojuegos.codigo);
        }
}
