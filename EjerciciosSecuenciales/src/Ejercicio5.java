import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * @author cansanma
		 */
		Scanner sc = new Scanner(System.in);
		double cateto1;
		double cateto2;
		double 	hipotenusa;
		
		System.out.println("Introduzca un cateto");
		cateto1=sc.nextDouble();
		System.out.println("Introduzca otro cateto");
		cateto2=sc.nextDouble();
		
		
		hipotenusa=Math.hypot(cateto1, cateto2);
		
		System.out.println("La hipotenusa es " + hipotenusa);
		
		sc.close();
	}

}
