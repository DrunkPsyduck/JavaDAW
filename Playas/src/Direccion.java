public class Direccion {
    private String calle;
    private int codigoPostal;
    private String comunidadAutonoma;

    public Direccion(String calle, int codigoPostal, String comunidadAutonoma) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.comunidadAutonoma = comunidadAutonoma;
    }

    public String getCalle() {
        return calle;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setComunidadAutonoma(String comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", comunidadAutonoma='" + comunidadAutonoma + '\'' +
                '}';
    }
}