import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String palabra = new String();
		boolean palindromos;
				
		System.out.println("Introduzca su palabra");
		palabra = sc.nextLine();
		
		StringBuilder palabraComparar = new StringBuilder(palabra);
				
		palabraComparar =  palabraComparar.reverse();
		
		palindromos=(palabraComparar.toString().equalsIgnoreCase(palabra)) ? true:false;
		 
		if (palindromos==true) {
			System.out.printf("%s es un palindromo. %s", palabra,palabraComparar);
		} else {
			System.out.printf("%s no es palindromos. %s", palabra,palabraComparar);
		}
		sc.close();
	}

}
