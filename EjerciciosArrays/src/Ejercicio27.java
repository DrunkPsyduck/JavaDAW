import java.io.IOException;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int articulo[];
		int precio[];
		char opcion;
		boolean fin = false;

		articulo = new int[30];
		precio = new int[30];

		for (int i = 0; i < articulo.length; i++) {
			articulo[i] = i + 1;
		}

		for (int i = 0; i < precio.length; i++) {
			precio[i] = (int) (Math.random() * 96) + 3;
		}
		
		do {
			
		System.out.println(
				"Introduzca la opción deseada. No distingue mayúsculas.\nA para imprimir códigos y precios.\nB para buscar un articulo y decir su precio.");
		System.out.println(
				"C para listar la prenda más cara.\nD para listar las prenda más baratas. \nE Para ordenar las listas de código ");
		System.out.println("F Borra elementos por su código.\nG calacula las ganancias.\nS para salir.");
		opcion = (char) System.in.read();

		switch (opcion) {
		case 'a':
		case 'A':
			System.out.println("Código artículo");
			for (int i = 0; i < articulo.length; i++) {

				System.out.printf("%2d |", articulo[i]);

			}
			System.out.print("\nPrecio artículo");
			System.out.println();
			for (int i = 0; i < precio.length; i++) {

				System.out.printf("%2d |", precio[i]);
			}
			
			fin = true;
			break;
		case 'b':
		case 'B':
			
			int busqueda;
			int aux=0;
			boolean encontrar = false;
			System.out.println("Indique el código del artículo que desee buscar: ");
			busqueda = sc.nextInt();
			if (!(busqueda>articulo.length||busqueda<0)) {
			for (int i = 0; i < articulo.length&&!encontrar; i++) {
				encontrar=( articulo[i]==busqueda )?true:false;
				aux = i;
			}
			
			
		    System.out.printf("El artículo %d tiene un precio de %d€",articulo[aux],precio[aux]);
		    
			} else {
				System.out.println("Artículo no encontrado o no disponible.");
			}
			fin = true;
		    break;
		    
		case 'c':
		case 'C':
			System.out.println("Códigos de las prendas más caras");
			aux=0;
			int preciosMayor[];
			preciosMayor = new int[precio.length];
			
			for (int i = 0; i < preciosMayor.length; i++) {
				preciosMayor[i]= precio[i];
			}
			
			for (int i = 0; i < preciosMayor.length; i++) {
				for (int j = 0; j < preciosMayor.length-i-1; j++) {
					if (preciosMayor[j+1]>preciosMayor[j]) {
						aux = preciosMayor[j+1];
						preciosMayor[j+1]= preciosMayor[j];
						preciosMayor[j]=aux;
					}
				}
			}
			
			
			fin = true;
			break;
			
		case 'd':
		case 'D':
			fin = true;
			break;
		
		case 'e':
		case 'E':
			fin = true;
			break;
			
		case 'f':
		case 'F':
				int borrar;			
				System.out.println("Introduzca el código del artículo a eliminar");
				borrar = sc.nextInt();
				
				if (!(borrar>articulo.length-1 || borrar < 0)) {
							
				System.out.printf("El artículo %d con precio %d€ ha sido eliminado",articulo[borrar],precio[borrar]);
				articulo[borrar]=0;
				precio[borrar]=0;
				
				} else {
					System.out.println("El artículo introducido no existe");
				}
				
			break;
			
		case 'g':
		case 'G':
			fin = true;
			break;
			
		case 's':
		case 'S':
			System.out.println("\n\n\n\n\n\n\n\nFin");
			fin = true;
			break;
		}
		
		} while (!fin);
		sc.close();
	}

}
