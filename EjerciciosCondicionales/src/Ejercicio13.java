import java.io.IOException;

public class Ejercicio13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char caracter;
		
		System.out.println("Introduzca un carácter");
		caracter = (char) System.in.read();
		
		if (caracter>64 && caracter<91) {
			System.out.println("Es mayúscula");
		} else {
			if (caracter>96 && caracter<123) {
				System.out.println("Es minúscula");				
			} else {
				System.out.println("Es otro carácter");
			}
		}
		
	}

}
