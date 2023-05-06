package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.PaseadorCuidador;

public interface RepoPaseadorCuidador extends MongoRepository<PaseadorCuidador, Long> {
	public PaseadorCuidador findById (long id);
	
}
