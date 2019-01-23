package P2;

import java.util.Scanner;

public class Practica5b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Asignatura asignatura = new Asignatura();
		Alumno alumno = new Alumno();
		Profesor profesor = new Profesor();

		// variables Tester
		boolean fin = true;
		String opcion;

		// inicializar asignaturas

		Asignatura[] id = new Asignatura[5];

		while (fin != false) {

			System.out.println("Introduzca la opción que desee:\nIntroducir\nMostrar\nMedia\nSalir.");
			opcion = sc.next();
			switch (opcion.toLowerCase()) {

			case "introducir":

				for (int i = 0; i < id.length; i++) {
					int identificador = 0;
					double calificacion = 0;

					System.out.println("Identificador");
					identificador = sc.nextInt();

					System.out.println("Calificacion");
					calificacion = sc.nextDouble();

					asignatura = new Asignatura(identificador, calificacion);
					id[i] = asignatura;
				}
				break;

			case "mostrar":	
				for (int i = 0; i < id.length; i++) {
					
					if (id[i] == null) {
						System.out.println("No inicializado");
					} else {
						System.out.println(id[i]);
						System.out.println();
					}
				}
				break;
				
			case "media":
				for(int i=0;i<4;i++) {
					System.out.println(asignatura.getCalificacion());
				}
					System.out.println(profesor.calcularMedia());
				break;
				
			case "salir":
				fin = false;
				break;
			
			default:
				System.out.println("Operación no valida");
				break;
			}

		}

		
		// System.out.println(alumno.getAsignatura1());

	}

}