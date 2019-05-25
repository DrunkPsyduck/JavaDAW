package Empleados;

import java.util.ArrayList;

public class GestorEmpleados {

    protected ArrayList<Trabajador> trabajadores;

    public GestorEmpleados() {
        trabajadores = new ArrayList<>();
    }

    public GestorEmpleados(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void nuevoTrabajador() {
        System.out.println("programador o jefe");
        String empleado = EntradaSalida.leerTexto();

        System.out.println("nombre");
        String nombre = EntradaSalida.leerTexto();
        System.out.println("Apellidos");
        String apellido = EntradaSalida.leerTexto();
        System.out.println("Departamento");
        String departamento = EntradaSalida.leerTexto();
        System.out.println("Año incorporacion");
        int año = EntradaSalida.leerEnteros();
        System.out.println("Salario");
        Double salario = EntradaSalida.leerDouble();

        if (empleado.equalsIgnoreCase("programador")) {
            System.out.println("Cuantos lenguajes?");
            int nLeng = EntradaSalida.leerEnteros();

            String lenguaje = "";
            for (int i = 0; i < nLeng; i++) {
                System.out.println("nombre del lenguaje");
                String nombreLenguaje = EntradaSalida.leerTexto();


                lenguaje = lenguaje + (nombreLenguaje + ",");
            }
            trabajadores.add(trabajadores.size(), new Programador(nombre, apellido, año, salario, lenguaje));
        } else if (empleado.equalsIgnoreCase("jefe")) {
            System.out.println("personas a cargo");
            int personal = EntradaSalida.leerEnteros();
            trabajadores.add(trabajadores.size(), new JefeProyecto(nombre, apellido, año, salario, personal));
        }
    }

    public void mostrarEmpleado() {
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i) instanceof Programador) {
                System.out.println(trabajadores.get(i));
            } else

                System.out.println(trabajadores.get(i));
        }
    }
}
