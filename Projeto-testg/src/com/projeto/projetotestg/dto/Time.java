package com.projeto.projetotestg.dto;

public enum Time {

	AZUL(1, "Azul"),
	AMARELO(2, "Amarelo"),
	VERMELHO(3, "Vermelho");
	
	private int codigo;
	private String descricao;
	
	private Time(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
