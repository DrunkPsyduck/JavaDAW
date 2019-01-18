package p1;

public class Circulo {
	private double radio;
	private Punto punto;
	
	public Circulo() {
		punto = new Punto();
	}
	
	public Circulo(double radio, Punto punto) {
		this.radio = radio;
		this.punto = punto;
	}
	
	public Circulo (double radio, double param1, double param2) {
		this.radio = radio;
		this.punto = new Punto(param1, param2);
		
	}
	
	//getter
	
	public double getRadio() {
		
		return radio;
	}
		
	public Punto getCoordenadas() {
		return punto;
	}

	
	// setter
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setPunto(Punto coordenadasYs) {
		this.punto=coordenadasYs;
	}
	
	public double calcularDistanciaDesde(Punto otro) {
		
		double distancia = punto.calcularDistanciaDesde(otro);
		
		return distancia;
		
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Distancia: ");
		
		sb.append(" Circulo ").append(calcularDistanciaDesde(punto));
		
		return sb.toString();
	}

	
	//funciones
	
	public double calcularArea() {
		double area;
		
		area = Math.PI * Math.pow(radio, 2);
		
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = (Math.PI * radio)*2;
		return perimetro;
	}
}
