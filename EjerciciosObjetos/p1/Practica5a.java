package p1;

public class Practica5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TESTER
		
		//Clase Punto
		Punto punto = new Punto(5,8);
		Lector sc = new Lector();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		
		System.out.println("pruebas punto");
		System.out.println(punto);
//		System.out.println(punto.calcularDistanciaDesde());
//		
//		punto.setParam(sc.nextDouble(), sc.nextDouble());
//		System.out.println(punto);
//		System.out.println(punto.calcularDistanciaDesde());
//		
//		
		System.out.println("Pruebas circulo. Introducir radio");
		
		circulo.setRadio(sc.nextDouble());
		//acirculo.setPunto(punto);
		System.out.println(circulo);
		System.out.println("Distancia");
		System.out.println(circulo.calcularDistanciaDesde(punto));		
		
		System.out.println("Area del circulo: " + circulo.calcularArea());
		System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
		
		System.out.println(triangulo);
	}

}
