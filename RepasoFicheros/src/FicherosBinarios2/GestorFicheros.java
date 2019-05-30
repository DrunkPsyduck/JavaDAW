package FicherosBinarios2;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    protected static final String fichero = "Fichero2.dat";

    public GestorFicheros() {
    }

    public void generarFichero() throws IOException{
        File archivo = new File(fichero);

        if (!archivo.exists()){
            archivo.createNewFile();
        }
    }

    //escribir fichero
    public void escribir(Gestor g) throws IOException{
        File file = new File(fichero);

        ObjectOutputStream salida = null;

        if (file.exists()){
            salida = new ObjectOutputStream(new FileOutputStream(file));

            salida.writeObject(g.persona);

            salida.close();
        }
    }

    public ArrayList<Persona> leer() throws IOException, ClassNotFoundException {
        File file = new File(fichero);

        ObjectInputStream entrada = null;
        ArrayList<Persona> lista = null;

        if (file.exists()){
            entrada = new ObjectInputStream(new FileInputStream(file));
            lista = new ArrayList<>();

            lista = (ArrayList<Persona>) entrada.readObject();

        }


        return lista;
    }

}
