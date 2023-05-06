package com.ohmydog.veterinaria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="PaseadorCuidador")
public class PaseadorCuidador {

	@Id
	private long id;
	
	private String nombre;
	private String apellido;
	private String tipoServicio;
	private String zona;
	private String disponibilidadHoraria;
	@Indexed(unique = true)
	private String mail;
	
	public PaseadorCuidador(String nombre, String apellido, String tipoServicio, String zona,
			String disponibilidadHoraria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoServicio = tipoServicio;
		this.zona = zona;
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

}
