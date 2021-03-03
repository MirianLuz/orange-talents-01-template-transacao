package br.com.br.transacao.transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.br.transacao.cartao.CartaoResponse;
import br.com.br.transacao.estabelecimento.EstabelecimentoResponse;

public class TransacaoResponse {

	private CartaoResponse cartao;

	private BigDecimal valor;

	private EstabelecimentoResponse estabelecimento;

	private LocalDateTime efetivadaEm;

	public TransacaoResponse(CartaoResponse cartao, BigDecimal valor, EstabelecimentoResponse estabelecimento,
			LocalDateTime efetivadaEm) {
		this.cartao = cartao;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.efetivadaEm = efetivadaEm;
	}

	public CartaoResponse getCartao() {
		return cartao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EstabelecimentoResponse getEstabelecimento() {
		return estabelecimento;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

}
