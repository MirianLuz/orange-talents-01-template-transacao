package br.com.br.transacao.cartao;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Embeddable
public class Cartao {

	@NotNull
	private String numeroCartao;

	@Email
	private String email;

	@Deprecated
	public Cartao() {
	}

	public Cartao(String numeroCartao, String email) {
		this.numeroCartao = numeroCartao;
		this.email = email;
	}

	public CartaoResponse toCartaoResponse() {
		return new CartaoResponse(numeroCartao, email);
	}

}
