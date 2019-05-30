import java.util.Iterator;
import java.util.TreeMap;

public class Hoteles extends Alojamientos{

    private String servicios;
    private int categoria;


    public Hoteles(String nombre, String provincia, int valoracion, int categoria, String servicios) {
        super(nombre, provincia, valoracion);
        this.servicios = servicios;
        this.categoria = categoria;
    }


    public int getCategoria() {
        return categoria;
    }




    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }





    public String getServicios() {
        return servicios;
    }




    public void setServicios(String servicios) {
        this.servicios = servicios;
    }




    @Override
    public String toString() {
        return super.toString() + " categoria " + categoria + " Servicios " + servicios;
    }

    public String toStringFichero() {
        return super.toStringFichero()+  categoria +";"+ servicios;
    }


    @Override
    public int compareTo(Alojamientos o) {
        return 0;
    }
}
