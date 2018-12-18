import java.io.IOException;

public class Ejercicio20 {
	public static final char punto = 46;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char [] minuscula;
		boolean fin=false;
		
		
		minuscula = new char[20];
		
		System.out.println("Introduzca su frase");
		for (int i = 0; i < minuscula.length&&!fin; i++) {
			minuscula[i]=(char)System.in.read();
			if (minuscula[i]==punto) {
				fin=true;
			}
		}
		
		for (int i = 0; i < minuscula.length; i++) {
			minuscula[i] = Character.toUpperCase(minuscula[i]);
		}
		
		for (int i = 0; i < minuscula.length; i++) {
			System.out.print(minuscula[i]);

		}
	}

}
