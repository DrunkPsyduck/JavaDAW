import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaración de variables
		double parcial1;
		double parcial2;
		double parcial3;
		double mediaParciales;
		double examenFinal;
		double notaExamen;
		double trabajoFinal;
		double mediaTrabajo;
		double notaFinal;
		
		//Asignación de valores
		
		System.out.println("Introduzca la nota del primer parcial: ");
		parcial1=sc.nextDouble();
		
		System.out.println("Introduzca la nota del segundo parcial: ");
		parcial2=sc.nextDouble();
		
		System.out.println("Introduzca la nota del tercer parcial: ");
		parcial3=sc.nextDouble();
		
		System.out.println("Introduzca la nota del examen final: ");
		examenFinal=sc.nextDouble();
		
		System.out.println("Introduzca la nota del trabajo final");
		trabajoFinal=sc.nextDouble();
		
		// 55% notas parciales 30% examen final 15%trabajio final
		
		mediaParciales= ((parcial1+parcial2+parcial3)/3)*0.55;
		notaExamen=examenFinal*0.30;
		mediaTrabajo=trabajoFinal*0.15;
		notaFinal=(mediaParciales+notaExamen+mediaTrabajo);
		
		System.out.println("La nota final es " + notaFinal);
		
		sc.close();
	}

}
