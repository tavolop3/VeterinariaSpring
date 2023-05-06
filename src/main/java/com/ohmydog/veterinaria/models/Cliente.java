package com.ohmydog.veterinaria.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "Cliente")
public class Cliente extends Usuario{
	
	@Indexed(unique = true)
	private String DNI;	
	private String telefono;
	private List<Long> perrosId;
	private List<Long> turnosId;
	private List<Long> adopcionesId;
	private List<Long> cruzasId;
	private double montoDescuento;
	
	public Cliente() {
		this.montoDescuento = 0;
	}
	
	public Cliente(String nombre, String apellido, String mail, String contraseña, String dNI, String telefono) {
		super(nombre, apellido, mail, contraseña);
		DNI = dNI;
		this.telefono = telefono;
		this.montoDescuento = 0;
	}

	public Cliente(String nombre, String apellido, String mail, String contraseña, String dNI, String telefono,
			List<Long> perrosId, List<Long> turnosId, List<Long> adopcionesId, List<Long> cruzasId) {
		super(nombre, apellido, mail, contraseña);
		DNI = dNI;
		this.telefono = telefono;
		this.perrosId = perrosId;
		this.turnosId = turnosId;
		this.adopcionesId = adopcionesId;
		this.cruzasId = cruzasId;
		this.montoDescuento = 0;
	}                                  
	
}                                           
                                            