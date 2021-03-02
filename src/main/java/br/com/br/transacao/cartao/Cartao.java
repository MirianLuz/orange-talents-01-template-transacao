package br.com.br.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String numero;
	
	@Email
	private String email;

	@Deprecated	
	public Cartao() {
	}

	public Cartao(String numero, String email) {
		this.numero = numero;
		this.email = email;
	}

}
