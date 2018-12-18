import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numeroVeces;
		int numero1 = 0;
		int numero2 = 1;

		System.out.println("Cuantos terminos desea ver");
		numeroVeces = sc.nextInt();

		for (int i=0; i < numeroVeces; i++) {

			numero1 += numero2;
			System.out.print(numero2 + ", ");

			System.out.print(numero1+ ", ");
			numero2 += numero1;

		}
		sc.close();
	}

}
