
public class Ejercicio2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio2 circulo = new Ejercicio2();
		
		// Radio inicial
		System.out.println("Radio inicial: " + circulo.getRadio());
		
		System.out.println("Cambiar radio: ");
		circulo = new Ejercicio2(circulo.lector());
		
		System.out.println("El area es " + circulo.area());
		
		System.out.println("El perimetro es " + circulo.perimetro());
	}

}
