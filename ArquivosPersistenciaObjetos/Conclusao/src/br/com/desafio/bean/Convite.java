package br.com.desafio.bean;

public class Convite {
	
	private String nomeEvento;
	private Float valorConvite;
	private String local;
	
	public Convite(String nomeEvento, Float valorconvite, String local) {
		this.setNomeEvento(nomeEvento);
		this.setValorConvite(valorconvite);
		this.setLocal(local);
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Float getValorConvite() {
		return valorConvite;
	}

	public void setValorConvite(Float valorConvite) {
		this.valorConvite = valorConvite;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	

	

}
