import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nombre;
		int horasTrabajadas;
		double sueldo;
		double sueldoFinal;

		System.out.println("¿cual es su nombre?");
		nombre = sc.nextLine();

		System.out.println("Hola " + nombre + " ¿Cuantas horas ha trabajado?");
		horasTrabajadas = sc.nextInt();

		if (horasTrabajadas <= 35) {
			sueldo = horasTrabajadas * 9;
		} else {
			sueldo = (horasTrabajadas * 9) * 0.15;
			
		}
		System.out.println(nombre + " su sueldo sin pagar impuestos es " + sueldo + "€");

		if (sueldo < 1262) {
			System.out.println(nombre + " no tienes que pagar impuestos. Su sueldo es " + sueldo + "€" );
		} else {
			if (sueldo < 1532) {
				sueldoFinal=sueldo*0.80;
				System.out.println(nombre + "Tienes que pagar un 20% de impuestos. Su sueldo neto es " + sueldoFinal +"€");
			} else {
				sueldoFinal=sueldo*0.70;
				System.out.println( nombre +"Pagas un 30% de impuestos. Su sueldo neto es " + sueldoFinal + "€");
			}
		}
		
		sc.close();

	}

}
