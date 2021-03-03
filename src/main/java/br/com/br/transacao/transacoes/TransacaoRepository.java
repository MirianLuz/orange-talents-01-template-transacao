package br.com.br.transacao.transacoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

	List<Transacao> findTop10ByCartao_NumeroCartaoOrderByIdDesc(String numeroCartao);

}
