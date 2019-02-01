package Futbol;

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
	 
		return lector;
	}
	
	public int nextInt() {
		int lector;
		lector = sc.nextInt();
		return lector;
	}
	
	public double nextDouble() {
		double lector;
		lector = sc.nextDouble();
		return lector;
	}
}