package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Perro;

public interface PerroRepo extends MongoRepository<Perro, Long> {
	public Perro findById (long id);
	
}
