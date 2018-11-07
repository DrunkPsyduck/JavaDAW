
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] numeros;

		numeros = new int[30];
		int contadorNull = 0;
		int contadorPositivo = 0;
		int contadorNegativo = 0;

		for (int i = 0; i < numeros.length; i++) {
			// Rango aleatoreos de numeros -100 +100
			numeros[i] = -100 + (int) (Math.random() * ((100 - (-100)) + 1));

		}

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > 0) {
				contadorPositivo++;
			} else if (numeros[i] < 0) {
				contadorNegativo++;
			} else {
				contadorNull++;
			}

		}
		System.out.printf("Hay %d nulos. \n Hay %d positivos. \n Hay %d Negativos. ", contadorNull, contadorPositivo,
				contadorNegativo);
		sc.close();
	}

}