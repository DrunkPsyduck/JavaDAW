import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String opcion = new String();
		boolean fin = false;
		
		
		do {
			
			System.out.println("Introduzca el método deseado");
			System.out.println("toUpperCase, toLowerCase, equals, equalsIgnoreCase\ncharAt, concat, length, compareTo, endsWithindexOf, Salir");
			opcion = sc.readLine();
			
			switch(opcion) {
			case "toUpperCase":
				System.out.println("ToUpperCase cambia el String a mayusculas");
				System.out.println();
				break;
			case "toLowerCase":
				System.out.println("ToLowerCase cambia el String a mayúsculas");
				System.out.println();
				break;
			case "equals":
				System.out.println("equals compara dos cadenas");
				System.out.println();
				break;
			case "equalsIgnoreCase":
				System.out.println("equalsIgnoreCase compara dos cadenas ignorando mayusculas y minusculas");
				System.out.println();
				break;
			case "charAt":
				System.out.println("CharAt muestra el caracter de la posición indicada");
				System.out.println();
				break;
			case "concat":
				System.out.println("Concat concatena dos cadenas");
				System.out.println();
				break;
			case "length":
				System.out.println("Length indica la longitud del string");
				System.out.println();
				break;
			case "compareTo":
				System.out.println("compareTo compara cadenas y devuelve un número segun el resultado");
				System.out.println(
						"Si el numero es mayor que 0 la primera cadena es mayor, si es 0 las cadenas iguales y si es menor que cero la segunda cadena es mayor");
				System.out.println();
				break;
			case "endsWith":
				System.out.println("endsWith indica si la cadena acaba con el carácter indicado como parámetro");
				System.out.println();
				break;
			case "indexOf":
				System.out.println("IndexOf Devuelve la posición en la cadena pasada por parámetro desde el principio. -1 si no existe.");
				System.out.println();
				break;
			case "Salir":
				System.out.println("salir");
				System.out.println();
				fin = true;
				break;
			default:
				System.out.println("Método no especificado");
			}
			
			
		}while(!fin);
	}

}
