package Ejercicio4;
import java.io.*;
public class Ejercicio4 {

    static String ruta = "../Ficheros/datos.txt";

    public static void leerArchivo() throws IOException{
        File archivo = new File(ruta);

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String texto = br.readLine();
        System.out.println(texto);
    }

    public static void main(String[] args) {

        try {
            leerArchivo();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
