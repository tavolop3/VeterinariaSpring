package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="Adopcion")
public class Adopcion {
	
	@Id
	private long id;
	
	private String nombre;
	private int edad;
	private String raza;
	private char sexo;
	private String color;
	private String tamaño;
	private String origen;
	private boolean confirmado;
	private String mail;
	
	public Adopcion() {
		this.confirmado = false;
	}
	
	public Adopcion(String nombre, int edad, String raza, char sexo, String color, String tamaño, String origen,
			String mail) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.tamaño = tamaño;
		this.origen = origen;
		this.confirmado = false;
		this.mail = mail;
	}

}
