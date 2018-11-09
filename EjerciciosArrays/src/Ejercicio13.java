import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroIntroducido;
		int [] hexadecimal;
		int [] decimal;
		
		
		System.out.println("introduzca un número entre 0 y 32000 ");
		numeroIntroducido = sc.nextInt();
		
		while (numeroIntroducido<0 || numeroIntroducido>32000) {
			System.out.println("el numero es incorrecto. Vuelva a introducirlo");
			numeroIntroducido = sc.nextInt();
		}
		
		
		
	}

}
