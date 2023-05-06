package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="PerdidaBusqueda")
public class PerdidaBusqueda {
	
	@Id
	private long id;
	
	private char sexo;
	private String nombre;
	private String foto;
	private String raza;
	private String color;
	private String mail;
	private boolean confirmado;
	
	public PerdidaBusqueda() {
		this.confirmado = false;
	}
	
	public PerdidaBusqueda(char sexo, String nombre, String foto, String raza, String color, String mail) {
		super();
		this.sexo = sexo;
		this.nombre = nombre;
		this.foto = foto;
		this.raza = raza;
		this.color = color;
		this.mail = mail;
		this.confirmado = false;
	}

}
