import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] palabras;
		String aux;
		
		palabras = new String[5];
		
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = sc.nextLine();
		}
		
		
		
		for (int j = 0; j < palabras.length; j++) {
			for (int i = 0; i < palabras.length-1; i++) {
				if (palabras[i].compareTo(palabras[i+1])>0) {
					
					aux = palabras[i];
					palabras[i] = palabras[i+1];
					palabras[i+1] = aux;
				}
			
			}
		}
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		sc.close();
	}

}
