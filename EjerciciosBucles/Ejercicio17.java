import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroVeces;
		int numeroSerie=1;
		
		System.out.println("Cuantos términos quiere ver");
		numeroVeces=sc.nextInt();
		
		System.out.print(numeroSerie+", ");
		for (int i=0;i<numeroVeces;i++) {
			
			numeroSerie *=2;
			System.out.print(numeroSerie+", ");
			
		}
		
		sc.close();
	}

}
