package br.com.desafio.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.com.desafio.bean.Cliente;

public class CadastraCliente {

	public boolean verificaExistenciaCliente(String cpf) {
		File arq = new File("D:\\cliente.txt");
		Cliente c = new Cliente();
		boolean retorno = false;
		ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
		try {
			FileReader fileReader = new FileReader(arq);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (bufferedReader.ready()) {
				String textoLinha = bufferedReader.readLine();
				String textoSplit[] = textoLinha.split(";");
				for (int posicao = 0; posicao < 4; posicao++) {
					c.setNome(textoSplit[0]);
					c.setCpf(textoSplit[1]);
					c.setDataNascimento(textoSplit[2]);
					c.setTelefone(textoSplit[3]);
					clienteList.add(c);
				}
				for (Cliente clienteAux : clienteList) {
					if (clienteAux.getCpf().trim().equals(cpf)) {
						retorno = true;
						break;
					} else {
						retorno = false;
					}
				}

				clienteList.clear();
			}
			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public void novoCliente(Cliente cliente) throws IOException {
		String linha = cliente.getNome() + "; " + cliente.getCpf() + "; " + cliente.getDataNascimento() + "; "
				+ cliente.getTelefone() + "\n";
		FileWriter fw = new FileWriter("D:\\cliente.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(linha);
		bw.close();
	}

}
