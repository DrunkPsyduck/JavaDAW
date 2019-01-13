package Ejercicio4;

public class Contacto {

	private String telefono;
	private String email;
	private int identificador;
	
	
	public Contacto() {
		telefono = "000000000000";
		email = "";
	}
	
	public Contacto(String telefono,String email) {
		
		this.telefono = telefono;
		this.email=email;
	}
	
	public Contacto(int identificador2, String telefono2, String email2) {
		// TODO Auto-generated constructor stub
	}

	public  Contacto getContacto(int identificador, String telefono,String email) {
		Contacto contacto;
		
		this.identificador = identificador;
		this.telefono = telefono;
		this.email = email;
		contacto = new Contacto (identificador, telefono, email);
		return contacto;
	}
	
	public Contacto mostrar() {
		Contacto contacto;
		contacto = new Contacto (identificador, telefono, email);
		
		return contacto;
	}
	//Getters
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	


	//Setters
	public void setTelefono() {
		this.telefono = Titular.telefono;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setNuevoContacto(int telefono, String email) {
		this.telefono = Titular.telefono;
		this.email = Titular.email;
		this.setIdentificador(Titular.identificador);
	}

	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}
