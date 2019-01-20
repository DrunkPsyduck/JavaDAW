package p1;

public class Triangulo {
	
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	public Triangulo() {
		punto1 = new Punto();
		punto2 = new Punto(3,4);
		punto3 = new Punto(9,9);
		
	}
	
	public Triangulo(Punto punto) {
		this.punto1 = punto;
		this.punto2 = punto;
		this.punto3 = punto;
	}
	
	// getter 
	public Punto getPunto1() {
		return punto1;
	}
	public Punto getPunto2() {
		return punto2;
	}
	public Punto getPunto3() {
		return punto3;
	}
	
	// setter
	public void setPunto1(Punto punto) {
		this.punto1 = punto;
	}
	
	public void setPunto2(Punto punto) {
		this.punto2 = punto;
	}
	
	public void setPunto3(Punto punto) {
		this.punto3 = punto;
	}
	//distancia
	
	//Calcular area
	
	public Punto getArea(Punto punto) {
		Punto area;
		area = punto;
		return area;
	}
	
	public Punto verTriangulo() {
		Punto triangulo = null;
			
		
		return triangulo;
	}
	
	//calcular perimetro
	 public double getPerimetro(Punto punto) {
		 double perimetro;
		 
		 perimetro = punto.calcularDistanciaDesde(punto1) + punto.calcularDistanciaDesde(punto2) + punto.calcularDistanciaDesde(punto3);
		 
		 
		 return perimetro;
	 }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Punto 1: ");
		sb.append(punto1).append("\nPunto 2: ").append(punto2).append("\nPunto 3").append(punto3);
		return sb.toString();
	}
}
