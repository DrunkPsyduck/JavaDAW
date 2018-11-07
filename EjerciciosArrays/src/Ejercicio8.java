import java.util.Scanner;
<<<<<<< HEAD
public class Ejercicio8 {
=======
public class Ejercicio9 {
>>>>>>> 6cb6d5bb470a4caf37487d4762a51a01f5146a2a

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
<<<<<<< HEAD
			System.out.println("Introduzca un número (" + i +")");
			numeros[i]= sc.nextFloat();
		}
		
		for (posicion = 0; posicion < numeros.length; posicion++) {
=======
			System.out.println("Introduzca un nÃºmero (" + i +")");
			numeros[i]= sc.nextFloat();
		}
		
		for (posicion= 0; posicion < numeros.length; posicion++) {
>>>>>>> 6cb6d5bb470a4caf37487d4762a51a01f5146a2a
			if (numeros[posicion] > valorMaximo) {
				valorMaximo = numeros[posicion];
				posicionMaximo = posicion;
			}
		}
<<<<<<< HEAD
		System.out.printf("El valor máximo que se encuentra es %f, en la posicion %d", valorMaximo, posicionMaximo);
		sc.close();
	}

}
=======
		System.out.printf("El valor mÃ¡ximo que se encuentra es %f, en la posicion %d", valorMaximo, posicionMaximo);
		sc.close();
	}

}
>>>>>>> 6cb6d5bb470a4caf37487d4762a51a01f5146a2a
