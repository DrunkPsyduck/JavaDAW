import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduzca un numero");
		numero1=sc.nextInt();
		
		System.out.println("Introduzca otro numero");
		numero2=sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			if (numero1 > numero2) {
				System.out.println(numero1 +  " es mayor que " + numero2);
			} else {
				System.out.println(numero2 +  " es mayor que " + numero1);
			}
		}
		
		sc.close();
	}

}
