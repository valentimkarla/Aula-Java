package com.senac.notasaluno.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class CursaDisciplina {
	
	/**
	 * A anotação @Autowired define que o spring irá gerenciar a instancia do objeto (new CursaDisciplina())
	 * A anotação @EmbeddedId define a origem da(s) chave(s) primária(s) do objeto que estou criando 
	 */
	@Autowired
	@EmbeddedId
	private CursaDisciplinaPK id;
	
	@Column(name="nota_01", columnDefinition="float8")
	private Double nota01;
	@Column(name="nota_02", columnDefinition="float8")
	private Double nota02;
	
	public CursaDisciplina() {
		
	}
	
	
	
	public CursaDisciplinaPK getId() {
		return id;
	}



	public void setId(CursaDisciplinaPK id) {
		this.id = id;
	}



	public Double getNota01() {
		return nota01;
	}



	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}



	public Double getNota02() {
		return nota02;
	}



	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}

	public Double getMedia() {
		return (nota01+nota02) / 2;
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
		CursaDisciplina other = (CursaDisciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
