package P2;

public class Profesor {

    private Asignatura asignatura;

    public Profesor(){
        asignatura = new Asignatura();
    }

    public void ponerNotas(){
        asignatura = new Asignatura(Math.random()*10);
    }

    public double calcularMedia(){
        double media = 0;

        double matriz[];

        matriz = new double[5];

        for (int i=0; i < matriz.length;i++) {
            matriz[i] = asignatura.getCalificacion();
        }

        for (int i=0;i < matriz.length; i++){
            media += matriz[i];
        }
        media /= matriz.length;
        return media;
    }
}