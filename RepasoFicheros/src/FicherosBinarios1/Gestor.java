package FicherosBinarios1;
import java.util.ArrayList;
public class Gestor {
    ArrayList<Repositorio>repos;

    public Gestor(){
        repos = new ArrayList<>();
    }

    public Gestor(ArrayList<Repositorio> repos) {
        this.repos = repos;
    }

    public void nuevoRepo(){
        String nombre = generarNombre();
        int id = generarId();
        String autor = generarCreador();

        repos.add(repos.size(), new Repositorio(nombre,id,autor));
    }

    public void mostrarRepositorios(){
        for (int i = 0; i < repos.size(); i++) {
            System.out.println(repos.get(i));
        }
    }

    public String generarNombre(){
        String [] nombre = new String[]{"Drunk Psyduck", "Chernobyl", "Press", "IntellIj", "Algorithm"};
        int aleatoreo = (int)(Math.random()*nombre.length);

        return nombre[aleatoreo];
    }

    public int generarId(){
        int id = (int)(Math.random()*5000)+1;

        return id;
    }

    public String generarCreador(){
        String [] nombre = new String[]{"Drunk Psyduck", "Steve","Bill","Elon","Paul"};
        int rnd = (int)(Math.random()*nombre.length);
        return nombre[rnd];
    }
}
