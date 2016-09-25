package com.projeto.projetotestg.dto;

import java.io.Serializable;

import com.projeto.projetotestg.facade.IExibicao;

public class Item implements Serializable, IExibicao {

	private static final long serialVersionUID = 6803164362869443834L;
	private Integer codigo;
	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void apresentar() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
