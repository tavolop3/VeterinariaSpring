package com.ohmydog.veterinaria.models;

import java.util.List;

import org.bson.types.ObjectId;
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
	private boolean logeado;
	
	@Indexed(unique = true)
	private String dni;

	private String telefono;
	private List<ObjectId> perrosId;
	private List<Long> turnosId;
	private List<Long> adopcionesId;
	private List<Long> cruzasId;
	private double montoDescuento;
	
	public Usuario() {
		this.montoDescuento = 0;
	}

	public Usuario(String mail, String nombre, String apellido, String contraseña, boolean esAdmin, String dni,
			String telefono, List<ObjectId> perrosId, List<Long> turnosId, List<Long> adopcionesId, List<Long> cruzasId,
			double montoDescuento) {
		super();
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
		this.esAdmin = esAdmin;
		this.dni = dni;
		this.telefono = telefono;
		this.perrosId = perrosId;
		this.turnosId = turnosId;
		this.adopcionesId = adopcionesId;
		this.cruzasId = cruzasId;
		this.montoDescuento = montoDescuento;
	}

	@Override
	public String toString() {
		return "Usuario [mail=" + mail + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + dni 
				+ ", telefono=" + telefono + "]";
	}
	

}                                           
                                            