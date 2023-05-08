package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Turno;

public interface TurnoRepo extends MongoRepository<Turno, Long> {
	public Turno findById (long id);
}
