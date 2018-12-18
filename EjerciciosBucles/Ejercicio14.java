import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int numero;
		int fila = 1;
		int contador;

		System.out.println("Introduzca el numero de veces que desea repetirlo");
		numero = sc.nextInt();

		while (fila < (numero + 1)) {
			contador = fila;

			while (contador > 0) {

				System.out.print("*");

				contador--;


			}
			fila++;
			System.out.println("\n");
		}

		fila--;
		while(fila>0) {
			contador=1;
			while( contador<=fila)  {
				System.out.print("*");
				contador++;
			}
			System.out.println("\n");
			fila--;
		}


		sc.close();

	}

}
