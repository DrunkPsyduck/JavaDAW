
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriculas[][];

		matriculas = new int[6][8];
		char asignaturas[][] = { { '�', 'l', 'g', 'e', 'b', 'r', 'a' }, { 'C', '�', 'l', 'c', 'u', 'l', 'o' },
				{ 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'c', 'i', 'o', 'n' }, { 'I', 'n', 'g', 'l', '�', 's' },
				{ 'E', 's', 't', 'a', 'd', '�', 's', 't', 'i', 'c', 'a' }, {'F','�','s','i','c','a'},
				{ 'H', 'i', 's', 't', 'o', 'r', 'i', 'a' },	{ 'T', 'e', 'c', 'n', 'o', 'l', 'o', 'g', '�', 'a' } };

		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				matriculas[i][j] = (int) (Math.random() * 35) + 12;
			}
		}

		for (int i = 0; i < asignaturas.length; i++) {
			for (int j = 0; j < asignaturas[i].length; j++) {
				
				System.out.print(asignaturas[i][j]);

			}
			System.out.print("|");
			

		}

		System.out.println();

		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				if (j==0) {
				System.out.printf("%4d", matriculas[i][j]);
				} else if(j==1) {
					System.out.printf("%8d", matriculas[i][j]);
				} else if(j==2) {
					System.out.printf("%10d", matriculas[i][j]);
				} else if(j==3) {
					System.out.printf("%10d", matriculas[i][j]);
				} else if(j==4) {
					System.out.printf("%9d", matriculas[i][j]);
				} else if(j==5) {
					System.out.printf("%11d", matriculas[i][j]);
				} else if(j==6) {
					System.out.printf("%8d", matriculas[i][j]);
				} else if(j==7) {
					System.out.printf("%10d", matriculas[i][j]);
				}

			}
			System.out.println();
		}
	}

}
