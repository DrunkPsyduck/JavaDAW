import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public static final String ficheroPlayasBinario = "ficheroPlayasBinario.dat";
    public static final String ficheroPlayasTexto = "FicheroPlayasTexto.txt";

    public GestorFicheros() {
    }

    public ArrayList<Playas> leerFichero() throws IOException, ClassNotFoundException {
        File fichero = new File(ficheroPlayasBinario);
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList <Playas> lista = null;
        if (fichero.exists() && fichero.length() > 0) {
            fis = new FileInputStream(fichero);
            entrada = new ObjectInputStream(fis);

            lista = (ArrayList<Playas>) entrada.readObject();
            entrada.close();
        }
        return lista;
    }

    public void escribirFichero(Gestor gestor) throws IOException, ClassNotFoundException{
        File fichero = new File(ficheroPlayasBinario);
        FileOutputStream fos;
        ObjectOutputStream salida;
        if(fichero.exists()&& fichero.length()>0){
            fos = new FileOutputStream(fichero);
            salida  = new ObjectOutputStream(fos);

            salida.writeObject(gestor.playas);
        }
    }
}
