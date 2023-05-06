package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="Cruza")
public class Cruza {

	@Id
	private long id;
	
	private String raza;
	private char sexo;
	private LocalDate fechaDeCeloInicio;
	private LocalDate fechaDeCeloFin;
	private int edad;
	private String mail;
	
	public Cruza(String raza, char sexo, LocalDate fechaDeCeloInicio, LocalDate fechaDeCeloFin, int edad,
			String mail) {
		super();
		this.raza = raza;
		this.sexo = sexo;
		this.fechaDeCeloInicio = fechaDeCeloInicio;
		this.fechaDeCeloFin = fechaDeCeloFin;
		this.edad = edad;
	}

}
