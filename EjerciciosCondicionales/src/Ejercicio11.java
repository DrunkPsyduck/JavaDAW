import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;

		System.out.println("Introduzca el primer numero");
		numero1 = sc.nextInt();

		System.out.println("Introduzca el segundo numero");
		numero2 = sc.nextInt();

		System.out.println("Introduzca el tercer numero");
		numero3 = sc.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " es el mayor");
		} else {
			if (numero2 > numero1 && numero2 > numero3) {
				System.out.println(numero2 + " es el mayor");
			} else {
				if (numero3 > numero1 && numero3 > numero2) {
					System.out.println(numero3 + " es el mayor");
				} else {
					System.out.println("Son los tres iguales");
				}
			}
		}
		sc.close();
	}

}
