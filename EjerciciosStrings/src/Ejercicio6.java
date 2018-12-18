import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena = new String("Hola mundo");
		int numeroCaracteres;
		
		System.out.println("Introduce los caracteres que desee");
		numeroCaracteres=sc.nextInt();
		
		System.out.println(cadena.substring(0, numeroCaracteres));
		
		sc.close();
		
	}
}
