package br.com.contacorrente;

public class ContaCorrente {

	protected double saldo;
	protected double taxa;
	
	public ContaCorrente(double saldo) {
		this.setSaldo(saldo);
		this.setTaxa();
	}
	
	public void saque(double valor) {
		if (saldo > valor) {
			this.saldo = this.saldo - valor - (0.05 * valor);
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}

	public void deposita(double valor) {}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa() {
		this.taxa = 0.05;
	}
}
