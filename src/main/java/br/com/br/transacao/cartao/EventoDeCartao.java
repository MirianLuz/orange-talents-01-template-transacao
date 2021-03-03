package br.com.br.transacao.cartao;

import javax.validation.constraints.NotBlank;

public class EventoDeCartao {

	@NotBlank
	private String id;

	@NotBlank
	private String email;

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Cartao toModel() {
		return new Cartao(id, email);
	}
}
