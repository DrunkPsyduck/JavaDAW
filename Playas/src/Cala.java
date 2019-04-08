public class Cala extends Playas {
    private boolean accesoMinusvalidos;

    public Cala(String nombrePlaya, Direccion direccion, int longitud, double valoracion, boolean accesoMinusvalidos) {
        super(nombrePlaya, direccion, longitud, valoracion);
        this.accesoMinusvalidos = accesoMinusvalidos;
    }
}
