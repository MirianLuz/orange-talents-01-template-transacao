package br.com.br.transacao.estabelecimento;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.endereco.EnderecoRequest;

public class EstabelecimentoRequest {
	
	@NotBlank
	private String nome;
	
	@NotNull
	private EnderecoRequest endereco;

	public EstabelecimentoRequest(@NotBlank String nome, EnderecoRequest endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Estabelecimento toModel() {
		return new Estabelecimento(nome, endereco.toModel());
	}
	
}
