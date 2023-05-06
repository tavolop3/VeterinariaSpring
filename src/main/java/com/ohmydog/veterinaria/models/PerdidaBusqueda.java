package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	}
	
	public PerdidaBusqueda(char sexo, String nombre, String foto, String raza, String color, String mail,
			boolean confirmado) {
		super();
		this.sexo = sexo;
		this.nombre = nombre;
		this.foto = foto;
		this.raza = raza;
		this.color = color;
		this.mail = mail;
		this.confirmado = confirmado;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
}
