
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] datos;
		
		datos = new int[10][5];
		
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				
				datos[i][j]=i;
				
				System.out.print(datos[i][j]);
			}
			System.out.println();
		}
		
	}

}
