package br.com.br.transacao.transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.cartao.Cartao;
import br.com.br.transacao.cartao.CartaoRepository;
import br.com.br.transacao.estabelecimento.Estabelecimento;
import br.com.br.transacao.estabelecimento.EstabelecimentoRepository;

public class EventoDeTransacao {
	
	@NotBlank
	private String numero;
	
	@NotNull
	private Cartao cartao;
	
	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private Estabelecimento estabelecimento;
	
	private LocalDateTime efetivadaEm;
	
	public EventoDeTransacao(@NotBlank String numero, @NotNull Cartao cartao, @NotNull BigDecimal valor,
			@NotNull Estabelecimento estabelecimento, LocalDateTime efetivadaEm) {
		this.numero = numero;
		this.cartao = cartao;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.efetivadaEm = efetivadaEm;
	}

	public Transacao toModel(CartaoRepository cartaoRepository, EstabelecimentoRepository estabelecimentoRepository) {
		return new Transacao(numero, cartao, valor, estabelecimento,efetivadaEm);
	}

}
