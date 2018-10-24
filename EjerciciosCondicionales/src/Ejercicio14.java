import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numeroA;
		int numeroB;
		int numeroC;
		int numeroD;
		int operacion;

		System.out.println("Introduzca el primer numero");
		numeroA = sc.nextInt();

		System.out.println("Introduzca el segundo numero");
		numeroB = sc.nextInt();

		System.out.println("Introduzca el tercer numero");
		numeroC = sc.nextInt();

		System.out.println("introduzca el ultimo numero");
		numeroD = sc.nextInt();

		if (numeroB == 0 || numeroD == 0) {
			System.out.println("No se puede dividir por 0");
		} else {
			if ((numeroA + numeroB) > (numeroC + numeroD)) {
				operacion = numeroA + numeroB + numeroC + numeroD;
				System.out.println("suma de los 4 numeros" + operacion);
			} else {
				operacion = numeroB + numeroD;
				System.out.println("suma de 2 numeros " + operacion);
			}
		}
		sc.close();
	}

}