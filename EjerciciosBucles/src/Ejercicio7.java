import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroVeces;
		int numero;
		int guardaValor = 0;
		int contador=0;
		int media;
		
		System.out.println("¿Cuantos numeros desea introducir? ");
		numeroVeces=sc.nextInt();
		
		while (numeroVeces>contador) {
			System.out.println("introduzca un numero");
			numero=sc.nextInt();
			guardaValor += numero;
			contador++;			
		}
		media=guardaValor/contador;
		System.out.println("La media es " + media);
		sc.close();
	}

}
