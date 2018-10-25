import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hora = 0;
		int minuto = 0;
		int segundo = 0;

		for (int i = 0; i < 24 || minuto == 60; i++) {

			for (int j = 0; j < 60; j++) {
				segundo = 0;

				for (; j < 60; j++) {

					System.out.println(hora + ":" + minuto + ":" + segundo);
					segundo++;
				}

				minuto++;
			}

			if (minuto == 60) {
				hora++;
			}
		}
		sc.close();
	}

}
