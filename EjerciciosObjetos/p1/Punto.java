package p1;

public class Punto {

	private double coordenadasX;
	private double coordenadasY;
	
	public Punto() {
		coordenadasX=12;
		coordenadasY=23;
	}
	
	public Punto(double coordenadasX,double coordenadasY){
		this.coordenadasX =  coordenadasX;
		this.coordenadasY = coordenadasX;
	}
	
	//getter
	public double getCoordenadasX() {
		return coordenadasX;	
	}
	
	public double getCoordenadasY() {
		return coordenadasY ;
	}
	
	//setter
	
	public void setCoordenadas(double coordenadasX, double coordenadasY) {
		this.coordenadasX = coordenadasX;
		this.coordenadasY = coordenadasY;
	}

	//tostring
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Lado1: ");
		sb.append(coordenadasX).append("\nLado2: ").append(coordenadasY);
		return sb.toString();
	}
	
	public double calcularDistanciaDesde(Punto otro) {
		double distancia;
		distancia = Math.sqrt(Math.pow(coordenadasX-otro.coordenadasX,2)+Math.pow(coordenadasY-otro.coordenadasY,2));
		return distancia;
	}
	
	
}
