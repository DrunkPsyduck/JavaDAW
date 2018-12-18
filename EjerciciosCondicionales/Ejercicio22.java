import java.util.*;
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int numero;
		double importe;
		double total;
		
		
		System.out.println("introduzca el importe de su compra");
		importe = sc.nextDouble();
		
		numero = rnd.nextInt(100);
		System.out.println("Ha salido el numero " + numero);
		
		if (numero < 74 ) {
			System.out.println("Su descuento es del 10%");
			total=importe*0.90;
		} else {
			System.out.println("Su descuento es del 20%");
			total=importe*0.80;
		}
		
		System.out.println("El importe final de su compra es " + total + "€");
		sc.close();
	}

}
