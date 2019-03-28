import java.util.Scanner;
public class EntradaSalida {

    public String lectorNombre() {
        Scanner sc = new Scanner(System.in);

        String lector = sc.next();
        return lector;
    }

    public int lectorEnteros() {
        Scanner sc = new Scanner(System.in);

        int lector = sc.nextInt();
        return lector;
    }

    public double lesctorDouble() {
        Scanner sc = new Scanner(System.in);

        double lector = sc.nextDouble();
        return lector;

    }
}