package br.com.br.transacao.estabelecimento;

import javax.validation.constraints.NotBlank;

public class EventoDeEstabelecimento {

	@NotBlank
	private String nome;

	@NotBlank
	private String cidade;

	@NotBlank
	private String endereco;

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public Estabelecimento toModel() {
		return new Estabelecimento(nome, cidade, endereco);
	}
}
