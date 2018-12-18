import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] numeros;

		numeros = new int[10][10];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				if (i % 2 == 0) {
					numeros[i][j] = 1;
				} else {
					numeros[i][j] = 0;
				}

			}

		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.print(numeros[i][j]);

			}
			System.out.println();
		}

		sc.close();

	}

}