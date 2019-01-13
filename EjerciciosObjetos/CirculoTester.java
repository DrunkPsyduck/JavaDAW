
public class CirculoTester {
	
	public static void main(String[]args) {
		
		Circulo circulo = new Circulo();
		
		
		System.out.println(circulo.getRadio());
		System.out.println(circulo.getArea());
		

		
		circulo.setRadio(50);
		
		System.out.println(circulo.getRadio());
		System.out.println(circulo.getArea());
		System.out.println(circulo.getPerimetro());
		System.out.println(circulo.toString());
	}
}
