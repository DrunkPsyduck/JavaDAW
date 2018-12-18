import java.util.Scanner;

public class Menu1 {

	public static int suma(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}

	public static int resta(int a, int b) {
		int resultado;
		resultado = a - b;
		return resultado;
	}

	public static int multiplicar(int a, int b) {
		int resultado;
		resultado = a * b;
		return resultado;
	}

	public static int dividir(int a, int b) {
		int resultado;
		resultado = a / b;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String opcion;
		boolean fin = false;

		do {
			System.out.println("introduzca su opcion:\nCalculadora\nSalir");
			opcion = sc.nextLine();
			switch (opcion) {
			case "Calculadora":
				
				System.out.println("Que operacion desea realizar");
				String operacion = sc.nextLine();

				int a = sc.nextInt();
				int b = sc.nextInt();

				switch (operacion) {				
				case "Suma":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la suma es " + suma(a, b));

					break;
				case "Resta":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la resta es " + resta(a, b));
					break;
				case "Multiplicar":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la multiplicacion es " + multiplicar(a, b));

					break;
				case "Dividir":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la division es " + dividir(a, b));

					break;
				default:
					System.out.println("No especificado");
				}

				break;

			default:
				break;
			}

		} while (!fin);

		sc.close();
	}

}
