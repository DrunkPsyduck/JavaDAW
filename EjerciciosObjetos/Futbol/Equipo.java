package Futbol;

import java.util.Arrays;

public class Equipo {
	private int idEquipo;
	private String nombreEquipo;

	Jugador jugadores[] = new Jugador[22];

	public Equipo() {

	}

	public Equipo(int idEquipo, String nombreEquipo) {
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;

	}

	public Equipo(int idEquipo, String nombreEquipo, Jugador jugadores) {
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		jugadores = jugadores;

	}

	public Jugador mostrarDatosEquipo() {

		for (int i = 0; i < jugadores.length; i++) {
			return jugadores[i];
		}

		return null;
	}

	public String mostrarDatosJugador() {

		return jugadores.toString();
	}

	public Jugador mejorDelantero() {
		// Jugador con mas goles por equipo

		return null;
	}

	public Jugador ordenarGoles() {
		// ordena jugadores egun los goles marcados

		return null;
	}

	public void darBaja(int idJugador) {
		// dar baja a jugador a traves de su id

	}

	public void darAlta() {
		// dar baja a jugador a traves de su id

	}

	public void transpasar(/* Equipo Equipo2, int idJugador */) {
		// transpasar de un euipo a otro
	}

	public String generarNombreEquipo() {

		String nombres[] = new String[] { "MD White", "Tabarnia fc", "London FC", "MD Cobalt Blue", "Shurperros",
				"lla", "Roto2 FC" };

		int numero = (int) (Math.random() * nombres.length);

		return nombres[numero];
	}

//	public int generarIdEquipo() {
//		
//		idEquipo = (int) (Math.random()*2);
//		
//		return idEquipo;
//	}
//	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Equipo: ");

		sb.append(nombreEquipo).append("\nIdEquipo: ").append(idEquipo).append("\nJugadores: ")
				.append(Arrays.toString(jugadores));

		return sb.toString();
	}

}
