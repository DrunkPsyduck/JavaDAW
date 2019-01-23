package P2;

public class Asignatura {
	private int identificador;
	private double calificacion;

	public Asignatura() {

	}

	public Asignatura(int i, double v) {
		identificador = i;
		calificacion = v;
	}

	public Asignatura(int id) {
		this.identificador = id;
	}

	public Asignatura(Double calificacion) {
		this.calificacion = calificacion;
	}

	
	public int getIdentificador() {
		return identificador;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Asignatura: ");
		sb.append(identificador).append("\nCalificacion: ").append(calificacion);
		return sb.toString();

	}

}