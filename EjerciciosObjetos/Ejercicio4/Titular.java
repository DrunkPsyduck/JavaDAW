package Ejercicio4;

public class Titular {

	static long telefono;
	static String email;
	static int identificador;
	
	public Titular() {
		identificador = 0;
		telefono=0;
		email = " ";
	}

	public Titular(int identificador, long telefono, String email) {
		
	}
	
	//Devuelve contacto
	public Titular contactos() {
		Titular titular;
		
		if (Titular.identificador == identificador) {
			Titular.identificador++;
		}
		
		titular = new Titular(identificador, telefono, email);
		return titular;
	}
	
	public void setTitular() {
		
		this.identificador = identificador;
		this.telefono = telefono;
		this.email = email;
		
	}
}
