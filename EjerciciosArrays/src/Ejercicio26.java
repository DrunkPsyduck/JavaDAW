import java.io.IOException;

public class Ejercicio26 {

	public static final char punto = 46;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char palabras[][];
		char caracter;
		boolean fin = false;
		int aux;
		palabras = new char[5][15];

		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Introduzca su palabra");
			caracter = (char) System.in.read();
			fin = false;
			
			for (int j = 0; j < palabras[i].length && !fin; j++) {

				palabras[i][j] = caracter;
				if (caracter == punto) {
					fin = true;
				}
			}
		}

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < palabras.length; j++) {
				if (palabras[i + 1][j] > palabras[i][j]) {
					aux = palabras[i + 1][j];
					palabras[i + 1][j] = palabras[i][j];
					palabras[i][j] = (char) aux;
				}
			}
		}

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < palabras.length; j++) {
				System.out.print(palabras[i][j]);
			}
			System.out.println();
		}

	}

}
