
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros;
		
		
		numeros = new int[] {'+',(Integer) null,(Integer) null,'-','+','+',(Integer) null,(Integer) null,'-','+','+',(Integer) null,(Integer) null,'-','+','+',(Integer) null,(Integer) null,'-','+','+',(Integer) null,(Integer) null,'-','+','+',(Integer) null,(Integer) null,'-','+'};
		for (int i = 0; i < numeros.length; i++) {
			int contadorNull=0;
			int contadorSuma=0;
			int contadorResta=0;
			
			if (numeros[i]=='+') {
				contadorSuma++;
			} else if(numeros[i]=='-') {
				contadorResta++;
			} else {
				contadorNull++;
			}
			System.out.printf("Los nulos son %d \n Los simbolos + son %d \n Los simbolos - son %d ", contadorNull,contadorSuma,contadorResta);
			
		}
	}

}
