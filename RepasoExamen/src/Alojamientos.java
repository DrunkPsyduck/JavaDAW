import java.io.Serializable;

public abstract class Alojamientos implements Serializable,Comparable<Alojamientos> {

    private static final long SerialVersionUID = 15L;
    //private static final

    private String nombre;
    private String provincia;
    private int valoracion;

    public Alojamientos() {

    }

    public Alojamientos(String nombre, String provincia, int valoracion) {
        super();
        this.nombre = nombre;
        this.provincia = provincia;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" \n nombre " + nombre + " provincia " + provincia + " valoracion " + valoracion  ;
    }

    //ToStringVarios

    public String toStringFichero() {
        return getClass().getSimpleName().charAt(0)+";"+nombre +";"+ provincia +";" + valoracion +";";
    }

    @Override
    public int compareTo(Alojamientos alojamiento) {
        return this.nombre.compareTo(alojamiento.nombre);
    }
}
