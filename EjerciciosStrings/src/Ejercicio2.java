import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		boolean fin = false;
		
		
		do {
		
		System.out.println("Introduzca su opci�n");
		System.out.println("1. toString\n2. appends \n3. deleteCharAt \n4. Replace "
				+ " \n5. setLength \n6. Salir ");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("toString devuelve un string repesentando el contenido en la misma secuencia");
			break;
		case 2:
			System.out.println("appends a�ade el contenido pasado por par�metro al StringBuffer");
			break;
		case 3:
			System.out.println("deleteCharAt borra el car�cter indicado de la cadena");
			break;
		case 4:
			System.out.println("Replace replaza loss car�cteres en una subcadenade esta secuencia con los caracteres especificados en el String.");
			break;
		case 5:
			System.out.println("setLength especifica la longitud de la secuencia de car�cteres");
			break;
//		case 6: 
//			System.out.println("codePointAt devuelve el car�cter en el �ndice especificado");
//			break;
		case 6:
			fin = true;
			break;
		default:
			System.out.println("Caracter no valido");
		}
		
		} while(fin != true);
		
		sc.close();
	}

}
