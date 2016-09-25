package com.projeto.projetotestg.dto;

import java.io.Serializable;

import com.projeto.projetotestg.facade.IExibicao;

public class Pessoa implements Serializable, IExibicao {

	private static final long serialVersionUID = -4335313338176155334L;

	private Long codigo;
	private String nome;
	private String email;
	private Long pontosExperiencia;
	private Long nivel;
	private Localizacao localizacaoAtual;
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void apresentar() {
		System.out.println(this.toString());
	}

	public Long getPontosExperiencia() {
		return pontosExperiencia;
	}

	public void setPontosExperiencia(Long pontosExperiencia) {
		this.pontosExperiencia = pontosExperiencia;
	}

	public Long getNivel() {
		return nivel;
	}

	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}

	public Localizacao getLocalizacaoAtual() {
		return localizacaoAtual;
	}

	public void setLocalizacaoAtual(Localizacao localizacaoAtual) {
		this.localizacaoAtual = localizacaoAtual;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", pontosExperiencia="
				+ pontosExperiencia + ", nivel=" + nivel + ", localizacaoAtual=" + localizacaoAtual + "]";
	}

	

}
