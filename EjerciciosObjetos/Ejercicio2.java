import java.util.Scanner;
public class Ejercicio2 {

	private int radio;
	
	public Ejercicio2() {
		radio = 3;
	}
	
	public Ejercicio2(int radio) {
		
		this.radio = radio;
	}
	
	public int lector() {
		Scanner sc = new Scanner(System.in);
		int lector = sc.nextInt();
		sc.close();
		return lector;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio() {
		this.radio=radio;
	}
	
	public int area() {
		int area;
		area = (int)Math.PI * (int) Math.pow(radio, 2);
		return area;
	}
	
	public int perimetro() {
		int perimetro;
		perimetro = (int) (2 * Math.PI * radio);
		return perimetro;
	}
}
