package FicherosTexto0;

import java.util.ArrayList;

public class Gestor {

    ArrayList<Repositorios> repos;

    public Gestor() {
        repos = new ArrayList<>();
    }

    public Gestor(ArrayList<Repositorios> repos) {
        this.repos = repos;
    }

    //Nuevo usuario
    public void nuevousuario(){
        repos.add(repos.size(), new Repositorios(generarNombre(), generarNombre()));
    }

    public void mostrarUsuario(){
        for (int i = 0; i < repos.size() ; i++) {
            System.out.println(repos.get(i));
        }
    }


    //gen nom
    public String generarNombre(){
        String nombre[] =  new String[]{"Foo", "pepe", "Chernobyl", "GOT", "Big Bang", "Final", "texto", "Fichero", "Aprobado"};
        int rnd = (int)(Math.random()*nombre.length);
        return nombre[rnd];
    }
}
