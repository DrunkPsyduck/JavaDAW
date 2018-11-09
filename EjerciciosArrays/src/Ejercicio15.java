import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char caracter = 0;
		int[] caracteres;
		int aux = 0;
		char enter = 13;

		caracteres = new int[10];

		while (caracter != enter && aux < caracteres.length) {
			System.out.println("Introduzca un carácter: ");
			caracter = sc.next().charAt(0);

			for (int i = 0; i < caracteres.length; i++) {
				caracteres[i] = caracter;
			}
			aux++;
		}

		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o'
					|| caracteres[i] == 'u') {

				caracteres[i]='*';
			}

			System.out.print(caracteres[i]);
		}
		sc.close();
	}

}
