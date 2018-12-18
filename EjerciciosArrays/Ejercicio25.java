import java.io.IOException;

public class Ejercicio25 {
	public static final char punto = 43;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char palabras[][];
		char caracter = 0;
		//boolean pideFin = true;

		palabras = new char[10][];

		for (int i = 0; i < palabras.length&& caracter != punto; i++) {
			for (int j = 0; j < palabras.length ; j++) {
				System.out.println("Introduzca una palabra ");
				caracter = (char) System.in.read();
				palabras[i][j] = caracter;
			}

		}

	}
}