import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numeroIntroducido;
		int restoNumero;
		int divisionNumero;

		int[] hexadecimal;
		char[] salida;
		char aux;

		hexadecimal = new int[4];
		salida = new char[4];

		System.out.println("introduzca un número entre 0 y 32000 ");
		numeroIntroducido = sc.nextInt();

		while (numeroIntroducido < 0 || numeroIntroducido > 32000) {
			System.out.println("el numero es incorrecto. Vuelva a introducirlo");
			numeroIntroducido = sc.nextInt();
		}

		restoNumero = numeroIntroducido;
		divisionNumero = numeroIntroducido;

		int posicion;
		for (posicion = 0; divisionNumero >= 16; posicion++) {
			restoNumero %= 16;
			hexadecimal[posicion] = restoNumero;
			divisionNumero /= 16;
		}

		hexadecimal[posicion] = divisionNumero;

		for (int i = 0; i < salida.length; i++) {
			if (hexadecimal[i] < 10)
				salida[i] = (char) (hexadecimal[i] + 48);
			else
				salida[i] = (char) (hexadecimal[i] + 55);
		}

		aux = salida[0];
		salida[0] = salida[salida.length - 1];
		salida[salida.length - 1] = aux;
		aux = salida[1];
		salida[1] = salida[salida.length - 2];
		salida[salida.length - 2] = aux;

		for (int j = 0; j < salida.length; j++) {

			System.out.print(salida[j]);

		}

		// System.out.println(salida);

		sc.close();
	}

}