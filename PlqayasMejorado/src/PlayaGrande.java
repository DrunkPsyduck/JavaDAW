
public class PlayaGrande extends Playas {

    private String colorBandera;

    public PlayaGrande(String nombre, Direccion direccion, int longitud, double valoracion, String colorBandera) {
        super(nombre, longitud);
        this.colorBandera = colorBandera;
    }

    public PlayaGrande(String nombre, int longitud, double[] valoraciones, String colorBandera) {
        super(nombre, longitud, valoraciones);
        this.colorBandera = colorBandera;
    }

    public String getColorBandera() {
        return colorBandera;
    }

    public void setColorBandera(String colorBandera) {
        this.colorBandera = colorBandera;
    }

    @Override
    public String toString() {
        return "PlayaGrande{" +
                "colorBandera='" + colorBandera + '\'' +
                '}';
    }
}
