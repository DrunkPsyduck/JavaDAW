import java.io.IOException;
import java.util.*;

public class Ejercicio16 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		char tipo;
		double cantidad;
		double total = 0;

		System.out.println("Introduzca el tipo de zanahoria(A/B/C/D/F)");
		tipo = (char) System.in.read();
		
		System.out.println("Introduzca la cantidad");
		cantidad = sc.nextDouble();

		if (tipo == 'A' ) {
			total = cantidad * 1.5;
		} else {
			if (tipo == 'B') {
				total = cantidad * 1.8;
			} else {
				if (tipo == 'C') {
					total = cantidad * 2.1;
				} else if (tipo == 'D') {
					total = cantidad * 2.5;
				} else {
					if (tipo == 'F') {
						total = cantidad * 3.2;
					} else {
						System.out.println("No existe ese tipo");
					}
				}
			}
		}
		System.out.println("El total es " + total);
		sc.close();
	}
}