package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Adopcion;

public interface AdopcionRepo extends MongoRepository<Adopcion, Long> {
	public Adopcion findById(long id);
	
}
