package com.ohmydog.veterinaria.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Administrador")
public class Administrador extends Usuario{
	
	public Administrador() {
	}

	public Administrador(String nombre, String apellido, String mail, String contraseña) {
		super(nombre, apellido, mail, contraseña);
	}

}
