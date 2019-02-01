package POO2;

public class Medico {

    private String nombre;
    private int edad;
    private char sexo; //true masculino false femenino
    private int horas;
    private double salarioHora;
   // abstract double calcularSalario;

    public Medico(){

    }

    public Medico(String nombre, int edad, char sexo,int horas, double salarioHora){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        this.salarioHora = salarioHora;
    }

    //metodos

    //mostrarDatos()
    //calcularSalario


    public double calcularSalario(){
        double salario;

        salario = horas * salarioHora;
        return salario;

    }
    public String generarNombres(){

        String nombres[]= new String []{ "Mario", "Bill", "Steve", "Elon", "Paul", "Woz", "Mark", "Gavin" };

        int rnd = (int) (Math.random()*nombres.length);
        return nombres[rnd];
    }

    public int generarEdad(){
        int edad = (int) (Math.random()*65);
        return edad;
    }

    public int generarSexo(){
        char sexo[] = new char[]{'h','m'};

        int rnd = (int) (Math.random()*sexo.length);

        return sexo[rnd];
    }

    public int generarHoras(){
        int horas = (int) (Math.random()*40);
        return horas;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "Nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", Sexo=" + sexo +
                ", Horas=" + horas +
                ", salarioHora=" + salarioHora +
                ", Salario=" + calcularSalario() +
                '}';
    }
}
