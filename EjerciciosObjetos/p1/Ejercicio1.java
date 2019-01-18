package p1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generador matriculas

		int numeros;
		char letra1, letra2, letra3;

		numeros = 0;
		letra1 = 'A';
		letra2 = 'A';
		letra3 = 'A';
		boolean fin = false;

		while (numeros<10001&&!fin) {
			
			
			if (numeros==10000) {
				if (letra3=='Z') {
					letra3='A';
					letra2++;
				} else if (letra2=='Z') {
					letra3='A';
					letra2='A';
					letra1++;
				
				
					
				} else if(letra1=='Z'&&letra2=='Z'&&letra3=='Z'&&numeros==9999) {
					fin=true;
				}
				numeros=0;
				letra3++;
			}

			

			if (numeros < 10) {
				System.out.println("000" + numeros + "" + letra1 + letra2 + letra3);
			} else if (numeros > 9 && numeros < 100) {
				System.out.println("00" + numeros + "" + letra1 + letra2 + letra3);

			} else if (numeros < 1000) {
				System.out.println("0" + numeros + "" + letra1 + letra2 + letra3);
			} else {
				System.out.println(numeros + "" + letra1 + letra2 + letra3);
			}
			//Se añaden los 0 puesto que un numero a la izquierda no se imprime por pantalla

			numeros++;

		}
	}
}
