package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.PuntoUrgencia;

public interface RepoPuntoUrgencia extends MongoRepository<PuntoUrgencia, String> {
	public PuntoUrgencia findByDireccion (String direccion);
	
}
