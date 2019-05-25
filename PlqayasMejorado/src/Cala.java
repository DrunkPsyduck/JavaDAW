public class Cala extends Playas {

    boolean accesoMinusvalido;

    public Cala(String nombre, int longitud, double[] valoraciones, boolean accesoMinusvalido) {
        super(nombre, longitud, valoraciones);
        this.accesoMinusvalido = accesoMinusvalido;
    }

    public Cala(String nombre, Direccion direccion, int longitud, double valoracion, boolean accesoMinusvalidos) {
        super(nombre, longitud);
        this.accesoMinusvalido = accesoMinusvalidos;
    }

    public boolean isAccesoMinusvalido() {
        return accesoMinusvalido;
    }

    public void setAccesoMinusvalido(boolean accesoMinusvalido) {
        this.accesoMinusvalido = accesoMinusvalido;
    }

    @Override
    public String toString() {
        return "Cala{" +
                "accesoMinusvalido=" + accesoMinusvalido +
                '}';
    }
}
