package Ej1;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente cc = new CuentaCorriente();
		CuentaAhorro ca = new CuentaAhorro();
		Lector sc = new Lector();
		// declaración variables para ménu
		boolean fin = false;
		String seleccion;
		// String cuenta;

		Titular titularCuenta[] = null;
		CuentaCorriente cuentas[] = null;
		CuentaAhorro cuentaAhorro[] = null;

		while (!fin) {

			System.out.println(
					"¿Que operación desea realizar?\nNuevo " + " \nSaldo\nIngreso\nReintegro\nInteres\nTitular\nSalir");
			seleccion = sc.next();

			switch (seleccion.toLowerCase()) {

			case "nuevo":

				System.out.println("¿Cuántas cuentas desea crear?");
				int numero = sc.nextInt();

				titularCuenta = new Titular[numero];
				cuentas = new CuentaCorriente[numero];

				for (int i = 0; i < titularCuenta.length; i++) {
					System.out.println("Introduzca el nombre");
					String nombre = sc.next();
					System.out.println("Introduzca los apellidos");
					String apellidos = sc.next();
					System.out.println("Introduzca la edad");
					int edad = sc.nextInt();

					titularCuenta[i] = new Titular(nombre, apellidos, edad);

				}

				for (int i = 0; i < cuentas.length; i++) {
					System.out.println("¿Cuenta corriente o cuenta Ahorro?");
					String tipo = sc.next();
					
					if (tipo.equalsIgnoreCase("corriente")) {
					cuentas[i] = new CuentaCorriente(titularCuenta[i], cc.getNumeroCuenta(), 0);
					} else {
					cuentas[i] = new CuentaAhorro(titularCuenta[i], cc.getNumeroCuenta(), 2.5);
					}
				}

//				Casting de un array a otro						
//				if (cuentas[0].getClass().getSimpleName().equals("CuentaAhorro")) {
//					//((CuentaAhorro)cuentas[0]).
//					CuentaAhorro x= ((CuentaAhorro)cuentas[0]);
//				}
				

//				System.out.println("¿Desea introducir dinero?");
//				String sel = sc.next();
//
//				if (sel.equalsIgnoreCase("si")) {
//					System.out.println("Introduzca la cantidad");
//					double ingreso = sc.nextDouble();
//					cc.setSaldo(ingreso);
//				}

				break;

			case "saldo":

				System.out.println(cc.getSaldo());
				System.out.println("Dispone de " + cc.getSaldo() + "€");
				break;

			case "ingreso":
				System.out.println("Cuanto desea ingresar");

				double nuevoSaldo = sc.nextDouble();
				cc.setSaldo(cc.getSaldo() + nuevoSaldo);
				System.out.println("Dispone de " + cc.getSaldo() + "€");
				break;

			case "reintegro":

				if (cc.getSaldo() <= 0) {
					System.out.println(" No dispone de saldo.");
				} else {
					System.out.println("¿Cuanto desea retirar?");
					double reintegro = sc.nextDouble();
					reintegro = cc.reintegro(reintegro);
					System.out.println("Le quedan en la cuenta " + reintegro);
				}

				break;

			case "salir":

				fin = true;
				break;

			case "interes":

				System.out.println(ca);

				break;
			case "titular":
				break;

			default:
				System.out.println("No valido");
			}

		}

	}

}