import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * calcular salario obrero si obtuvo incremento del 25%
		 */
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		double salario;
		double salarioExtra;
		
		System.out.println("Introduzca el salario ");
		salario = sc.nextDouble();
		
		salarioExtra = salario * 0.25;
		salario += salarioExtra;
		System.out.println("Su salario actual es " + salario);
		
		sc.close();
	}

}
