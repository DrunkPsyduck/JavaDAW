import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int anio;
		
		System.out.println("introduzca el año");
		anio=sc.nextInt();
		
		if((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
		sc.close();
	}

}