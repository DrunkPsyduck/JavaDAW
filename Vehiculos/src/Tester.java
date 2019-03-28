public class Tester {
    public static void main(String[] args) {
        EmpresaAlquiler empresa = new EmpresaAlquiler();
        EntradaSalida es = new EntradaSalida();

        empresa.mostrarMensaje();

        System.out.print("nuevo coche o autobus\n>");
        String vehiculo =  es.lectorNombre();

        if (vehiculo.equalsIgnoreCase("coche")){
            System.out.println("Introduzca matricula");
            String matricula = es.lectorNombre();
            System.out.println("potencia");
            int potencia = es.lectorEnteros();
            System.out.println("marca");
            String marca = es.lectorNombre();
            System.out.println("modelos");
            String modelo = es.lectorNombre();
            System.out.println("fecha lanzamiento");
            String fechaLanzamiento = es.lectorNombre();
            System.out.println("Precio del alquiler");
            double precioAlquiler = es.lesctorDouble();
            System.out.println("Combustible");
            String combustible = es.lectorNombre();
            System.out.println("color");
            String color = es.lectorNombre();

            empresa.nuevoCoche(matricula,potencia,precioAlquiler, combustible, color, marca, modelo, fechaLanzamiento);

        } else if (vehiculo.equalsIgnoreCase("autobus")){

        } else {
            System.out.println("buuuuu");
        }

        System.out.println(empresa);

    }
}
