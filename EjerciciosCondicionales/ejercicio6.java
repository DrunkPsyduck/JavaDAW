import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int resultado;

		System.out.println("introduzca un numero");
		numero1 = sc.nextInt();

		System.out.println("introduzca otro numero");
		numero2 = sc.nextInt();

		if (numero1 % numero2 == 0) {
			resultado = numero1 + numero2;
		} else {
			resultado = numero1 * numero2;
		}

		System.out.println(resultado);
		sc.close();
	}

}
