package com.ohmydog.veterinaria.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Perro;

public interface PerroRepo extends MongoRepository<Perro, ObjectId> {
	public Perro findById (long id);
	
}
