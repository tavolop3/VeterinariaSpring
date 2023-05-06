package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Donacion;

public interface RepoDonacion extends MongoRepository<Donacion, String> {
	public Donacion findByNombre(String nombre);
	
}
