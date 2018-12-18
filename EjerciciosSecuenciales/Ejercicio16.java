import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Declaracion de variables
		double precioCompra;
		double beneficio;
		double precioVenta;
		
		System.out.println("introduzca el precio de compra");
		precioCompra=sc.nextDouble();
		
		beneficio=precioCompra*1.30;
		
		precioVenta=precioCompra+beneficio;
		System.out.println("Para obtener beneficio debe tener un precio superior a " + precioVenta +"€");
		
		sc.close();		
	}

}
