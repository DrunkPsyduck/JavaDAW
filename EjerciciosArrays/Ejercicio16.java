import java.io.IOException;

public class Ejercicio16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char caracter = 0;
		char caracteres[];
		char caracteresVolteados[];
		boolean palindromo;
		int contador;
		
		caracteres = new char[10];
		caracteresVolteados = new char[caracteres.length];

		System.out.println("Introduzca su palabra");
	
		for ( contador = 0; contador < caracteres.length && caracter != 13; contador++) {
			caracter = (char) System.in.read();
			caracteres[contador] = caracter;
		}

		

		for (int i = 0, j=caracteres.length-1; i < caracteres.length; i++, j--) {
			
			caracteresVolteados[i] = caracteres[j];
			System.out.print(caracteresVolteados[i]);
		}
		
		System.out.println();
				
		palindromo = true;
		
		for (int i = caracteres.length-contador+1,j=0; j < contador-1; i++, j++) {
			if (caracteresVolteados[i] != caracteres[j]) 
				palindromo = false;
		}

		if (palindromo == true) {
			
			System.out.println("Es palindromo");

		} else {
			System.out.println("No es palindromo");
			
		}
	}

}
