package Empleados;
import java.util.ArrayList;

public class Programador extends Trabajador {

    String lenguajes;

    public Programador(String nombre, String apellidos, int añoIncorporacion, double salario, String lenguajes) {
        super(nombre, apellidos, añoIncorporacion, salario);
        this.lenguajes = lenguajes;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return super.toString() +
                " lenguajes=" + lenguajes ;
    }
}
