package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Gestor{



    TreeSet<Videojuegos> videojuegos;

    public Gestor() {

        videojuegos = new TreeSet<Videojuegos>();
    }



    public void añadirNuevoJuego(){
        System.out.println("Introduzca el codigo");
        int codigo = EntradaSalida.leerEnteros();
        System.out.println("Introduzca la categoria");
        int categoria = EntradaSalida.leerEnteros();
        System.out.println("Introduzca el nombre");
        String nombre = EntradaSalida.leerTexto();
        System.out.println("Introduzca el precio del alquiler");
        double alquiler = EntradaSalida.leerDouble();
        System.out.println(videojuegos);
        videojuegos.add(new Videojuegos(codigo,categoria, nombre, alquiler));
    }

    public void mostrarContenido(){
        Iterator<Videojuegos> it = videojuegos.iterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
    public void modificarContenido1(){
       //ArrayList<Videojuegos> aux = new ArrayList<>(videojuegos); // ArrayList para modificar un elemento lueg se guarda en el treeSet
        Iterator<Videojuegos> it = videojuegos.iterator();

        while (it.hasNext()){
            Videojuegos aux =it.next(); //Guardar la referencia del TreeSet luego se muetra la posicion del TreeSet y no de la referencia
            if (aux.getNombre().equalsIgnoreCase("dieog")&&(aux.getCategoria()==2)) {
                System.out.println("encontrado");
            }
        }
    }
    public void consulta(){
        System.out.println("Introduzca el precio del alquiler");
        double alquiler = EntradaSalida.leerDouble();
        System.out.println("introduzca categoría");
        int categoria = EntradaSalida.leerEnteros();

        System.out.println(videojuegos);

    }

    //consultas por precio alquiler

    //borrado

    public void borrado(){
        for (int i = 0; i < videojuegos.size(); i++) {
            videojuegos.iterator().remove();
        }
    }


}
