package HerancaOrientacaoObjetos;

import HerancaOrientacaoObjetos.HerancaConta.Correntista;

public class Main {
    public static void main(String[] args) {
  
Correntista correntistaNormal = new Correntista(1, 2000.00, true, "Faria", 987657321, 1);
System.out.println("Saldo inicial do correntista normal: " + correntistaNormal.getSaldo());
correntistaNormal.depositar(1000.00);
System.out.println("Saldo após depósito: " + correntistaNormal.getSaldo());
correntistaNormal.sacar(200.00);
System.out.println("Saldo após saque com taxa normal: " + correntistaNormal.getSaldo());
System.out.println("Tarifas cobradas do correntista normal: " + correntistaNormal.tarifas);
System.out.println("ID do correntista normal: " + correntistaNormal.id);

// Criando uma conta para um correntista especial
Correntista correntistaEspecial = new Correntista(2, 2000.00, true, "Maria", 987654321, 2);
System.out.println("\nSaldo inicial do correntista especial: " + correntistaEspecial.getSaldo());
correntistaEspecial.depositar(1000.00);
System.out.println("Saldo após depósito: " + correntistaEspecial.getSaldo());
correntistaEspecial.sacar(200.00);
System.out.println("Saldo após saque com taxa reduzida: " + correntistaEspecial.getSaldo());
System.out.println("Tarifas cobradas do correntista especial: " + correntistaEspecial.tarifas);
System.out.println("ID do correntista especial: " + correntistaEspecial.id);

    }
}
