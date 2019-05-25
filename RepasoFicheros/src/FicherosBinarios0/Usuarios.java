package FicherosBinarios0;

import java.io.Serializable;

public class Usuarios implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private String ciudad;

    public Usuarios(String nombre, String apellido, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
