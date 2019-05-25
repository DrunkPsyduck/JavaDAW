package Empleados;

public class JefeProyecto extends Trabajador{
    private int trabajadoresAsignados;

    public JefeProyecto(String nombre, String apellidos, int añoIncorporacion, double salario, int trabajadoresAsignados) {
        super(nombre, apellidos, añoIncorporacion, salario);
        this.trabajadoresAsignados = trabajadoresAsignados;
    }

    public int getTrabajadoresAsignados() {
        return trabajadoresAsignados;
    }

    public void setTrabajadoresAsignados(int trabajadoresAsignados) {
        this.trabajadoresAsignados = trabajadoresAsignados;
    }

    @Override
    public String toString() {
        return super.toString() +
                "trabajadoresAsignados=" + trabajadoresAsignados +
                '}';
    }
}
