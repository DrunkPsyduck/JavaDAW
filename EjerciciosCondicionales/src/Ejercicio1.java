import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double precio;
		
		System.out.println("Introduzca el importe");
		precio=sc.nextDouble();
		
		if (precio > 100) {
			System.out.println("Se le aplica un descuento del 15%");
			precio *= 0.85; 
		}
		
		System.out.println("El total es " + precio);
		sc.close();
	}

}
