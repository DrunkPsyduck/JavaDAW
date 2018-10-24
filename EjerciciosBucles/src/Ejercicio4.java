import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduzca un numero");
		numero1=sc.nextInt();
		
		System.out.println("introduzca otro numero");
		numero2 = sc.nextInt();
		
		if (numero1<numero2) {
			while(numero1!=numero2) {
			
				numero2--;
				System.out.println(numero2);
				
			}
		}
		sc.close();
	}

}
