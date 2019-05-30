import java.util.Scanner;

public class EntradaSalida {

	public static String LeerTextoSaltoLinea() {
		//leer varias palabras
		Scanner sc = new Scanner(System.in);
		
		String lector = sc.nextLine();
		return lector;
	}
	
	public static String leerTextoLinea() {
		Scanner sc = new Scanner(System.in);
		String lector = sc.next();
		return lector;
	}
	
	public static int leerEnteros() {
	Scanner sc = new Scanner(System.in);
	int lector = sc.nextInt();
	return lector;
	}
}
