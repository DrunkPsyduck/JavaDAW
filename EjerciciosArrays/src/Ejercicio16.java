import java.io.IOException;

public class Ejercicio16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char caracter = 0;
		char caracteres[];
		char caracteresVolteados[];
		boolean palindromo;

		caracteres = new char[10];
		caracteresVolteados = new char[caracteres.length];

		System.out.println("Introduzca su palabra");

		/*
		 * 2 arrays. 1 el original. En el otro se voltearan los caracteres. si array1[i]
		 * == arrayVolteado[j] -> Son palindromos
		 */
		
		for (int i = 0; i < caracteres.length && caracter != 13; i++) {
			caracter = (char) System.in.read();
			caracteres[i] = caracter;
		}

	

		for (int i = caracteres.length, j = 0; i < caracteres.length; i--, j++) {
			caracteresVolteados[i] = caracteres[j];
			
		}

		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == caracteresVolteados[i]) {
				palindromo = true;
			} else {
				palindromo = false;
			}
		}

		if (palindromo = true) {
			
			System.out.println(palindromo + ", son palindromos" );
			/*
			 * System.out.print(caracteres[i]); System.out.print(caracteresVolteados);
			 */

		} else {
			System.out.println("No son palindromos");
			// System.out.print(caracteres[i]);
			// System.out.print(caracteresVolteados);
		}
	}

}
