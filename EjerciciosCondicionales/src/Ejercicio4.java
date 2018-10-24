import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double lado1;
		double lado2;
		double lado3;

		System.out.println("Introduzca un lado");
		lado1 = sc.nextDouble();

		System.out.println("Introduzca otro lado");
		lado2 = sc.nextDouble();

		System.out.println("Introduzca el ultimo lado");
		lado3 = sc.nextDouble();

		if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			System.out.println("Se puede formar el triangulo");
		} else {
			System.out.println("No se puede formar un triangulo");
		}
		sc.close();
	}

}
