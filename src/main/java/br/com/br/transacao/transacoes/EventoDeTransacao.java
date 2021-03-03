package br.com.br.transacao.transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.cartao.EventoDeCartao;
import br.com.br.transacao.estabelecimento.EventoDeEstabelecimento;

public class EventoDeTransacao {

	@NotBlank
	private String id;

	@NotNull
	private BigDecimal valor;

	@NotNull
	private EventoDeEstabelecimento estabelecimento;

	@NotNull
	private EventoDeCartao cartao;

	@NotNull
	private LocalDateTime efetivadaEm;

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EventoDeEstabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public EventoDeCartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	public Transacao toModel() {
		return new Transacao(id, cartao.toModel(), valor, estabelecimento.toModel(), efetivadaEm);
	}

}
