package Ejercicio2;

import java.io.*;

public class AbrirFichero {

    public static void leer() throws IOException {
        File archivo = new File("../Ficheros/datos.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(archivo);
    }

    public static void main(String[] args) {
        try {
            leer();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
