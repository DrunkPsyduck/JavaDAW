package Futbol;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador = new Jugador();
		Equipo equipo = new Equipo();
		Lector sc = new Lector();

		jugador = new Jugador(4, "Sergio Ramos", 1, 10, 2);
		// System.out.println(jugador);

		// crear variables propias
		boolean fin = false;
		String seleccion;

		// Generar arrays
		Jugador jugadores[] = new Jugador[22];

		Equipo equipos[] = new Equipo[2];

		// crear menu

		while (!fin) {
			System.out.println("¿Que operación desea realizar?");
			System.out.println(
					"Nuevo jugador\nmostrar jugador\nmodificar jugador\nnuevo equipo\ndatos equipo\nmejor delantero\nlista goleadores\nalta jugador\nbaja jugador\ntraspasos");

			seleccion = sc.nextLine();

			switch (seleccion.toLowerCase()) {

			case "nuevo jugador":
				System.out.println("¿Cuantos jugadores desea añadir?");
				int numero = sc.nextInt();

				for (int i = 0; i < numero; i++) {
					if (i % 2 == 0) {
						jugadores[i] = new Jugador(i, jugador.generarNombre(), 0, 0, jugador.generarGoles());
					} else {
						jugadores[i] = new Jugador(i, jugador.generarNombre(), 1, 0, jugador.generarGoles());
					}
				}

				for (int i = 0; i < jugadores.length; i++) {

					if (!(jugadores[i] == null)) {
						System.out.println(jugadores[i]);
						System.out.println();
					}
				}
				break;

			case "modificar Jugador":

				System.out.println("Introduzca el identificador del jugador que desea modificar");
				numero = sc.nextInt();

				System.out.println(
						"¿Que desea cambiar del jugador?\nIdJugador\nnombre\nIDequipo\nPArtidos Jugados\nGolesMArcados");
				String submenu = sc.nextLine();

				while (!fin) {

					switch (submenu.toLowerCase()) {
					case "IdJugador":
						System.out.println("Que identificador desea poner. Valor númerico");
						int id = sc.nextInt();

						if (jugadores[id] != null) {
							jugador.setId(id);
						} else {
							System.out.println("No se puede asignar ese identificador");
						}

						break;

					case "nombre":
						System.out.println(
								"se le asignara un nuevo nombre al jugador " + jugadores[numero].generarNombre());
						jugador.setNombre(jugador.generarNombre());

					case "idequipo":
						System.out.println("Introduzca el identificador del nuevo equipo");
						id = sc.nextInt();

						if (id > equipos.length) {
							System.out.println("No existe ese equipo");
						} else {
							jugador.setIdEquipo(id);
						}
						break;

					case "Partidos jugados":
						System.out.println("Introduzca la cantidad de partidos");
						id = sc.nextInt();

						jugador.setPartidosJugados(id);

						break;

					case "goles marcados":
						System.out.println("Introduzca la cantidad de goles");
						id = sc.nextInt();

						jugador.setGolesMarcados(id);

						break;
					case "salir":
						fin = true;
						break;
					default:
						System.out.println("Operación no valida");
						break;
					}

				}

				fin = false;
				break;

			case "nuevo equipo":

				System.out.println("¿Cuantos rquipos desea crear?");
				numero = sc.nextInt();

				for (int i = 0; i < numero; i++) {
					if (jugadores[i] == null) {
						if (i % 2 == 0) {
							equipos[i] = new Equipo(i, equipo.generarNombreEquipo(), jugadores[i]);
						} else {
							equipos[i] = new Equipo(i, equipo.generarNombreEquipo(), jugadores[i]);
						}
					}
				}

				break;

			case "mostrar jugador":

				for (int i = 0; i < jugadores.length; i++) {

					if (!(jugadores[i] == null)) {
						System.out.println(jugadores[i]);
						System.out.println();
					}
				}

				break;

			case "datos equipo":

				for (int i = 0; i < equipos.length; i++) {

					if (!(equipos[i] == null)) {
						System.out.println(equipos[i]);
						System.out.println();
					}
				}

				break;

			case "mejor delantero":

				for (int i = 0; i < jugadores.length; i++) {
					for (int j = 0; j < jugadores.length - i; j++) {
						if (jugadores[j].getGoles() > jugadores[j + 1].getGoles()) { // NullPointerException en esta
																						// linea
							int aux = jugadores[i].getGoles();
							jugadores[j].setGolesMarcados(jugadores[j + 1].getGoles());
							jugadores[j + 1].setGolesMarcados(aux);
						}
					}
				}

				
				for (int i = 0; i < 1; i++) {
					System.out.println(jugadores[i]);
				}
				break;

			case "lista goleadores":

				for (int i = 0; i < jugadores.length; i++) {
					for (int j = 0; j < jugadores.length - i; j++) {
						if (jugadores[j].getGoles() > jugadores[j + 1].getGoles()) { // NullPointerException en esta
																						// linea
							int aux = jugadores[i].getGoles();
							jugadores[j].setGolesMarcados(jugadores[j + 1].getGoles());
							jugadores[j + 1].setGolesMarcados(aux);
						}
					}
				}
				
				for (int i = 0; i < equipos.length; i++) {
					System.out.println(jugadores[i]);
				}
				
				break;

			case "alta jugador":
				System.out.println("Introduzca el id del jugador que desea dar de baja");
				int id = sc.nextInt();

				for (int i = 0; i < equipos.length; i++) {
					if (jugadores[i] == null) {

						System.out.println("introduzca el id del nuevo equipo");
						id = sc.nextInt();
						jugadores[i].setIdEquipo(id);

					}
				}

				break;
			case "baja jugador":

				System.out.println("Introduzca el id del jugador que desea dar de baja");
				id = sc.nextInt();

				for (int i = 0; i < equipos.length; i++) {
					if (jugadores[i].getIdJugador() == id) {
						jugadores[i].setIdEquipo((Integer) null);
					}
				}

				break;

			case "traspasos":
				System.out.println("Id del jugador a traspasar");
				id = sc.nextInt();
				int idEquipo;
				if (jugadores[id] == null) {
					System.out.println("No existe ese jugador");
				} else {
					System.out.println("Id del nuevo equipo");
					idEquipo = sc.nextInt();

					// equipos[idEquipo] = new Equipo(jugador[id]);

				}

				break;

			case "salir":
				System.out.println("Gracias por usar la aplicacón");
				fin = true;
				break;

			default:
				System.out.println("Operacón no válida.");

			}

		}

	}

}
