package Empleados;

public abstract class Trabajador {
    private String nombre;
    private String apellidos;
    private int añoIncorporacion;
    private double salario;

    public Trabajador(String nombre, String apellidos, int añoIncorporacion, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.añoIncorporacion = añoIncorporacion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", añoIncorporacion=" + añoIncorporacion +
                ", salario=" + salario;
    }
}
