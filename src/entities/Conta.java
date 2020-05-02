package entities;

public class Conta {
	private int numeroConta;
	private String titular;
	private double saldo;

	public Conta() {
		System.out.println("Iniciando conta.");
	}

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public Conta(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.deposito(saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	/*
	 * public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta;
	 * }
	 */

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	/*
	 * public void setSaldo(double saldo) { this.saldo = saldo; }
	 */

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor + 5.0;
	}

	public String toString() {
		return "Account " 
				+ this.getNumeroConta() 
				+ ", Holder: " 
				+ this.getTitular() 
				+ ", Balence: $ "
				+ String.format("%.2f", this.getSaldo());
	}

}
