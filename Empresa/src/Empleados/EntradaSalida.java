package Empleados;
import java.util.Scanner;
public class EntradaSalida {
    public static String leerTexto(){
        Scanner sc = new Scanner (System.in);

        String lector = sc.nextLine();

        return lector;
    }

    public static Double leerDouble(){
        Scanner sc = new Scanner (System.in);

        Double lector = sc.nextDouble();

        return lector;
    }

    public static int leerEnteros(){
        Scanner sc = new Scanner (System.in);

        int lector = sc.nextInt();

        return lector;
    }

}
