import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//declaración de variables
		double compra;
		double total;
		
		System.out.println("Introduzca el importe de la compra");
		compra=sc.nextFloat();
		total= compra *0.85;
		
		System.out.println("El total de la compra es " + total);
		sc.close();
	}

}
