import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		float cantidad = 0;
		int billeteDiez = 0;
		int billetesCinco = 0;
		int monedaCincuenta=0;
		int monedaDiez = 0;
		int monedaCinco = 0;
		int monedaUno = 0;
		
		System.out.println("Introduzca la cantidad");
		cantidad=sc.nextFloat();
							
				while(cantidad>10) {
				
					billeteDiez++;
					cantidad-=10;
				}
				
				
				while (cantidad > 5) {
					billetesCinco++;
					cantidad-=5;
					
				}
				
				while (cantidad < 5) {
					
					monedaCincuenta++;
					cantidad-=0.50;
					
				}
				
				while (cantidad < 0.50) {
					
					monedaDiez++;
					cantidad-=0.10;
				}
				
				while (cantidad == 0.05) {
					
					monedaCinco++;
					cantidad-=0.05;
				}
				while (cantidad == 0.01) {
					
					monedaUno++;
					cantidad-=0.01;
				}
				
			
			
			System.out.println("tienes " + billeteDiez + " billetes de 10€"  );
			System.out.println("Tienes " + billetesCinco + " billetes de 5 €");
			System.out.println("tienes " + monedaCincuenta + " monedads de 50");
			System.out.println("tienes " + monedaDiez + " monedas de 10");
			System.out.println("tienes " + monedaCinco + " monedas de 5");
			System.out.println("Tienes " + monedaUno + " monedas de 1 centimo");
			
			sc.close();
		}
	
	}


