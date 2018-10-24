import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * @author 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//inicialización variables
		double base = 0;
		double altura = 0;
		double perimetro=0;
		double area=0;
		double diagonal=0;
		double areaTriangulo=0;
		
		System.out.println("Introduzaca la base del rectangulo");
		base=sc.nextDouble();
		System.out.println("Introduzca la altura del rectangulo");
		altura=sc.nextDouble();
		
		
		area = base * altura;
		System.out.println("El área es "+ area);
		
		perimetro= (base*2) + (altura*2);
		System.out.println("El perímetro es "+ perimetro);
		
		diagonal=Math.hypot(base, altura);
		System.out.println("La diagonal del rectángulo es "+ diagonal);
		
		areaTriangulo=(base*altura)/2;
		System.out.println("El área del triángulo es "+ areaTriangulo);
		
		sc.close();
		
	}

}
