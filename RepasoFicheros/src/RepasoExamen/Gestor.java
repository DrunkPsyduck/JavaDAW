package RepasoExamen;
import java.util.ArrayList;
public class Gestor {

    protected ArrayList<Alquileres> alquiler;

    public Gestor() {
        alquiler = new ArrayList<>();
    }

    public Gestor(ArrayList<Alquileres> alquiler) {
        this.alquiler = alquiler;
    }


    public void masContenido(){
        System.out.println("pelicula(1)o videojuego(2");
        int opc = EntradaSalida.leerEnteros();

        if (opc == 1){
            alquiler.add(alquiler.size(),new Peliculas(generarNumero(),nombres(),nombres()));
        } else if (opc == 2){
            alquiler.add(alquiler.size(),new Videojuegos(generarNumero(),nombres(),nombres()));
        }

    }

    public void mostrarContenido(){
        for (int i = 0; i < alquiler.size(); i++) {
            System.out.println(alquiler.get(i));
        }
    }


    public int generarNumero(){
        int numero  =(int)(Math.random()*1555);

        return numero;
    }

    public String nombres(){
        String[] nombres = new String[]{"pepe", "agua", "kakaka", "Fro", "loei", "222","wt", "msuhd", "isi"};

        int rnd = (int)(Math.random()*nombres.length);

        return nombres[rnd];
    }

}
