package br.com.desafio.run;

import java.io.IOException;

import br.com.desafio.bean.Cliente;
import br.com.desafio.controller.CadastraCliente;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Carlos", "000.321.321-61", "12-04-1999", "Rua ABC");
		
		CadastraCliente cc = new CadastraCliente();
		
		if (!cc.verificaExistenciaCliente("000.321.321-61")) {
			try {
				cc.novoCliente(c);
				System.out.println("Cliente cadastrado com sucesso!");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else
			System.out.println("Cliente já está cadastrado!");
	}
}
