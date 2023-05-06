package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
