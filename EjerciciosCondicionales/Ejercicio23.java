import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String respuesta;

		System.out.println("Responda 3 preguntas correctamente para ganar. Responda Si o no");

		System.out.println("Primera pregunta.¿Descubrio Colon America?");
		respuesta = sc.nextLine();

		if (respuesta.equalsIgnoreCase("Si")) {
			System.out.println("Correcto!");
			System.out.println("Segunda pregunta. ¿Fue la guerra de independencia española en el año 1808?");
			respuesta = sc.nextLine();

			if (respuesta.equalsIgnoreCase("Si")) {
				System.out.println("Correcto! Empezó en el año 1808 y acabo en 1814 ");

				System.out.println("Tercera y última pregunta.\n");
				System.out.println("¿Es Donald Trump el 40 presidente de los estados Unidos?");

				respuesta = sc.nextLine();

				if (respuesta.equalsIgnoreCase("No")) {
					System.out.println("¡Es correcto! Donald Trump es el 45º presidente de Estados Unidos");
					System.out.println("¡Ha ganado!");
				} else {
					System.out.println("¡Incorrecto! Ha perdido en la última pregunta");
				}

			} else {
				System.out.println("Fin del juego. Vuelva a intentarlo.");
			}
		} else {
			System.out.println("Fin del juego. Vuelva a intentarlo.");
		}
		sc.close();
	}

}
