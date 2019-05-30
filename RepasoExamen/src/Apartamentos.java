public class Apartamentos  extends Alojamientos{

    private int numeroHabitaciones;
    private String servicioHabitaciones;
    public Apartamentos() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Apartamentos(String nombre, String provincia, int valoraciones, int numeroHabitaciones, String servicioHabitaciones) {
        super(nombre, provincia, valoraciones);
        this.numeroHabitaciones = numeroHabitaciones;
        this.servicioHabitaciones = servicioHabitaciones;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + " numero Habitaciones " + numeroHabitaciones + " servicio Habitaciones "
                + servicioHabitaciones;
    }

    public String ToStringFichero() {
        return super.toStringFichero()+  numeroHabitaciones + ";" + servicioHabitaciones;
    }


    @Override
    public int compareTo(Alojamientos o) {
        return 0;
    }
}
