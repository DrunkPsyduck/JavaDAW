import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double cuadrado;
		
		System.out.println("Introduca un número");
		int numero = sc.nextInt();
		// cuadrado=numero*numero;
		cuadrado=Math.pow(numero, numero);
		System.out.println("El cuadrdado de " + numero + " es "
				+ cuadrado); 
		sc.close();
	}
}
