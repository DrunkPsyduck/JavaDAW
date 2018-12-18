import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int vecesSuma;
		int [] vector;
		int suma = 0;
		
		
		vector = new int[15];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca un numero");
			vector[i] = sc.nextInt();
			
		}
	
		System.out.println("¿Cuántos numeros desea sumar? ");
		vecesSuma = sc.nextInt();
		
		for (int i = 0; i < vecesSuma; i++) {
			suma += vector[i];
		}
		System.out.printf("La suma de los primeros %d números es %d ", vecesSuma, suma );
		sc.close();
	}

}
