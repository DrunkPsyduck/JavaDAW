package RepasoExamen;

import java.io.Serializable;

public class Peliculas extends Alquileres
{

    private String productora;

    public Peliculas(int numero, String nombre, String productora) {
        super(numero, nombre);
        this.productora = productora;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return super.toString() +
                "productora='" + productora + '\'' +
                '}';
    }
}
