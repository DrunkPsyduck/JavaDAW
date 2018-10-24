import java.util.Scanner;
public class Ejericio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroN;
		int numeroM;
		int intervalo;
		int aux =0;
		
		System.out.println("Introduzca un número");
		numeroM=sc.nextInt();
		
		System.out.println("Introduzca Otro número");
		numeroN=sc.nextInt();
		
		System.out.println("introduzca el intervalo");
		intervalo = sc.nextInt();
		
		if (numeroM<numeroN) {
			aux = numeroN;
			numeroN=numeroM;
			numeroM=aux;
		}
		
		while (numeroM>numeroN) {
						
			System.out.println(numeroM);
			numeroM-=intervalo;
		}
		
		sc.close();
	}

}
