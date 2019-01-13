package Ejercicio4;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Metodos de pruebas de Contacto, Titular, GestorContactos y Lector
		
		// crear objetos
		
		Contacto contacto = new Contacto();
		GestorContactos gestion = new GestorContactos();
		Lector sc =  new Lector();
		Titular titular = new Titular();
		
		
		//crear contacto
		System.out.println("Crear Contacto. primero tlf luego email");
		contacto.nuevoContacto(sc.enteroLargo(), sc.next());
	
		
		//Mostrar contactos
		
		System.out.println("Muestra contactos");
		System.out.println(contacto.getContacto());
	}
		
	
}
