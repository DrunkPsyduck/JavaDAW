import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int destino[];

		int[] origen = { 10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32 };

		int tama�o;
		tama�o = 0;
		// Asignar valores del array
//		vector[0] = 10;
//		vector[1] = 25;
//		vector[2] = 26;
//		vector[3] = 40;
//		vector[4] = 37;
//		vector[5] = 45;
//		vector[6] = 90;
//		vector[7] = 76;
//		vector[8] = 78;
//		vector[9] = 81;
//		vector[10] = 58;
//		vector[11] = 32;

		for (int i = 0; i < origen.length; i++) {
			if (origen[i] > 25 && origen[i] % 2 == 0) {

				tama�o++;

			}

		}

		destino = new int[tama�o];

		for (int i = 0, j = 0; i < origen.length; i++) {

			if (origen[i] > 25 && origen[i] % 2 == 0) {

				destino[j] = origen[i];
				j++;

			}

		}

		System.out.println(" los valores del primer array son: ");
		for (int i = 0; i < origen.length; i++) {

			System.out.println(origen[i]);
		}

		System.out.println("Los n�meros mayores de 25 y sean pares son:  ");
		for (int i = 0; i < destino.length; i++) {

			System.out.println(destino[i]);
		}
		sc.close();
	}

}
