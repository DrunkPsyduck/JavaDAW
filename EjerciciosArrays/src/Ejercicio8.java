import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float []numeros;
		float valorMaximo;
		int posicion;
		int posicionMaximo;
		
		numeros = new float[20];
		valorMaximo=0;
		posicionMaximo=0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número (" + i +")");
			numeros[i]= sc.nextFloat();
		}
		
		for (posicion = 0; posicion < numeros.length; posicion++) {
			if (numeros[posicion] > valorMaximo) {
				valorMaximo = numeros[posicion];
				posicionMaximo = posicion;
			}
		}
		System.out.printf("El valor máximo que se encuentra es %f, en la posicion %d", valorMaximo, posicionMaximo);
		sc.close();
	}

}