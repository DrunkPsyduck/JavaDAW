public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] numeros;		
		int maximo = 0;
		int [] invertir;
		
		numeros = new int[15];
		invertir = new int[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*10);
						
		}
		for (int i = 0; i < invertir.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println();
			for (int i = numeros.length-1; i < numeros.length; i--) {
				invertir[maximo] = numeros[i];
				System.out.print(invertir[maximo] + " ");
				maximo++;
			}

	}

}
