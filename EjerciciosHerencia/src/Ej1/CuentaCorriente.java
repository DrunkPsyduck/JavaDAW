package Ej1;

public class CuentaCorriente {
	private Titular titular1;
	private Titular titular2;
	private Titular titular3;

	protected String numeroCuenta;
	protected double saldo;

	public CuentaCorriente() {

	}

	public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
		titular = new Titular();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String numeroCuenta) {
		titular = new Titular();
		this.numeroCuenta = numeroCuenta;
		this.saldo = 15.3;
	}

	public Titular getTitular1() {
		return titular1;
	}

	public Titular getTitular2() {
		return titular2;
	}

	public Titular getTitular3() {
		return titular3;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double nuevoSaldo) {
		this.saldo = nuevoSaldo;
	}
	
	// metodos
	
	public double ingresar(double ingreso) {
		
		saldo += ingreso;
		
		return saldo;
	}
	
	public double reintegro(double reintegro) {
		
		saldo -= reintegro;
		
		return saldo;
	}
	
	public Titular cuenta(){
		
		
		return titular1;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Cuenta Corriente: ");
		sb.append(titular1).append("\nNumero cuenta: ").append(numeroCuenta).append("\nSaldo: ").append(saldo);
		
		return sb.toString();
	
	}


	
}
