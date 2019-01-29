package Ej1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente cc = new CuentaCorriente();
		CuentaAhorro ca = new CuentaAhorro();
		Titular titular = new Titular();
		Lector sc = new Lector();
		//declaración variables para ménu
		boolean fin = false;
		String seleccion;
		String cuenta;
		
		System.out.println(cc);
		System.out.println("_________________");
		System.out.println(ca);
		System.out.println("_________________");
		System.out.println(titular);
		
		
		while (!fin) {
		
			
			System.out.println("Introduzca la opción deseada");
			seleccion = sc.next();
			
			
			switch(seleccion.toLowerCase()) {
			
			case "nuevo":

				
				System.out.println("¿Cuántas cuentas desea crear?");
					int numero = sc.nextInt();
					
					Titular titularCuenta[] = new Titular[numero];
					CuentaCorriente cuentas[] = new CuentaCorriente[numero];
					
					for (int i = 0; i < titularCuenta.length; i++) {
						System.out.println("Introduzca el nombree, los apellidos y la edad");
						
						String nombre = sc.next();
						String apellidos = sc.nextLine();
						int edad = sc.nextInt();
						
						titularCuenta[i] = new Titular(nombre, apellidos, edad);
						
					}
					
					for (int i = 0; i < cuentas.length; i++) {
						
						
						
						cuentas[i] = new CuentaCorriente(titularCuenta[i], "" );
					}
				break;
				
			case "saldo":
				
				System.out.println(cc.getSaldo());
				break;
				
			case "ingreso":
				System.out.println("Cuanto desea ingresar");
				
				double nuevoSaldo = sc.nextDouble();
				cc.setSaldo(nuevoSaldo);
				break;
				
			case "reintegro":
				System.out.println("¿Cuanto desea retirar?");
				
				double reintegro = sc.nextDouble();
				reintegro = cc.reintegro(reintegro);
				System.out.println(reintegro);
				break;
				
			case "salir": 
				
				fin = true;
				break;
			default:
				System.out.println("No valido");
			}
			
		}
			
		
		
	}

}
