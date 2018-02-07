package com.senac.notasaluno.domain;


import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Aluno extends Pessoa {

	@Transient
	private static final long serialVersionUID = 1L;
	
	@Column(unique=true, nullable=false)
	private String email;
	
	/**
	 * @utowired - Informa que o Spring irá gerenciar o instanciamento do objeto 
	 * @ElementCollection - Define o mapeamento da coleção  (nesse caso "telefones" dentro do objeto aluno), aonde é feito o relacionamento (cardinalidade) 1-n(one-to-many)
	 * @CollectionTable(name="telefone") - Especifica o nome da tabelaque será usada pelo mapeamento
	 */
	@Autowired
	@ElementCollection
	@CollectionTable(name="telefones")
	private Set<String> telefones;
	private String situacao;
	
	
	public String getSituacao() {
		return situacao;
		
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Aluno() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
}
