import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] numeros;
		int busqueda;
		boolean fin = false;

		numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int) (Math.random()*100);
		}
		
		System.out.println("Introduzca el valor a buscar");
		busqueda = sc.nextInt();

		for (int i = 0; i < numeros.length && !fin; i++) {

			if (numeros[i] == busqueda) {
				System.out.printf("El número %d se encuentra en la posicion %d", busqueda, i);
				fin = true;
			} else if (i == numeros.length - 1 && numeros[i] != busqueda) {
				System.out.printf("El número %d no se ha podido encontrar ", busqueda);
				fin = true;
			}

		}
		sc.close();
	}

}
