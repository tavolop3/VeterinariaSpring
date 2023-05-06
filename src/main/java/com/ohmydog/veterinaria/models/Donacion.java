package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="Donacion")
public class Donacion {
	
	@Id
	private String nombre;
	
	private double montoObjetivo;
	private double montoRecaudado;
	private String descripcion;
	
	public Donacion(String nombre, double montoObjetivo, double montoRecaudado, String descripcion) {
		super();
		this.nombre = nombre;
		this.montoObjetivo = montoObjetivo;
		this.montoRecaudado = montoRecaudado;
		this.descripcion = descripcion;
	}
	
}
