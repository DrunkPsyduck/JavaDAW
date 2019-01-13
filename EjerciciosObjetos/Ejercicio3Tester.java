
public class Ejercicio3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio3 cuadrado = new Ejercicio3();
		
		System.out.println(cuadrado.getLado());
		
		// cambiar lado
		System.out.println("Introduzca el nuevo lado");
		cuadrado = new Ejercicio3(cuadrado.lectorNumero());

		System.out.println("El perimetro es");
		System.out.println(cuadrado.perimetro());
		
		System.out.println("El area es ");
		System.out.println(cuadrado.area());
		
	}

}
