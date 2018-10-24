import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		numero3=sc.nextInt();
		
		if (numero1==numero2 && numero2==numero3) {
			System.out.println("son iguales");
		} else {
			if(numero1>numero2 && numero1>numero3) {
				System.out.println(numero1 + " es mayor");
			} else {
				if (numero2>numero1 && numero2>numero3) {
					System.out.println(numero2 + " es mayor");
				} else {
					System.out.println(numero3 + " es mayor");
				}
			}
		}
		sc.close();
	}

}
