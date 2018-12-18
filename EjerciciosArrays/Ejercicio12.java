public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] marco;
		
		
		marco = new int [5][15];
		
		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco[i].length; j++) {
				
				if (i == 0 || i == 4 || j == 0 || j==14) {
					marco[i][j]=1;
					
				}
				System.out.print(marco[i][j]);
				
			}
			System.out.println();
		}
		
	}

}