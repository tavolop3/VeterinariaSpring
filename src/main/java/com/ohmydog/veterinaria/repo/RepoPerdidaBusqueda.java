package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.PerdidaBusqueda;

public interface RepoPerdidaBusqueda extends MongoRepository<PerdidaBusqueda, Long> {
	public PerdidaBusqueda findById (long id);
}
