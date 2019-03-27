package Ejercicio2;

import java.util.Scanner;
public class Tester {

    public static void vocal(char caracter) throws EsVocalException, EsConsonanteException {

        if (Character.isDigit(caracter)){
            throw new EsVocalException();
        } else  {
            throw new EsConsonanteException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        String caracter = sc.next();
        char caracter1 = caracter.charAt(0);



        try{
           vocal(caracter1);

        } catch(EsVocalException | EsConsonanteException es){
            System.out.println(es.getMessage());
        }

    }
}
