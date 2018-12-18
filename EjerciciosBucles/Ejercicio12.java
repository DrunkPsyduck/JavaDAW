
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int contador;
		int resultado;

		numero = 0;
		contador = 0;

		while (numero < 11) {
			System.out.println("Tabla del " + numero);
			while (contador < 11) {
				
				resultado = numero * contador;
				System.out.println(numero + "*" + contador + " = " + resultado);
				contador++;
			}
			contador=0;
			numero++;
		}

	}

}
