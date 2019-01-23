package P2;

public class Profesor {

    private Asignatura asignatura;
    private double suma;

    public Profesor(){
        asignatura = new Asignatura(3, 5);
    }

    public void ponerNotas(){
        asignatura = new Asignatura(Math.random()*10);
    }

    public double getSuma(){

        return suma;
    }

    public void setCalcularSuma(double calificaciones){
       suma += calificaciones;

    }

    public double getMedia(){
        double media;

        media = suma;

        return media;
    }
}
