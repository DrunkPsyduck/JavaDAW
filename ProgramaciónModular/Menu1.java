import java.util.Scanner;

public class Menu1 {
	/***
	 *
	 * @param a
	 * @param b
	 * @return a?=b
	 */
	public static int suma(int a, int b) {
		;
		a += b;
		return a;
	}

	public static int resta(int a, int b) {

		a -= b;
		return a;
	}

	public static int multiplicar(int a, int b) {

		a *= b;
		return a;
	}

	public static int dividir(int a, int b) {

		a /= b;
		return a;
	}

	public static double pulgadas(double a) {
		a *= 0.39370;
		return a;

	}

	public static double centimetros(double a) {
		a /= 0.3937;
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String opcion;
		boolean fin = false;

		do {
			System.out.println("introduzca su opcion:\nCalculadora\nConversor\nSalir");
			opcion = sc.nextLine();
			switch (opcion) {
			case "Calculadora":

				System.out.println("Que operacion desea realizar\n Suma, Resta, Multiplicacion, Division");
				String operacion = sc.nextLine();

				int a;
				int b;

				switch (operacion) {
				case "suma":
				case "Suma":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la suma es " + suma(a, b));

					break;

				case "resta":
				case "Resta":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la resta es " + resta(a, b));
					break;

				case "multiplicar":
				case "Multiplicar":
					System.out.println("Introduzca un numero");
					a = sc.nextInt();

					System.out.println("Introduzca otro");
					b = sc.nextInt();

					System.out.println("El resultado de la multiplicacion es " + multiplicar(a, b));

					break;

				case "dividir":
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
			case "conversor":
			case "Conversor":
				String medidas;
				int distancia;
				System.out.println("A que desea convertir. Centimetros o pulgadas");
				medidas = sc.next();

				if (medidas.equalsIgnoreCase("centimetros")) {
					System.out.println("Introduzca la distancia en pulgadas");
					distancia = sc.nextInt();
					System.out.println("Son " + centimetros(distancia) + " centimetros");

				} else if (medidas.equalsIgnoreCase("pulgadas")) {

					System.out.println("Introduzca la distancia en centímetros");
					distancia = sc.nextInt();
					System.out.println("Son " + pulgadas(distancia) + " pulgadas");
				}
				break;

			case "Salir":

				System.out.println("Cerrando aplicación");
				fin = true;
				break;
			default:
				System.out.println("Operación desconocida");
				break;
			}

		} while (!fin);

		System.out.println("Gracias por usar esta aplicación");
		sc.close();
	}

}
