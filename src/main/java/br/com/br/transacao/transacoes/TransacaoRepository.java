package br.com.br.transacao.transacoes;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
