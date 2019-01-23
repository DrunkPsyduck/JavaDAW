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

		Asignatura[] id = new Asignatura[3];

		while (fin != false) {

			System.out.println("Introduzca la opción que desee:\nIntroducir\nMostrar\nMedia\nSalir.");
			opcion = sc.next();
			switch (opcion.toLowerCase()) {

			case "introducir":

				for (int i = 0; i < id.length; i++) {
					int identificador;
					double calificacion;


					identificador = (int) Math.random()*1;


					calificacion = Math.random()*1.0;

					asignatura = new Asignatura(identificador, calificacion);
					id[i] = asignatura;

					profesor.setCalcularSuma(calificacion);
				}

				break;

			case "mostrar":	
				for (int i = 0; i < id.length; i++) {
					
					if (id[i] == null) {
						System.out.println("Sin información");
						i = id.length -1;
					} else {
						System.out.println(id[i]);
						System.out.println();
					}
				}
				break;
				
			case "media":

                System.out.println("Nota media: ");
                System.out.println(profesor.getMedia() /id.length);

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