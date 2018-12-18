import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int base;
		int exponente;
		int potencia = 0;
		int contador = 1;

		System.out.println("introduzca la base");
		base = sc.nextInt();

		System.out.println("Introduzca el exponente");
		exponente = sc.nextInt();

		if (exponente == 0) {
			potencia = 1;
		} else if (exponente == 1) {
			potencia = base;
		} else {

			while (contador >= exponente) {

				potencia = base * base;

				contador++;
			}

		}
		System.out.println("El resultado de la potencia es " + potencia);
		sc.close();

	}

}
