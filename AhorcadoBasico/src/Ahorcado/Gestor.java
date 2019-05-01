package Ahorcado;

import java.io.IOException;

public class Gestor {
    protected String palabras[];

    public Gestor(){

    }

    public void inicializar(){
        palabras = new String[20];
    }
    public void inicilializarPropio(int longitud){
        palabras = new String[longitud];
    }

    public String diccionario(){

        String []diccionario = {"agua", "coche", "lamborghini", "nighthawk"};

        int random = (int)(Math.random()*diccionario.length);

        return diccionario[random];
    }

    public String codificador(){
        String palabra = diccionario();

        int nCaracteres = palabra.length();
        String longitud ="";

        for (int i = 0; i < nCaracteres ; i++) {
            longitud += "_ ";
        }

        return longitud ;
    }

    public char leerLetra() throws IOException {

        String palabra = diccionario();
        char letra = (char) System.in.read();


        return letra;
    }

    public void juego() throws IOException {
        boolean fin =false;
        char letra = leerLetra();
        for (int i = 0; i < diccionario().length() ; i++) {
            if (diccionario().charAt(i) == letra){
                System.out.print(letra);
            } else {
                System.out.print("_ ");
            }
        }
    }

}
