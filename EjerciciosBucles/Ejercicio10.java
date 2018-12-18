import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroVeces;
		int numero;
		int contador;
		int contadorPar;
		int contadorImpar;
		
		System.out.println("Cuantas numeros desesa introducir");
		numeroVeces = sc.nextInt();
		
		contador=0;
		contadorPar=0;
		contadorImpar=0;
		
		while (contador!= numeroVeces){
			System.out.println("introduzca un numero");
			numero=sc.nextInt();
			if (numero%2==0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
			contador++;
		}
		System.out.println("\n"+"Hay " + contadorPar + " numeros pares");
		System.out.println("Hay " + contadorImpar + " numeros impares");
		sc.close();
	}

}
