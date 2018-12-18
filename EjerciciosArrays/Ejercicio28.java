import java.io.IOException;
import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int gallinas[][];
		char opcion;
		boolean salir = false;
		int acumulador = 0;
		int media;

		gallinas = new int[20][15];

		for (int i = 0; i < gallinas.length; i++) {
			for (int j = 0; j < gallinas[i].length; j++) {
				gallinas[i][j] = (int) (Math.random() * 19) + 1;
			}
		}

//		for (int i = 0; i < gallinas.length; i++) {
//			for (int j = 0; j < gallinas[i].length; j++) {
//				System.out.print(" " + gallinas[i][j]);
//			}
//			System.out.println();
//		}
//		

		do {
			System.out.println("¿Que opción desea? (A/B/C/D/S)");
			opcion = (char) System.in.read();
			switch (opcion) {
			case 'a':
			case 'A':
				System.out.println("Media de huevos por día");
				for (int i = 0; i < gallinas.length; i++) {
					System.out.printf("Día %d: \n", i + 1);

					acumulador = 0;
					for (int j = 0; j < gallinas[i].length; j++) {
						acumulador += gallinas[i][j];

					}
					media = acumulador / gallinas.length - 1;
					System.out.print(media);
					System.out.println();
				}

				break;

			case 'b':
			case 'B':
				System.out.println("Media de huevos por gallina");

				for (int i = 0; i < gallinas.length; i++) {
					System.out.printf("gallina %d", i);
					for (int j = 0; j < gallinas.length; j++) {
						acumulador = gallinas[i][j] / (gallinas.length - 1);
					}
					System.out.printf("Gallina %d: %d", i, acumulador);
					System.out.println();
				}

				break;

			case 'c':
			case 'C':

				for (int i = 0; i < gallinas.length; i++) {
					media = 0;
					acumulador = 0;

					for (int j = 0; j < gallinas.length; j++) {
						acumulador += gallinas[i][j];
						media = acumulador / gallinas.length-1;
						if (media < 3) {
							System.out.printf("gallina numero %d\n", j);
						}
					}

				}

				break;

			case 'd':
			case 'D':
				System.out.println("Introduzca el dia");
				int dia;
				dia = sc.nextInt();
				
				for (; dia < gallinas.length; dia++) {
					for (int j = 0; j < gallinas.length; j++) {
						System.out.print(gallinas[dia][j]);
					}
					System.out.println();
				}
				
				break;

			case 's':
			case 'S':
				System.out.println("Salir");
				salir = true;
				break;
			}
		} while (salir != true);

		sc.close();
	}

}
