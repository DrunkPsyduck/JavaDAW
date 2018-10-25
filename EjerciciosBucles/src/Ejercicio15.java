import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int resultado;
		int contador;
		
		System.out.println("Introduzca un numero");
		numero1=sc.nextInt();
		
		System.out.println("Introduzca otro numero");
		numero2=sc.nextInt();
		
		contador=1;
		resultado=0;
		
		resultado=numero1;
		while(contador!=numero2) {
			
			resultado+=numero1;
			contador++;
		}
		System.out.println("El resultado es " + resultado);
		sc.close();
	}

}
