package br.com.br.transacao.estabelecimento;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.endereco.Endereco;

@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nome;
	
	@NotNull
	@Embedded
	private Endereco endereco;
	
	@Deprecated
	public Estabelecimento() {
	}

	public Estabelecimento(String nome, @NotNull Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
}
