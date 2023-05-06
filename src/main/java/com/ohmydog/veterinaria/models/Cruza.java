package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	
	public Cruza() {
	}

	public Cruza(String raza, char sexo, LocalDate fechaDeCeloInicio, LocalDate fechaDeCeloFin, int edad,
			String mail) {
		super();
		this.raza = raza;
		this.sexo = sexo;
		this.fechaDeCeloInicio = fechaDeCeloInicio;
		this.fechaDeCeloFin = fechaDeCeloFin;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaDeCeloInicio() {
		return fechaDeCeloInicio;
	}

	public void setFechaDeCeloInicio(LocalDate fechaDeCeloInicio) {
		this.fechaDeCeloInicio = fechaDeCeloInicio;
	}

	public LocalDate getFechaDeCeloFin() {
		return fechaDeCeloFin;
	}

	public void setFechaDeCeloFin(LocalDate fechaDeCeloFin) {
		this.fechaDeCeloFin = fechaDeCeloFin;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}	
}
