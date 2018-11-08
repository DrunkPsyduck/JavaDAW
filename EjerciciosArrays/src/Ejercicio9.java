import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] numeros;
		int suma;
		
		numeros = new int[10];
		suma=0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un numero (" + i + ")" );
			numeros[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (i%2==0) {
				suma += numeros[i];
			}
		}
		System.out.printf("La suma de las posiciones pares es %d", suma);
		sc.close();
	}

}
