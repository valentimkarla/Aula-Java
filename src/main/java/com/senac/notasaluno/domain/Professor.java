package com.senac.notasaluno.domain;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Professor extends Pessoa {

	@Transient
	private static final long serialVersionUID = 1L;

	private Double salario;
	
	public Professor() {
		
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
