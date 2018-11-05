import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] vector;
		int numeroSuma;
		int i;

		vector = new int[15];

		for (i = 0; i < vector.length; i++) {
			System.out.println("introduzca un número " + "(" + i + ")");
			vector[i] = sc.nextInt();

		}
		System.out.println("Indique cuantos numeros desea sumar: ");
		numeroSuma = sc.nextInt();

		i = 0;
		
		/*
		 * Problema en la suma de los elementos del array.
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 15 at
		 * 		Ejercicio1.main(Ejercicio1.java:24)
		 */
		
		while (i < numeroSuma) {
			numeroSuma += vector[i];
			i++;
		}

		System.out.printf("La suma es: %d \n", numeroSuma);

		System.out.println("Contenido del Array: ");

		for (i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + ", ");
		}
		sc.close();
	}

}
