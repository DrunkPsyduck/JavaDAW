package Ejercicio1;

import java.util.ArrayList;

public class Jugadores {

    private String nombre;
    private int edad;
    private String nombreEquipo;
    private int numeroCAnastasAnotadas;
    private String provincia;

    public Jugadores(){

    }

    public Jugadores(String nombre, int edad, String nombreEquipo, int numeroCAnastasAnotadas, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreEquipo = nombreEquipo;
        this.numeroCAnastasAnotadas = numeroCAnastasAnotadas;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getNumeroCAnastasAnotadas() {
        return numeroCAnastasAnotadas;
    }

    public void setNumeroCAnastasAnotadas(int numeroCAnastasAnotadas) {
        this.numeroCAnastasAnotadas = numeroCAnastasAnotadas;
    }

    public String getProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", numeroCAnastasAnotadas=" + numeroCAnastasAnotadas +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
