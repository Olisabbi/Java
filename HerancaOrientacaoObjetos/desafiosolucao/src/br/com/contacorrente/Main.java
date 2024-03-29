package br.com.contacorrente;

public class Main {

	public static void main(String[] args) {
		
		//cliente com conta comum
		ContaCorrente ccComum = new ContaCorrente(5000.00);
		Cliente maria = new Cliente("Maria", "177.894.340-39", ccComum );
		maria.getContaCorrente().saque(1000.00);
		
		//cliente com conta especial
		ContaCorrenteEspecial ccEspecial = new ContaCorrenteEspecial(5000.00);
		Cliente tereza = new Cliente("tereza", "835.618.390-10", ccEspecial );
		tereza.getContaCorrente().saque(1000.00);
		
		System.out.println("Saldo atual de Maria: "+maria.getContaCorrente().getSaldo());
		System.out.println("Saldo atual de Tereza: "+tereza.getContaCorrente().getSaldo());

	}

}
