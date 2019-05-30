package FicherosBinarios2;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String Apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
