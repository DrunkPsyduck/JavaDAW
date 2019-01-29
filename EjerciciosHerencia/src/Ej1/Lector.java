package Ej1;

import java.util.Scanner;

public class Lector {

	Scanner sc = new Scanner(System.in);
	
	public Lector() {
		
	}
	
	public String next() {
		String lector;
		
		lector = sc.next();
		return lector;
	}
	
	public String nextLine() {
		String lector;
		
		lector = sc.nextLine();
		sc.close(); 
		return lector;
	}
	
	public int nextInt() {
		int lector;
		lector = nextInt();
		return lector;
	}
	
	public int nextDouble() {
		int lector;
		lector = nextDouble();
		return lector;
	}
}
