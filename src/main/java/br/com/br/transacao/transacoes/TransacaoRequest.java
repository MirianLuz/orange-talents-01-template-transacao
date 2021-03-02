package br.com.br.transacao.transacoes;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.cartao.Cartao;
import br.com.br.transacao.estabelecimento.Estabelecimento;

public class TransacaoRequest {

	@NotBlank
	private String numero;
	
	@NotNull
	private Cartao cartao;
	
	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private Estabelecimento estabelecimento;

	public TransacaoRequest(@NotBlank String numero, @NotNull Cartao cartao, @NotNull BigDecimal valor,
			@NotNull Estabelecimento estabelecimento) {
		this.numero = numero;
		this.cartao = cartao;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
	}
	
	
}
