package RepasoExamen;

import java.io.Serializable;

public class Videojuegos extends Alquileres {

    private String desarrollador;

    public Videojuegos(int numero, String nombre, String desarrollador) {
        super(numero, nombre);
        this.desarrollador = desarrollador;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return super.toString() +
                "desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
