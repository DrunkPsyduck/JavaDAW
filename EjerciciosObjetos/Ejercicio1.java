
public class Ejercicio1 {

	private int lado1;
	private int lado2;
	private int lado3;
	
	public Ejercicio1() {
		lado1 = 3;
		lado2 = 3;
		lado3 = 3;
	}
	
	public Ejercicio1(int lado1, int lado2,int lado3) {
		
	}
	
	
	public int getLado1() {
		
		return lado1;
	}
	
	public int getLado2() {
		
		return lado2;
	}
	public int getLado3() {
		
		return lado3;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	
	public int perimetro() {
		int perimetro;
		perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
	public int area() {
		int area;
		area = perimetro()/2;
		//area = (getLado1()*getLado2())/2;
		return area;
	}
	
}
