
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros;
		int aux;

		numeros = new int[10];
		aux = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				aux = numeros[9];
				numeros[9] = numeros[i];
				numeros[i] = aux;
			} else if (i == 1) {
				aux = numeros[8];
				numeros[8] = numeros[i];
				numeros[i] = aux;
			} else if (i == 2) {
				aux = numeros[7];
				numeros[7] = numeros[i];
				numeros[i] = aux;
			} else if (i == 3) {
				aux = numeros[6];
				numeros[6] = numeros[i];
				numeros[i] = aux;
			} else if (i == 4) {
				aux = numeros[5];
				numeros[5] = numeros[i];
				numeros[i] = aux;
			}

			System.out.print(numeros[i] + " ");
		}

	}

}
