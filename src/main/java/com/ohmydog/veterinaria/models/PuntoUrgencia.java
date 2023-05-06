package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="PuntoUrgencia")
public class PuntoUrgencia {
	
	@Id
	private String direccion;
	
	private String horarios;
	private String infoContacto;
	
	public PuntoUrgencia() {
	}
	
	public PuntoUrgencia(String direccion, String horarios, String infoContacto) {
		super();
		this.direccion = direccion;
		this.horarios = horarios;
		this.infoContacto = infoContacto;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	public String getInfoContacto() {
		return infoContacto;
	}
	public void setInfoContacto(String infoContacto) {
		this.infoContacto = infoContacto;
	}
}
