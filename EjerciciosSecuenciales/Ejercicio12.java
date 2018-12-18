import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		char caracter1;
		char caracter2;
		char caracter3;
		char caracter4;
		char caracter5;
		
		System.out.println("Introduzca una palabra de 5 letras");
		palabra = sc.nextLine();
		
		System.out.println("Palabra codificada");
		caracter1 = palabra.charAt(0);
		caracter2 = palabra.charAt(1);
		caracter3 = palabra.charAt(2);
		caracter4 = palabra.charAt(3);
		caracter5 = palabra.charAt(4);
		
		caracter1 += 30;
		caracter2 += 30;
		caracter3 += 30;
		caracter4 += 30;
		caracter5 += 30;
		
		System.out.print(caracter1);
		System.out.print(caracter2);
		System.out.print(caracter3);
		System.out.print(caracter4);
		System.out.print(caracter5);
		
		caracter1 -= 30;
		caracter2 -= 30;
		caracter3 -= 30;
		caracter4 -= 30;
		caracter5 -= 30;
		
		System.out.println("\n" + "Palabra decodificada");
		System.out.print(caracter1);
		System.out.print(caracter2);
		System.out.print(caracter3);
		System.out.print(caracter4);
		System.out.print(caracter5);
		
		sc.close();
		
	}

}
