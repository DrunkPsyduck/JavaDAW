import java.io.IOException;

public class Ejercicio18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char palabras[];

		palabras = new char[50];

		char caracter;

		System.out.println("Introduzca la palabra");
		for (int i = 0; i < palabras.length; i++) {

			caracter = (char) System.in.read();
			palabras[i] = caracter;
//reverso
			if (!(palabras[i] == 'S' && palabras[i + 1] == 'T' && palabras[i + 2] == 'O' && palabras[i + 3] == 'P')) {

			}
		}

	}

}
