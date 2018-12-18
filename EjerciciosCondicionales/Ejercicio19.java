import java.util.*;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hora;
		int minuto;
		int segundo;
		int segundosInt;

		System.out.println("introduzca los segundos ");
		segundosInt = sc.nextInt();
		/*
		 * hora=numero/3600; minuto=(numero-(3600*hora))/60;
		 * segundo=numero-((hora*3600)+(minuto*60));
		 * System.out.println(hora+"h "+minuto+"m "+segundo+"s");
		 */

		hora = segundosInt / 3600;
		minuto = (segundosInt - (3600 * hora)) / 60;
		segundo = segundosInt - ((hora * 3600) + (minuto * 60));

		if (hora > 24) {
			System.out.println("hay más de un dia " + hora + ":" + minuto + ":" + segundo);
		} else {

			System.out.println(hora + ":" + minuto + ":" + segundo);
		}
		sc.close();
	}

}