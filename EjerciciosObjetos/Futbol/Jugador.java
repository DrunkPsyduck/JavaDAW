package Futbol;

public class Jugador {
	private int idJugador;
	private String nombre;
	private int idEquipo;
	private int partidosJugados;
	private int golesMarcados;

	public Jugador() {

	}

	public Jugador(int idJugador, String nombre, int idEquipo) {
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.idEquipo = idEquipo;
	}

	public Jugador(int idJugador, String nombre, int idEquipo, int partidosJugados, int golesMarcados) {
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.idEquipo = idEquipo;

		this.partidosJugados = partidosJugados;
		this.golesMarcados = golesMarcados;
	}
	
	
	
	
	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public void setId(int id) {
		this.idEquipo = id;
	}
	

	
	
	
	public double promedioGolesPartido() {
		double promedioGoles;
		promedioGoles = golesMarcados / partidosJugados;
		return promedioGoles;
	}

	public String generarNombre() {

		String nombresJugadores[] = new String[] { "Foo", "Mario", "Steve", "Sergio", "Pepe", "Carlos", "Marcelo",
				"Eden", "Bill", "Daniel", "Roger", "Paul" };

		int numeroAleatoreo = (int) (Math.random() * nombresJugadores.length);

		return nombresJugadores[numeroAleatoreo];
	}

	public int generarGoles() {
		int goles;

		goles = (int) (Math.random() * 100);

		return goles;
	}

	
		
	public int getGoles() {	
		return golesMarcados;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Jugadores");
		sb.append("\nNombre:").append(nombre).append("\nEquipo: ").append(idEquipo).append("\nPartidos jugados: ")
				.append(partidosJugados).append("\nGoles: ").append(golesMarcados);

		return sb.toString();
	}

}
