package Ejercicio2Desktop;

import java.awt.*;
import java.io.*;

public class AbrirFichero {

    static String ruta= "../Ficheros/datos.txt";
    File archivo = new File(ruta);

    public static void abrirFichero(){
        Desktop archivo = Desktop.getDesktop();

        try{
            archivo.open(new File(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        abrirFichero();

    }

}
