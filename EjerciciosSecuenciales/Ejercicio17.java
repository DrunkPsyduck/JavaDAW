import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para obtener el porcentaje de inversion de cada uno debe de mirarse el resto
		
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		double totalInversor1;
		double parteInversor1;
		double totalInversor2;
		double parteInversor2;
		double totalInversor3;
		double parteInversor3;
		double total;
		
		System.out.println("Introduzca la inverion del primer inversor");
		totalInversor1=sc.nextDouble();
		
		System.out.println("Introduzca la inverion del segundo inversor");
		totalInversor2=sc.nextDouble();
		
		System.out.println("Introduzca la inverion del tercer inversor");
		totalInversor3=sc.nextDouble();
		
		total=100;
		

		
		parteInversor1=totalInversor1%total;
		
		parteInversor2=(parteInversor1-total);
		
		parteInversor3=(parteInversor2-total);
		
		System.out.println("la perte del primer inversor es " + parteInversor1);
		System.out.println("la parte del segundo inversor es " + parteInversor2);

		sc.close();
	}

}
