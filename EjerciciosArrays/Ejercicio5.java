import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] diagonal;

		diagonal = new int[5][5];

		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal[i].length; j++) {

				if ((j==0 && i ==0)||(j==1 && i==1) || (j==2 && i==2) || (j==3 && i==3) || (j==4 && i==4)) {
					diagonal[i][j]=1;
				}

			}

		}

		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal[i].length; j++) {

				System.out.print(diagonal[i][j]);

			}
			System.out.println();
		}

		sc.close();

	}

}
