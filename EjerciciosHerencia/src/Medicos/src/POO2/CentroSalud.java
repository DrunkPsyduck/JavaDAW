package POO2;

public class CentroSalud {
    private int identificador;
    private String nombre;
    private String domicilio;
    private int localidad; //código Postal

    public CentroSalud() {

    }

    public CentroSalud(int identificador, String nombre, String domicilio, int localidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.localidad = localidad;
    }
}
