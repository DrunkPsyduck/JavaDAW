import java.util.Scanner;
public class EntradaSalida {

    public static String leerTexto(){
        Scanner sc = new Scanner(System.in);

        String lector = sc.nextLine();

        return lector;
    }

    public static int leerEntero(){
        Scanner sc = new Scanner(System.in);

        int lector = sc.nextInt();

        return  lector;
    }

    public static double leerDouble(){
        Scanner sc = new Scanner(System.in);

        double lector = sc.nextDouble();

        return lector;
    }
}
