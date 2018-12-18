import java.io.*;

public class Ejercicio19 {

	public static final char espacio = 32;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] numeroPalabras;
		char[] caracteresPalabras;
		int contador = 0;

		numeroPalabras = new int[6];
		caracteresPalabras = new char[20];

		System.out.println("Introduzca las palabras");
		boolean termina=false;
		for (int i = 0; i < caracteresPalabras.length&&!termina; i++) {
			caracteresPalabras[i] = (char) System.in.read();
			if (caracteresPalabras[i]=='.')
				termina=true;
		}
		
		termina=false;

		for (int i = 0; i < caracteresPalabras.length&&!termina;i++) {
			if (!(caracteresPalabras[i] == '.')) {

				contador = 0;
				while (i<caracteresPalabras.length&&caracteresPalabras[i] != espacio&&caracteresPalabras[i] != '.'){
					contador++;
					i++;
				}
				if (contador >=6)
					numeroPalabras[5]++;
				else
					numeroPalabras[contador-1]++;
				
			}
			if (caracteresPalabras[i]=='.')
				termina=true;
			
		}

		for (int i = 0; i < numeroPalabras.length; i++) {
			System.out.printf("Hay %d palabras de %d caracteres\n", numeroPalabras[i],(i+1));
		}

		
	}

}
