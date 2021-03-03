package br.com.br.transacao.cartao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class DadosCartaoRequest {

	@NotNull
	private String numero;

	@Email
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

	public Cartao toModel() {
		return new Cartao(numero, email);
	}

}
