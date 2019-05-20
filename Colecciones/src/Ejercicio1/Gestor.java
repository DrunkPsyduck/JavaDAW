package Ejercicio1;
import java.util.ArrayList;
public class Gestor {

    protected ArrayList<Jugadores> jugadores;

    public Gestor(){
        jugadores = new ArrayList<>();
    }

    public void nuevoJugador(){
        System.out.println("Nombre");
        String nombre = EntradaSalida.leerTexto();
        System.out.println("Edad");
        int edad = EntradaSalida.leerEnteros();
        System.out.println("Nombre equipo");
        String nombreEquipo = EntradaSalida.leerTexto();
        System.out.println("Canastas introducidas");
        int canastasIntroducidas = EntradaSalida.leerEnteros();
        System.out.println("Provincia");
        String provincia = EntradaSalida.leerTexto();

        jugadores.add(jugadores.size(),new Jugadores(nombre, edad,nombreEquipo,canastasIntroducidas,provincia));

    }
    public void consultaPorNombre(){
        System.out.println("introduzca nombre");
        String nombre = EntradaSalida.leerTexto();

        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println(jugadores.get(i));
            }
        }
    }

    public void consultaPorProvincia(){
        System.out.println("Introduzca la provincia");
        String provincia = EntradaSalida.leerTexto();

        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getProvincia().equalsIgnoreCase(provincia)){
                System.out.println(jugadores.get(i));
            }
        }
    }

    public void modificarCanastas(){
        System.out.println("Introduzca nombre del jugador");
        String nombre = EntradaSalida.leerTexto();

        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.get(i).getNombre().equals(nombre)){
                System.out.println("Introdzuca las nuevas canastas");
                int nuevasCanastas = EntradaSalida.leerEnteros();
                jugadores.get(i).setNumeroCAnastasAnotadas(nuevasCanastas);

            }
        }
    }

    public void borradoJugadorRangoCanastas(){
        System.out.println("Introduzca las canastas minimas");
        int minimas = EntradaSalida.leerEnteros();
        System.out.println("Canastas maximas");
        int maximas = EntradaSalida.leerEnteros();


        for (int i = 0; i < jugadores.size() ; i++) {
            if(jugadores.get(i).getNumeroCAnastasAnotadas() >minimas && jugadores.get(i).getNumeroCAnastasAnotadas()<maximas){
                jugadores.remove(i);
            }
        }

    }

    public void borradoCompleto(){
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.remove(i);
        }
    }

    public void mostrarColeccion(){
        for (int i = 0; i < jugadores.size() ; i++) {
            System.out.println(jugadores.get(i));
        }
    }

}
