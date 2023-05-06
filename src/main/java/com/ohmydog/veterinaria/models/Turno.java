package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Turno")
public class Turno {
	
	@Id
	private long id;
	
	private String nombreDePerro; 
	private String rangoHorario;
	private String DNI;
	private String motivo;
	private String estado;
	private LocalDate fecha;
	
	public Turno() {
	}
	
	public Turno(String nombreDePerro, String rangoHorario, String dNI, String motivo, String estado, LocalDate fecha) {
		super();
		this.nombreDePerro = nombreDePerro;
		this.rangoHorario = rangoHorario;
		DNI = dNI;
		this.motivo = motivo;
		this.estado = estado;
		this.fecha = fecha;
	}

	public String getNombreDePerro() {
		return nombreDePerro;
	}
	public void setNombreDePerro(String nombreDePerro) {
		this.nombreDePerro = nombreDePerro;
	}
	public String getRangoHorario() {
		return rangoHorario;
	}
	public void setRangoHorario(String rangoHorario) {
		this.rangoHorario = rangoHorario;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
