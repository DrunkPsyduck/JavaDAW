package POO2;

public class MedicoAsistenciaDomiciliaria extends Medico {

    private double kmVisitas;
    private double tarifaKm;


    public MedicoAsistenciaDomiciliaria() {
    }

    public MedicoAsistenciaDomiciliaria(double kmVisitas, double tarifaKm) {
        this.kmVisitas = kmVisitas;
        this.tarifaKm = tarifaKm;
    }

    public MedicoAsistenciaDomiciliaria(String nombre, int edad, char sexo, int horas, double salarioHora, double kmVisitas, double tarifaKm) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.kmVisitas = kmVisitas;
        this.tarifaKm = tarifaKm;
    }

    public double calcularSalario(){
        double salario;

        salario = (kmVisitas*tarifaKm)* super.generarHoras();
        return salario;

    }

    public void setKmVisitas(double kmVisitas) {
        this.kmVisitas = kmVisitas;
    }

    public void setTarifaKm(double tarifaKm) {
        this.tarifaKm = tarifaKm;
    }

    public double mostrarDatos(){
        return kmVisitas + tarifaKm;
    }

    @Override
    public String toString() {
        return "MedicoAsistenciaDomiciliaria{" +
                "kmVisitas=" + kmVisitas +
                ", tarifaKm=" + tarifaKm +
                '}';
    }
}
