import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		float pulgada=0;
		float centimetros=0;
		
		System.out.println("Introduzca las pulgadas ");
		pulgada=sc.nextFloat();
		
		centimetros= (float) (pulgada*2.54); 
		
		System.out.println(pulgada + " pulgadas son " + centimetros + "cm");
		sc.close();
	}

}
