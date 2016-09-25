package com.projeto.projetotestg.dto;

import java.io.Serializable;

public class Localizacao implements Serializable{


	private static final long serialVersionUID = -5907273240514678167L;
	
	private long latitude;
	private long longitude;
	
	public Localizacao() {
	}
	
	
	public Localizacao(long latitude, long longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	
}
