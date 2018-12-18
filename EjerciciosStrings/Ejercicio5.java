import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Introduzca su texto");
		texto = sc.nextLine();
		
		System.out.println(texto.toUpperCase());
		
		sc.close();
		
	}

}
