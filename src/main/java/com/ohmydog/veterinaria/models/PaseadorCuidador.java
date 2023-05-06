package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="PaseadorCuidador")
public class PaseadorCuidador {

	@Id
	private long id;
	
	private String nombre;
	private String apellido;
	private String tipoServicio;
	private String zona;
	private String disponibilidadHoraria;
	
	public PaseadorCuidador() {
	}
	
	public PaseadorCuidador(String nombre, String apellido, String tipoServicio, String zona,
			String disponibilidadHoraria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoServicio = tipoServicio;
		this.zona = zona;
		this.disponibilidadHoraria = disponibilidadHoraria;
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
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}
	public void setDisponibilidadHoraria(String disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}
}
