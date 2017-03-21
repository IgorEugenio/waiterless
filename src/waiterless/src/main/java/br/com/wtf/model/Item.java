package br.com.wtf.model;

import java.io.Serializable;

@Entity
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String nome;
	private String descricao;
	private String classificacao;
	private double valor;
	
	protected Item(){}
	
	public Item(String nome, String descricao, 
			String classificacao, double valor){
		this.nome = nome;
		this.descricao = descricao;
		this.classificacao = classificacao;
		this.valor = valor;
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

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
