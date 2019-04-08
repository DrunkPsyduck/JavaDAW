public class PlayaGrande extends Playas {
    private String colorBandera;

    public PlayaGrande(String nombrePlaya, Direccion direccion, int longitud, double valoracion, String colorBandera) {
        super(nombrePlaya, direccion, longitud, valoracion);
        this.colorBandera = colorBandera;
    }

    public void setColorBandera(String colorBandera) {
        this.colorBandera = colorBandera;
    }
}
