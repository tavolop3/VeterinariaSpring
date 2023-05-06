package com.ohmydog.veterinaria.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Cliente")
public class Cliente extends Usuario{
	
	private String DNI;	
	private String telefono;
	private List<Long> perrosId;
	private List<Long> turnosId;
	private List<Long> adopcionesId;
	private List<Long> cruzasId;
	private double montoDescuento;
	
	public Cliente() {
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Long> getPerrosId() {
		return perrosId;
	}

	public void setPerrosId(List<Long> perrosId) {
		this.perrosId = perrosId;
	}

	public List<Long> getTurnosId() {
		return turnosId;
	}

	public void setTurnosId(List<Long> turnosId) {
		this.turnosId = turnosId;
	}

	public List<Long> getAdopcionesId() {
		return adopcionesId;
	}

	public void setAdopcionesId(List<Long> adopcionesId) {
		this.adopcionesId = adopcionesId;
	}

	public List<Long> getCruzasId() {
		return cruzasId;
	}

	public void setCruzasId(List<Long> cruzasId) {
		this.cruzasId = cruzasId;
	}

	public double getMontoDescuento() {
		return montoDescuento;
	}

	public void setMontoDescuento(double montoDescuento) {
		this.montoDescuento = montoDescuento;
	}                                       
	
}                                           
                                            