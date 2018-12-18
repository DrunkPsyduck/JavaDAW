import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		int num1;
		int num2;
		int suma;
		
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro numero");
		num2=sc.nextInt();
		
		suma=num1+num2;
		System.out.println("La suma entre " + num1 + " y " +
				num2 + " es igual a " + suma);
		
		sc.close();

	}

}
