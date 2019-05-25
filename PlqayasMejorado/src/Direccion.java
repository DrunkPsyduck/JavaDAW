public class Direccion {

    private String calle;
    private int codigoPostal;
    private String ComunidadAutonoma;

    public Direccion(String calle, int codigoPostal, String comunidadAutonoma) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        ComunidadAutonoma = comunidadAutonoma;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getComunidadAutonoma() {
        return ComunidadAutonoma;
    }

    public void setComunidadAutonoma(String comunidadAutonoma) {
        ComunidadAutonoma = comunidadAutonoma;
    }
}
