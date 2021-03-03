package br.com.br.transacao.kafka;

import javax.transaction.Transactional;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.br.transacao.transacoes.EventoDeTransacao;
import br.com.br.transacao.transacoes.Transacao;
import br.com.br.transacao.transacoes.TransacaoRepository;

@Component
public class ListenerDeTransacao {

	private final TransacaoRepository transacaoRepository;

	public ListenerDeTransacao(TransacaoRepository transacaoRepository) {
		this.transacaoRepository = transacaoRepository;
	}

	@Transactional
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void ouvir(EventoDeTransacao eventoDeTransacao) {
		Transacao transacao = eventoDeTransacao.toModel();
		transacaoRepository.save(transacao);
	}

}