package com.ohmydog.veterinaria.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
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
	
	public Turno(String nombreDePerro, String rangoHorario, String dNI, String motivo, String estado, LocalDate fecha) {
		super();
		this.nombreDePerro = nombreDePerro;
		this.rangoHorario = rangoHorario;
		DNI = dNI;
		this.motivo = motivo;
		this.estado = estado;
		this.fecha = fecha;
	}

}
