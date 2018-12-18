import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduzca un numero del 1 al 7");
		numero = sc.nextInt();

		if (numero > 1 || numero < 7) {
			if (numero == 1) {
				System.out.println("Lunes");
			}
			if (numero == 2) {
				System.out.println("Martes");
			}
			if (numero == 3) {
				System.out.println("Miercoles");
			}
			if (numero == 4) {
				System.out.println("Jueves");
			}
			if (numero == 5) {
				System.out.println("Viernes");
			}
			if (numero == 6) {
				System.out.println("Sábado");
			}
			if (numero == 7) {
				System.out.println("Domingo");
			}
		} else {
			System.out.println("No se puede mostrar el día");
		}
		sc.close();
	}

}
