import java.io.IOException;

public class Ejercicio15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//char caracter = 0;
		char[] caracteres;
		char enter = 13;
		int aux = 0;

		caracteres = new char[10];

		System.out.println("Introduzca un carácter: (para finalizar pulse ENTER)");
		while (aux < caracteres.length /*&& caracter != enter*/) {
			caracteres[aux] = (char) System.in.read();
			if (caracteres[aux] == enter) {
				aux = caracteres.length;
				//break;
			}
			aux++;
		}

		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o'
					|| caracteres[i] == 'u' || caracteres[i] == 'A' || caracteres[i] == 'E' || caracteres[i] == 'I'
					|| caracteres[i] == 'O' || caracteres[i] == 'U') {
				caracteres[i] = '*';

			}
			System.out.print(caracteres[i] + " ");

		}

	}

}