package Empleados;

public class Tester {
    public static void main(String[] args) {
        GestorEmpleados g = new GestorEmpleados();

        for (int i = 0; i < 1; i++) {
            g.nuevoTrabajador();
        }


        g.mostrarEmpleado();
    }
}
