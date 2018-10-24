import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroTeclado;
		char letra = 0;
		
		System.out.println("Introduzca un numero por teclado");
		numeroTeclado=sc.nextInt();
		
		if (numeroTeclado>31 && numeroTeclado <= 255) {
		letra = (char) numeroTeclado;
		System.out.println(letra);
		
		} else {
			System.out.println("el número introducido no es valido");
		}
		
		sc.close();
	}

}
