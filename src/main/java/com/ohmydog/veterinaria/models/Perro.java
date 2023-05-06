package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "Perro")
public class Perro {

	@Id
	private long id;
	
	private String nombre;
	private char sexo;
	private LocalDate fechaNacimiento;
	private String raza;
	private String color;
	private String observaciones;
	private String foto;
	
	public Perro(String nombre, char sexo, LocalDate fechaNacimiento, String raza, String color, String observaciones,
			String foto) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.raza = raza;
		this.color = color;
		this.observaciones = observaciones;
		this.foto = foto;
	}

}
