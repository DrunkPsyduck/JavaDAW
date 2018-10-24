import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radio=0; 
		double area=0;
		double longitud=0;
		
		System.out.println("Introduzca el radio");
		radio=sc.nextDouble();
		
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área es " +  area);
		
		longitud = 2* Math.PI * radio;
		System.out.println("La longitud es " + longitud);
		sc.close();
	}

}

