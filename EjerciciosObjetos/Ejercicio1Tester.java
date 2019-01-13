
public class Ejercicio1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio1 metodo = new Ejercicio1();
		
		System.out.println("Lados del triangulo");
		System.out.println(metodo.getLado1());
		System.out.println(metodo.getLado2());
		System.out.println(metodo.getLado2());
		
		//poner lado
		metodo.setLado1(50);
		
		System.out.println("Perimetro");
		System.out.println(metodo.perimetro());
		
		System.out.println("Area");
		System.out.println(metodo.area());
		

	}

}
