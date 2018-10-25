import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int contador=0;
		int numero;
		int contadorPositivo=0;
		int contadorNegativo=0;
		int contadorCeros=0;
		
		while(contador<20) {
			System.out.println("Introduzca un número");
			numero=sc.nextInt();
			
			if(numero==0) {
				contadorCeros++;
			}else if(numero%2==0) {
				contadorPositivo++;
			} else {
				contadorNegativo++;
			}
			contador++;
		}
		
		System.out.println("Hay " + contadorPositivo + " numeros positivos");
		System.out.printf("Hay %d numeros negativos\n", contadorNegativo);
		System.out.println("Hay " +  contadorCeros + " cero/s");
		
		sc.close();
	}

}
