
public class Ejercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];
		array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		// Listar contenido
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// ordenar array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = 0;
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
		// Calcular media
		int suma = 0;
		int media = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;
		System.out.println("La media es " + media);

		// copia invertida del array

		int copia[];
		copia = new int[array.length];

		for (int i = 0; i < copia.length; i++) {

			copia[i] = array[array.length-i-1];
			
		}

		for (int i = 0; i < copia.length; i++) {
			System.out.print(copia[i] + " ");
		}
	}

}
