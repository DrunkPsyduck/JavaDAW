import java.io.IOException;

public class Ejercicio12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char caracter;
		
		System.out.println("Introduzca una letra");
		caracter =(char) System.in.read();
		
		if (caracter > 63 && caracter < 90 ) {
			System.out.println("Es mayúsucula");
		} else {
			System.out.println("Es minúscula");
		}
	
	}

}