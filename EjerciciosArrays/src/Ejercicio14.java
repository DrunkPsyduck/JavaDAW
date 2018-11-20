
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz;
		int[] analizados;
		int cont = 0;

		matriz = new int[10];
		analizados = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i] + " ");
		}
		for (int i = 0; i < matriz.length; i++) {
			boolean analizado = false;
			// Primer hay que ver si ya ha sido analizado
			for (int k = 0; k < analizados.length && analizado == false; k++)
				if (analizados[k] == matriz[i])
					analizado = true;

			// Pregunto si ha sido analizado.
			// Y si no pues busco repeticiones.

			if (analizado == false) {
				cont = 1;
				for (int j = i + 1; j < matriz.length; j++) {
					if (matriz[j] == matriz[i]) {
						cont++;
					}
					analizado = true;
				}
				System.out.println();
				System.out.printf("%d aparece %d veces\n", matriz[i], cont);
				//System.out.println(matriz[i] + " aparece " + cont  );
				analizados[i] = matriz[i];
			}
		}

	}

}
