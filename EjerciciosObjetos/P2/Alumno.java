package P2;

public class Alumno {
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    public Alumno(){
        asignatura1 = new Asignatura(1, 5.6);
        asignatura2 = new  Asignatura(2, 10);
        asignatura3 = new Asignatura(3,10.0);
    }

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno (int id1, int id2, int id3){
        this.asignatura1.setIdentificador(id1);
        this.asignatura2.setIdentificador(id2);
        this.asignatura3.setIdentificador(id3);
    }

    public Alumno(double asignatura1){
        this.asignatura1.setCalificacion(asignatura1); 
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
}