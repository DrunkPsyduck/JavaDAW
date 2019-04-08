import java.util.Scanner;
public class EntradaSalida {
    public String leerTexto(){
        Scanner sc = new Scanner(System.in);

        String lector = sc.nextLine();

        return lector;
    }

    public int leerEnteros(){
        Scanner sc = new Scanner(System.in);

        int lector = sc.nextInt();

        return lector;
    }

    public double leerdouble(){
        Scanner sc = new Scanner(System.in);

        double lector= sc.nextDouble();

        return lector;
    }
}
