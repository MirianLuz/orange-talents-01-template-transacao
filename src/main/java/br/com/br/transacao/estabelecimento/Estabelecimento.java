package br.com.br.transacao.estabelecimento;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Embeddable
public class Estabelecimento {

	@NotBlank
	private String nome;

	@NotBlank
	private String cidade;

	@NotNull
	private String endereco;

	@Deprecated
	public Estabelecimento() {
	}

	public Estabelecimento(@NotBlank String nome, @NotBlank String cidade, @NotNull String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public EstabelecimentoResponse toEstabelecimentoResponse() {
		return new EstabelecimentoResponse(nome, cidade, endereco);
	}

}
