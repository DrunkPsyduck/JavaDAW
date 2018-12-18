import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1;

		while (contador < 201) {
			if (contador%2==0 && contador%3==0) {
				System.out.println(contador);
			}
			contador++;
		}
		sc.close();
	}

}
