package br.com.br.transacao.transacoes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

	private final TransacaoRepository transacaoRepository;

	public TransacaoController(TransacaoRepository transacaoRepository) {
		this.transacaoRepository = transacaoRepository;
	}

	@GetMapping(value = "/api/transacao/{id}")
	public ResponseEntity<List<TransacaoResponse>> buscarTransacoes(@PathVariable("id") String id) {

		List<Transacao> transacoes = transacaoRepository.findTop10ByCartao_NumeroCartaoOrderByIdDesc(id);
		List<TransacaoResponse> responses = transacoes.stream()
				.map(t -> new TransacaoResponse(t.getCartao().toCartaoResponse(), t.getValor(),
						t.getEstabelecimento().toEstabelecimentoResponse(), t.getEfetivadaEm()))
				.collect(Collectors.toList());

		return ResponseEntity.status(HttpStatus.OK).body(responses);

	}
}