
public class Circulo {
	private int radio;

	public Circulo () {
		radio = 1;
	}
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	//leer
	public int getRadio() {
		return radio;
	}
	
	//modificar
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public String toString() {
		
		return Integer.toString(radio);
		
	}
	
	public int getArea() {
		int area = (int) (Math.PI * Math.pow(radio, 2));
		return area;
	}
	
	public int getPerimetro() {
		int perimetro = (int) (2 * (Math.PI * radio));
		return perimetro;
	}
	
}
