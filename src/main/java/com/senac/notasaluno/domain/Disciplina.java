package com.senac.notasaluno.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Disciplina implements Serializable{
	@Transient
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/**
	 * A anotação @Column(Length) define a quantidade de caracteres no banco
	 * A anotação @Column(nulllable=true||false) define se o campo será nulo (vazio) ou não 
	 */
	@Column(length=150, nullable=false)
	private String nome; 
	
	/**
	 * A anotação @Column(name) define como será o nome do atributo no banco
	 * A anotação @Column(columnDefinition) define o tipo do atributo no banco, nesse caso "TEXT" pq descrição pode passar de 255 caracteres 
	 */
	@Column(name="descricao", columnDefinition="TEXT")
	private String descricao;
	
	public Disciplina() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
