import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int factorial = 1;
		
		System.out.println("Introduzca el numero");
		numero = sc.nextInt();
		
		
		while(numero!=0) {
			factorial*=numero;
			numero--;
		}
		System.out.println(factorial);
		sc.close();
	}

}
