import java.util.Scanner;
public class Ejercicio3 {

	public int lado;
	
	public Ejercicio3() {
		lado = 3;
	}
	

	public Ejercicio3(int lado) {
		this.lado = lado;
	}
	
	public int lectorNumero() {
		Scanner sc = new Scanner(System.in);
		int lector = sc.nextInt();
		return lector;
	}
	
	public int getLado() {
		return lado;
	}
	
	public void setLado() {
		this.lado = lado;
	}
	
	public int perimetro() {
		int perimetro;
		perimetro = (int) Math.pow(lado,4);
		return perimetro;
	}
	
	public int area() {
		int area;
		area = (int)Math.pow(lado, 2);
		return area;
	}
	
}
