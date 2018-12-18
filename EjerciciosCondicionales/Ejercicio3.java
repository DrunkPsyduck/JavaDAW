import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int divisor;
		int dividendo;
		
		System.out.println("Introduzca un numero");
		divisor = sc.nextInt();
		
		System.out.println("introduzca otro numero");
		dividendo = sc.nextInt();
		
		if( divisor%dividendo==0 ) {
			System.out.println("DIVISIBLES");
		} else {
			System.out.println("No divisibles");
		}
		
		sc.close();
	}

}
