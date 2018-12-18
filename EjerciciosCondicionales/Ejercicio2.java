import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char nombreProducto;
		double precio;
		int cantidad;
		int descuento;
		double total;
		
		
		System.out.println("Introduzca el nombre del producto");
		nombreProducto= (char) System.in.read();
		
		System.out.println("Introduzca el precio");
		precio = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad del producto");
		cantidad = sc.nextInt();
		
		total = precio * cantidad;
		
		if (total >= 10000 || nombreProducto=='A') {
			System.out.println("Introduzca el descuento");
			descuento = sc.nextInt();
			
			precio =  (precio*descuento)/100;
			total -= descuento;
		}
		
		System.out.println("El total es " + total);
		sc.close();
	}

}
