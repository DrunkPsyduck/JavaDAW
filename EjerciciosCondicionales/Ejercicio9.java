import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduzca un numero");
		numero1=sc.nextInt();
		
		System.out.println("Introduzca otro numero");
		numero2=sc.nextInt();
		
		if(numero1 > numero2 ) {
			System.out.println(numero1 + " es mayor");
			
			if(numero1%numero2==1) {
				numero1 -= numero2;
				System.out.println("resta " + numero1);
			} else {
				numero1 *= numero2;
				System.out.println("multiplicacion " + numero1);
			}
			
		} else {
			
			System.out.println(numero2 + " es mayor");
			if(numero2%numero1==1) {
				numero2 -= numero1;
				System.out.println("resta " + numero2);
			}else {
				numero2 *= numero1;
				System.out.println("multiplicacion " + numero2);
			}
			
		}
		sc.close();
	}

}
