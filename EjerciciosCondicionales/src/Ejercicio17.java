import java.io.IOException;
import java.util.*;

public class Ejercicio17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int resultado;
		char signo;

		System.out.println("introduzca un numero");
		numero1 = sc.nextInt();

		System.out.println("introduzca otro numero");
		numero2 = sc.nextInt();

		System.out.println("Introduzca el signo");
		signo = (char) System.in.read();

		if (signo != '+' && signo != '-' && signo != '*' && signo != '/') {
			System.out.println("No se puede operar los valores");
		} else {
			if (signo == '+') {
				resultado = numero1 + numero2;
				System.out.println("el resultado es " + resultado);
			} else {
				if (signo == '-') {
					resultado = numero1 - numero2;
					System.out.println("el resultado es " + resultado);

				} else {
					if (signo == '*') {
						resultado = numero1 * numero2;
						System.out.println("el resultado es " + resultado);
					} else {
						resultado = numero1 / numero2;
						System.out.println("el resultado es " + resultado);
					}
				}
			}
		}

		sc.close();
	}

}