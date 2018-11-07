import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] numeros;
		int contadorPositivo;
		int contadorNegativo;
		int contadorNull;

		numeros = new int[30];
		contadorPositivo = 0;
		contadorNegativo = 0;
		contadorNull = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un numero");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0) {
				contadorNull++;
			} else if (numeros[i] > 0) {
				contadorPositivo++;
			} else if (numeros[i] < 0) {
				contadorNegativo++;

			}

		}
		System.out.printf("En el array hay: \n %d numeros positivos.\n %d numeros negativos. \n " + "%d nulos.",
				contadorPositivo, contadorNegativo, contadorNull);
		sc.close();

	}
}