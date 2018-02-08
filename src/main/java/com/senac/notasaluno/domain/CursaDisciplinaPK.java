package com.senac.notasaluno.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


/**
 *A anotação @Embeddable é utilizada na classe que será responsável por conter as chaves primárias
 */
@Embeddable
public class CursaDisciplinaPK implements Serializable{
	@Transient
	private static final long serialVersionUID= 1L;
	
	/**
	 * A anotação @ManyToOne define que será uma relação Muitos-para-um, aonde a classe em que foi feita a anotação terá muitas relações com a classe associada
	 * A anotação @JoinColumn(name) define o nome do atributo de relação (Foreign key) no banco  
	 **/
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	Disciplina disciplina;
	
	@ManyToOne
	@JoinColumn(name="aluno_id")
	Aluno aluno;
	
	public CursaDisciplinaPK() {
		
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
