package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	
	public Perro() {
	}
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
