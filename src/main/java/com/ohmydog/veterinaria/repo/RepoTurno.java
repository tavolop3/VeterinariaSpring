package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Turno;

public interface RepoTurno extends MongoRepository<Turno, Long> {
	public Turno findById (long id);
}
