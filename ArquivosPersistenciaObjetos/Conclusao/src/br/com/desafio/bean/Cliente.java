package br.com.desafio.bean;
public class Cliente {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String telefone;
	
	public Cliente(String nome, String cpf, String dataNascimento, String telefone) {
		
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setTelefone(telefone);
	}
	
	public Cliente() {	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


}
