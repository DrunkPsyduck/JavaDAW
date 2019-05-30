package FicherosTexto0;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public static final String fichero = "ficheroTXT0.txt";

    public GestorFicheros(){
        File file = new File(fichero);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<String> leerFichero() throws IOException{
        File file = new File (fichero);

        BufferedReader entrada = null;
        ArrayList<String> lista = new ArrayList<>();

        if (file.exists()){
            entrada = new BufferedReader(new FileReader(file));
            String cadena = entrada.readLine();

            while(cadena!=null){
                lista.add(cadena);
                cadena = entrada.readLine();
            }
        } else {
            file.createNewFile();
        }

        return lista;
    }
}
