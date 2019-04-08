package Ejercicio3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CrearFichero {
    static String ruta = "../Ficheros/";
    static String nombre = "ArchivoCreado.txt";

    public static void crearFichero() throws IOException {


        File archivo = new File(ruta + nombre);

        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

        if (Files.exists(Paths.get(ruta + nombre)) == true) {
            for (int i = 0; i < 15; i++) {
                bw.write("Hola mundo. Esta es la línea " + i +"\n");
            }
        }

        bw.close();
    }

    public static void main(String[] args) {
        try {
            crearFichero();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
