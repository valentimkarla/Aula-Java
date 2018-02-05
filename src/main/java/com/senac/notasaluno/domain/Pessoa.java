package com.senac.notasaluno.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
//Anotação para definir se a classe será persistida para o banco (Virar tabela)

/**
 * As anotações do hibernate serão do javax.persistence
 * A anotação @Entity é utilizada para definir a classe como uma entidade persistida no banco (virar tabela)
 * A anotação @Entity pode ter parâmetros passados como o nome da tabela, é necessário adicionar
 * () com o valor "name", como no exemplo @Entity(name="tb_pessoa")  
 **/
@Entity
public class Pessoa implements Serializable{ //Serializable garante a transmissão correta de dados, evita falhas
	/**
	 * Anotação @Transient é utilizada para dizer que este atributo não será persistido no banco de dados (não vai virar tabela)
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	 /**
	  *  A anotação @Id comunica ao hibernate  qual atributo será a chave primaria (PK)
	  *  A anotação @GeneratedValue comunica ao hibernate que a chave será incrementada  e o 
	  *  escopo da incrementação  (auto increment ou não)
	  **/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	/**
	 * A anotação @Column é utilizada para definir caracteristicas do atributo (coluna)
	 * tais como: tamanho de caracteres, se é única, se terá valores nulos e etc...
	 */
	@Column(unique=true)
	private String cpf;
	@Column(unique=true)
	private String matricula;
	
	public Pessoa() {
		
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



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
