package Ejercicio4;

public class Contacto {

	private long telefono;
	private String email;
	private int identificador;

	public Contacto() {
		telefono = 0;
		email = "";
		identificador = 0;
	}

	public Contacto(long telefono, String email, int identificador) {

		this.telefono = telefono;
		this.email = email;
		this.identificador = identificador;

	}

	public Contacto getContacto() {
		Contacto contactos;
		contactos = new Contacto(telefono, email, identificador);
		return contactos;

	}

	public void setContacto() {
		this.telefono = telefono;
		this.email = email;
		this.identificador = identificador;
	}
	
	public Contacto nuevoContacto(long telefono, String email) {
		Contacto contactos;
		
		contactos = new Contacto(telefono, email, identificador);
		
		
		return contactos;
	}
}
