import java.io.IOException;
import java.util.Scanner;
public class Ejercicio21 {
	public static final char punto = 46;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char caracteres [];
		boolean fin =false;
		int verCaracteres;	
		
		caracteres = new char[20];
		verCaracteres = 0;
		
		
		System.out.println("Introduzca su frase");
		for (int i = 0; i < caracteres.length&&!fin; i++) {
			caracteres[i] = (char) System.in.read();
			if (caracteres[i]==punto) {
				fin = true;
			}
		}
		
		System.out.println("Cuantos caracteres desea ver");
		verCaracteres = sc.nextInt();
	
		for (int i=0; i < verCaracteres;i++) {	
			System.out.print(caracteres[i]);
			}
		sc.close();
		}
	}

