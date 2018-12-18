import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metodos String 
			
		Scanner sc = new Scanner(System.in);

		int metodo;
		boolean fin = false;

		do {
			System.out.println("Introduzca la opción dsesada.");
			System.out.println(
					"1. toUpperCase \n2. toLowerCase \n3. equals \n4. equalsIgnoreCase \n5. CharAt \n6. Concat \n7. length \n8. CompareTo");
			System.out.println("9. endsWith \n10. IndexOf \n11. Salir");
			metodo = sc.nextInt();

			switch (metodo) {

			case 1:
				System.out.println("ToUpperCase cambia el String a mayusculas");
				System.out.println();
				break;
			case 2:
				System.out.println("ToLowerCase cambia el String a mayúsculas");
				System.out.println();
				break;
			case 3:
				System.out.println("equals compara dos cadenas");
				System.out.println();
				break;
			case 4:
				System.out.println("equalsIgnoreCase compara dos cadenas ignorando mayusculas y minusculas");
				System.out.println();
				break;
			case 5:
				System.out.println("CharAt muestra el caracter de la posición indicada");
				System.out.println();
				break;
			case 6:
				System.out.println("Concat concatena dos cadenas");
				System.out.println();
				break;
			case 7:
				System.out.println("Length indica la longitud del string");
				System.out.println();
				break;
			case 8:
				System.out.println("compareTo compara cadenas y devuelve un número segun el resultado");
				System.out.println(
						"Si el numero es mayor que 0 la primera cadena es mayor, si es 0 las cadenas iguales y si es menor que cero la segunda cadena es mayor");
				System.out.println();
				break;
			case 9:
				System.out.println("endsWith indica si la cadena acaba con el carácter indicado como parámetro");
				System.out.println();
				break;
			case 10:
				System.out.println(
						"IndexOf Devuelve la posición en la cadena pasada por parámetro desde el principio. -1 si no existe.");
				System.out.println();
				break;
			case 11:
				System.out.println("salir");
				System.out.println();
				fin = true;
				break;
			default:
				System.out.println("Método no especificado.\n\n");
				
			}
		} while (fin != true);
		sc.close();
	}

}
