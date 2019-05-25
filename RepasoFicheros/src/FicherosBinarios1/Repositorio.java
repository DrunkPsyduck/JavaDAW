package FicherosBinarios1;

import java.io.Serializable;

public class Repositorio implements Serializable {
    private String nombre;
    private int identificador;
    private String creador;


    public Repositorio(){

    }

    public Repositorio(String nombre, int identificador, String creador) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }



    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Repositorio{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                ", creador='" + creador + '\'' +
                '}';
    }
}
