public class Playas {
    protected String nombrePlaya;
    protected Direccion direccion;
    protected int longitud;
    protected double valoracion;

    public Playas(String nombrePlaya, Direccion direccion, int longitud, double valoracion) {
        this.nombrePlaya = nombrePlaya;
        this.direccion = direccion;
        this.longitud = longitud;
        this.valoracion = valoracion;
    }

    public String getNombrePlaya() {
        return nombrePlaya;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getLongitud() {
        return longitud;
    }

    public double getValoracion() {
        return valoracion;
    }



    @Override
    public String toString() {
        return "Playas{\n" +
                "nombrePlaya='" + nombrePlaya + '\'' +
                ", direccion=" + direccion +
                ", longitud=" + longitud +
                ", valoracion=" + valoracion +
                '}';
    }
}
