package Ejercicio4;

import java.util.Scanner;

public class Lector {
	public Scanner sc = new Scanner(System.in);
	
	public Lector() {
		
	}
	
	public long enteroLargo() {
		long lector = sc.nextLong();
		return lector;
	}
	
	public String next() {
		String lector = sc.next();
		return lector;
	}
	
	public int entero() {
		int lector = sc.nextInt();
		return lector;
	}
	
}
