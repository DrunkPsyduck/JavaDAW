package RepasoExamen;

import java.io.Serializable;

public abstract class Alquileres implements Serializable{
    private int numero;
    private String nombre;

    public Alquileres(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "numero=" + numero +
                ", nombre='" + nombre  + ", " ;
    }
}
