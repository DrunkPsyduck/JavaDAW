import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador=0;
		int multiplicacion;
		
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		
		while(contador<11) {
			multiplicacion=numero*contador;
			System.out.println(numero + "*" + contador + " = " + multiplicacion);
			contador++;
		}
		sc.close();
	}

}
