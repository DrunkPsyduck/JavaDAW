package FicherosBinarios0;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public static final String ruta = "Fichero0.dat";


    public GestorFicheros() {
    }

    public void generarFichero() throws IOException{
        File archivo = new File(ruta);

        if (!archivo.exists()){
            archivo.createNewFile();
        }
    }

    public ArrayList<Usuarios> leerFichero() throws IOException, ClassNotFoundException {
        File archivo = new File(ruta);

        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Usuarios> lista = null;

        if (archivo.exists() && archivo.length() > 0) {
            fis = new FileInputStream(archivo);
            entrada = new ObjectInputStream(fis);

            lista = (ArrayList<Usuarios>) entrada.readObject();
            entrada.close();

        }
        return lista;
    }

    public void escribirFichero(Gestor gestor)throws IOException{
        File archivo = new File(ruta);

        FileOutputStream fos = null;
        ObjectOutputStream salida=null;

        if (archivo.exists()){
            fos = new FileOutputStream(archivo);
            salida = new ObjectOutputStream(fos);

            salida.writeObject(gestor.usuarios);
            salida.close();
            fos.close();
        }
    }

}
