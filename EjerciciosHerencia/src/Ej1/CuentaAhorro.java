package Ej1;

public class CuentaAhorro extends CuentaCorriente {

	private double interes;
	
	public CuentaAhorro() {
		
	}
	
	public CuentaAhorro(Titular titular, String nCuenta, double saldo, double interes){
		titular = new Titular();
		nCuenta = super.getNumeroCuenta();
		saldo = super.getSaldo();
		this.interes = interes;
	}
	
	public CuentaAhorro(Titular titular, String numeroCuenta, double interes) {
		titular = new Titular();
		numeroCuenta = super.getNumeroCuenta();	
		interes = 2.5;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	
	//metodos 
	public void calcularInteres() {
		
		double saldoInteres=0;
		
		saldoInteres = super.getSaldo();
		saldoInteres *= interes;
		
		super.setSaldo(super.getSaldo() + saldoInteres);
		System.out.println();

		

	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + "]";
	}
	
	
}
