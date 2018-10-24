import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double importe;
		double total;
		
		System.out.println("Introduzca el importe de la compra");
		importe = sc.nextDouble();
		
		if (importe < 10) {
			System.out.println("no dispone de descuento");
		} else {
			if (importe > 10 && importe <= 30) {
				total=importe*0.90;
				System.out.println("Se aplica un descuento del 10%. El total es " + total + "€");
			} else {
				total=importe*0.70;
				System.out.println("Se aplica un descuento del 30%. El total es " + total + "€");
			}
		}
		sc.close();
	}

}