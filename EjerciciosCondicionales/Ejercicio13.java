import java.io.IOException;

public class Ejercicio13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char caracter;
		
		System.out.println("Introduzca un car�cter");
		caracter = (char) System.in.read();
		
		if (caracter>64 && caracter<91) {
			System.out.println("Es may�scula");
		} else {
			if (caracter>96 && caracter<123) {
				System.out.println("Es min�scula");				
			} else {
				System.out.println("Es otro car�cter");
			}
		}
		
	}

}
