package br.com.br.transacao.cartao;

public class DadosCartaoRequest {

	private String numero;
	
	private String email;

	public DadosCartaoRequest(String numero, String email) {
		this.numero = numero;
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public String getEmail() {
		return email;
	}

}
