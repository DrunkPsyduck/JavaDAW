import java.io.IOException;
import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double calculos;
		char caracter;
		
		System.out.println("Introduzca un numero");
		numero1=sc.nextDouble();
		
		System.out.println("Introduzca otro numero");
		numero2=sc.nextDouble();
		
		System.out.println("Introduzca su operacion. A para perimetro de un rectangulo. B para calcular el area de un rectangulo." +
				"C para calcular el area de un triangulo y D para calcular la hipotenusa");
		caracter = (char) System.in.read();
		
		// se deberia usar un switch no if
		if (caracter=='A') {
			calculos=(numero1*2)+(numero2*2);
			System.out.println("El perimetro del rectangulo es " + calculos);
		} else {
			if (caracter=='B') {
				calculos=numero1*numero2;
				System.out.println("El area es " + calculos);
				
			} else {
				if (caracter == 'C') {
					calculos = (numero1*numero2)/2;
					System.out.println("El area del triangulo es" + calculos);
				} else {
					if (caracter == 'D') {
					calculos = Math.hypot(numero1, numero2);
					System.out.println("El valor de la hipotenusa es " + calculos);
					}
				}
			}
		}
		
		sc.close();
	}

}