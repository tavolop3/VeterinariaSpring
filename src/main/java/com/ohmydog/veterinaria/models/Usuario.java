package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Usuario")
public class Usuario {
	
	@Id
	private String mail;
	
	private String nombre;
	private String apellido;
	private String contraseña;
	
	public Usuario() {
	}
	
	public Usuario(String nombre, String apellido, String mail, String contraseña) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contraseña = contraseña;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
