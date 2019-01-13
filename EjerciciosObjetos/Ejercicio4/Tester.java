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
		
		
		//crear email.
//		contacto.setEmail(sc.texto());
//		
//		System.out.println(contacto.getEmail());
//		
		
		//crear contacto
		System.out.println("Crear contacto. Primero telefono");
		contacto.setNuevoContacto(sc.entero(),sc.next());
		
		System.out.println(contacto.mostrar());
	}

}
