package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Donacion")
public class Donacion {
	
	@Id
	private String nombre;
	
	private double montoObjetivo;
	private double montoRecaudado;
	private String descripcion;
	
	public Donacion() {
	}
	
	public Donacion(String nombre, double montoObjetivo, double montoRecaudado, String descripcion) {
		super();
		this.nombre = nombre;
		this.montoObjetivo = montoObjetivo;
		this.montoRecaudado = montoRecaudado;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMontoObjetivo() {
		return montoObjetivo;
	}
	public void setMontoObjetivo(double montoObjetivo) {
		this.montoObjetivo = montoObjetivo;
	}
	public double getMontoRecaudado() {
		return montoRecaudado;
	}
	public void setMontoRecaudado(double montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
