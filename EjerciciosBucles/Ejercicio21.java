import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double numero=1;
		double media;
		double suma=0;
		int contador=0;

		
		
		while(numero!=0) {
			System.out.println("Introduzca un número");
			numero=sc.nextInt();
			
			suma+=numero;
			contador++;
		}
		
		media=suma/(contador/*-1*/);
		System.out.println("La media es " + media);
		sc.close();
		
	}

}
