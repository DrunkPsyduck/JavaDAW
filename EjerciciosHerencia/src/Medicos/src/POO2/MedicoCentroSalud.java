package POO2;

public class MedicoCentroSalud extends Medico {

    private int identificador;
    private String nombre;
    private String domicilio;
    private int  codigoPostal;


    public MedicoCentroSalud() {
    }

    public MedicoCentroSalud(int identificador, String nombre, String domicilio, int codigoPostal) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
    }

    public MedicoCentroSalud(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //metodos

    //mostrarDatos() herencia
    //calcularSalario herencia


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setId(int id){
        this.identificador = id;
    }

    public int generarIdentificador(){
        int id = (int) (Math.random()*20)+1;

        return id;
    }

    public String generaNombres(){

        String [] nombre = new String[]{"pepe", "mengano", "foo", "sally",
                "Ava Adore", "Mellon Collie", " Gavin "};

        int rnd = (int)(Math.random()*nombre.length);
        return nombre[rnd];
    }

    public int generarCodPostal(){
        int cp = (int)(Math.random()*99999);

        return cp;
    }
    @Override
    public String toString() {
        return "MedicoCentroSalud{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
