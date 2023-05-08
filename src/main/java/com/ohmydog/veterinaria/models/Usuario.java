package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
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
	
	
}
