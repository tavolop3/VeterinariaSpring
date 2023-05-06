package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="PuntoUrgencia")
public class PuntoUrgencia {
	
	@Id
	private String direccion;
	private String horarios;
	private String infoContacto;
	
	public PuntoUrgencia(String direccion, String horarios, String infoContacto) {
		super();
		this.direccion = direccion;
		this.horarios = horarios;
		this.infoContacto = infoContacto;
	}
	
}
