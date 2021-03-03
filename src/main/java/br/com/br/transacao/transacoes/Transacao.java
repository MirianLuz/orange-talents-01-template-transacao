package br.com.br.transacao.transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.br.transacao.cartao.Cartao;
import br.com.br.transacao.estabelecimento.Estabelecimento;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String numero;

	@NotNull
	@Embedded
	private Cartao cartao;

	@NotNull
	private BigDecimal valor;

	@NotNull
	@Embedded
	private Estabelecimento estabelecimento;

	private LocalDateTime efetivadaEm;

	@Deprecated
	public Transacao() {
	}

	public Transacao(@NotBlank String numero, @NotNull Cartao cartao, @NotNull BigDecimal valor,
			@NotNull Estabelecimento estabelecimento, LocalDateTime efetivadaEm) {
		this.numero = numero;
		this.cartao = cartao;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.efetivadaEm = efetivadaEm;
	}

	public Long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

}
