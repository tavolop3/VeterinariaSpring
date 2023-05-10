package com.ohmydog.veterinaria.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "Usuario")
public class Usuario{
	
	@Id
	private String mail;
	
	private String nombre;
	private String apellido;
	private String contraseña;
	private boolean esAdmin;
	
	@Indexed(unique = true)
	private String DNI;

	private String telefono;
	private List<Long> perrosId;
	private List<Long> turnosId;
	private List<Long> adopcionesId;
	private List<Long> cruzasId;
	private double montoDescuento;
	
	public Usuario() {
		this.montoDescuento = 0;
	}

	public Usuario(String mail, String nombre, String apellido, String contraseña, boolean esAdmin, String dNI,
			String telefono, List<Long> perrosId, List<Long> turnosId, List<Long> adopcionesId, List<Long> cruzasId,
			double montoDescuento) {
		super();
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
		this.esAdmin = esAdmin;
		DNI = dNI;
		this.telefono = telefono;
		this.perrosId = perrosId;
		this.turnosId = turnosId;
		this.adopcionesId = adopcionesId;
		this.cruzasId = cruzasId;
		this.montoDescuento = montoDescuento;
	}
	
}                                           
                                            