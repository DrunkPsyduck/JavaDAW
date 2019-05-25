public abstract class Playas {

    private String nombre;
    private int longitud;
    //array valoraciones
    protected double valoraciones[];




    public Playas(){

    }

    public Playas(String nombre, int longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public Playas(String nombre, int longitud, double[] valoraciones) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.valoraciones = valoraciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public double[] getValoraciones() {
        return valoraciones;
    }

//    public void setValoraciones(double valoracion) {
//        for (int i = 0; i < valoraciones.length && valoraciones.length< 101 ; i++) {
//            if (valoraciones[i] == null){
//                valoraciones[i] = valoracion;
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Playas{" +
                "nombre='" + nombre + '\'' +
                ", longitud=" + longitud +
                '}';
    }
}
