import java.util.Scanner;

public class LetraChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Letras");
        String letras = sc.next();

        char cara1 = letras.charAt(0);
        char cara2 = letras.charAt(1);
        char cara3  =letras.charAt(2);

        int operacion = cara1 - cara2 + cara3;

        char resultado = (char) operacion;

        System.out.println((int)cara1);
        System.out.println((int)cara2);
        System.out.println((int)cara3);


        System.out.println(resultado);

    }
}
