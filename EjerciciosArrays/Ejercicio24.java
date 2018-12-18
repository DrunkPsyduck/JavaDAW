
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros;
		int aux = 0;

		numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {

				if (numeros[j + 1] >   numeros[j]) {

					aux = numeros[j + 1];
					numeros[j + 1] = numeros[j];
					numeros[j] = aux;

				}

			}

		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
	}

}
