package com.projeto.projetotestg.dto;

public enum Tipo {

	FOGO(1, "Fogo"),
	AGUA(2, "Agua"),
	Terra(3, "Terra"),
	VOADOR(4, "Voador"),
	ELETRICO(5, "Eletrico"),
	PSIQUICO(6, "Psiquico"),
	PEDRA(7, "Pedra"),
	VENENO(8, "Veneno"),
	DRAGAO(9, "Dragao"),
	FADA(10, "Fada");
	
	private int codigo;
	private String descricao;
	
	private Tipo(int codigo, String descricao){
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
