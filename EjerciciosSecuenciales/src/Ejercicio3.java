import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int resultado;
		
		System.out.println("Introduzca un numero ");
		 num1 = sc.nextInt();
		System.out.println("Introduzca otro numero ");
		num2 = sc.nextInt();
		System.out.println("Introduzca otro numero ");
		num3 = sc.nextInt();
		
		resultado=(num1+num2)/num3;
		System.out.println("El resultado es " + resultado);
		
		sc.close();
	}
}
