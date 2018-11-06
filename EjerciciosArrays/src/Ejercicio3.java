import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] numeros;		
		int maximo = 15;
		int [] invertir;
		
		numeros = new int[15];
		invertir = new int[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número ");
			numeros[i] = sc.nextInt();
			
		}
		
		
			for (int i = 0; i < numeros.length; i++) {
				invertir[maximo -1] = numeros[i];
				System.out.println(maximo);
				maximo--;
			}
			
		sc.close();
	}

}
