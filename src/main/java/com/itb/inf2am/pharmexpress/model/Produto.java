package com.itb.inf2am.pharmexpress.model;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	// public : Acesso liberado para todas as classes.
	
	// private : Acesso permitido apenas para os membros
	// 			(atributos e ou metódos) da própria classe.
	
	
	
}