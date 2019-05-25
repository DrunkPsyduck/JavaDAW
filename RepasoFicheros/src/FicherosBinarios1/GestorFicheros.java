package FicherosBinarios1;
import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public static final String fichero = "Fichero1.dat";

    public GestorFicheros(){

    }

    public void generarFichero() throws IOException{
        File fich = new File(fichero);

        if (!fich.exists()){
            fich.createNewFile();
        }
    }


    public ArrayList<Repositorio> leerFichero() throws IOException, ClassNotFoundException{
        File archivo = new File(fichero);

        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Repositorio> lista= null;
        //Cuidado inicializaciones. Antes del if TODO A NULO

        if (archivo.exists() && archivo.length()>0){
            fis = new FileInputStream(archivo);
            entrada = new ObjectInputStream(fis);
            lista = (ArrayList<Repositorio>) entrada.readObject();
            entrada.close();

        }
        return lista;
    }


    public void escribirFichero(Gestor g) throws IOException{
        File archivo = new File(fichero);

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        if (archivo.exists()){
            fos = new FileOutputStream(archivo);
            salida = new ObjectOutputStream(fos);

            salida.writeObject(g.repos);
            salida.close();
            fos.close();
        }
    }
}
