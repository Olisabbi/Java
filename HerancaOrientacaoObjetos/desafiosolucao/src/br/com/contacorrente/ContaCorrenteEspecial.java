package br.com.contacorrente;

public class ContaCorrenteEspecial extends ContaCorrente{
	
	//chama o construtor da superclasse
	public ContaCorrenteEspecial(double saldo) {
		super(saldo);
	}
	
	//sobrescreve o método saque da classe pai
	public void saque(double valor) {
		if(saldo > valor) {
			super.saldo = super.saldo - valor - (0.01 * valor);	
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}

}
