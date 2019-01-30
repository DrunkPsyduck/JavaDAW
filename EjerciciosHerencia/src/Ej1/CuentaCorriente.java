package Ej1;

public class CuentaCorriente {
	private Titular titular;
	

	private String numeroCuenta;
	private double saldo;

	
	public CuentaCorriente() {

	}

	public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String numeroCuenta) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = 15.3;
	}

	public Titular getTitular() {
		return titular;
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
		
		
		return titular;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}

	
	
	
}
