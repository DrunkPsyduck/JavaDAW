import java.util.Scanner;

public class Ejercicio6v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		// declaración variables
		float cantidad=0;
		float aux=0;
		int billeteDiez=0;
		int billeteCinco=0;
		int monedaCincuenta=0;
		int monedaDiez=0;
		int monedaCinco=0;
		int monedaUno=0;
		
		
		System.out.println("Introduzca la cantidad");
		cantidad=sc.nextFloat();
		
			
		billeteDiez=(int) cantidad/10;
		System.out.println("Sus billetes de 10 son " + billeteDiez);
		
		aux=cantidad%10;
			
		billeteCinco=(int) aux/5;
		System.out.println("Sus billetes de 5 son " + billeteCinco);
		
		aux=aux%5;
		
		monedaCincuenta=(int) (aux*100)/50;
		System.out.println("Sus monedas de 50 centimos son " + monedaCincuenta);
		
		aux=(aux*100)%10;
		
		monedaDiez=(int) (aux*100)/10;
		System.out.println("Sus monedas de 10 centimos son " + monedaDiez);
		
		aux=(cantidad*1000)%50;
		
		monedaCinco=(int) (aux)/5;
		System.out.println("Sus monedas de 5 centimos son " + monedaCinco);
		
		aux=(cantidad*1000)%100;
		
		monedaUno=(int) (aux)/10;
		System.out.println("Sus monedas de 1 centimos son " + monedaUno);
		
		
		
		sc.close();
		
	}

}
