import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precio;
		int cantidad;
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el precio");
		precio = sc.nextInt();
		
		System.out.println("Inbtroduzca la cantidad");
		cantidad = sc.nextInt();
		
		total = precio*cantidad;
		System.out.println("El total es " + total);
		
		sc.close();
	}

}
