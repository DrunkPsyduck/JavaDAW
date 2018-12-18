import java.io.IOException;

public class Ejercicio17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[] cadena;
		char enter = 13;
		char caracter = 0;
		int contadorPalabras = 0;

		cadena = new char[50];

		System.out.println("¿Cual es su palabra?");
		for (int i = 0; i < cadena.length && caracter != enter; i++) {

			caracter = (char) System.in.read();
			cadena[i] = caracter;
		}

		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i] == 32 && cadena[i+1]!=32) {
				contadorPalabras++;
			}

		}
		System.out.println(contadorPalabras+1);
	}

}