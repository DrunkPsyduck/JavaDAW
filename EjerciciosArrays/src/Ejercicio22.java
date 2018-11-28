
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriculas[][];
		char asignaturas[][];
				
		matriculas = new int[6][8];
		asignaturas = new char[8][];
		
		/*
		asignaturas[0]= {'Á','l','g','e','b','r','a'};
		asignaturas[1]= {'C','á','l','c','u','l','o'};
		asignaturas[2]= {'P','r','o','g','r','a','m','a','c','i','o','n'};
		asignaturas[3]= {'I','n','g','l','é','s'};
		asignaturas[4]= {'E','s','t','a','d','í','s','t','i','c','a'};
		asignaturas[5]= {'H','i','s','t','o','r','i','a'};
		asignaturas[6]= {'T','e','c','n','o','l','o','g','í','a'};
		*/
		
		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				matriculas[i][j]= (int) (Math.random()*35)+12;
			}
		}
		
		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				System.out.print(matriculas[i][j] + " ");

			}
			System.out.println();
		}
		
	}

}
