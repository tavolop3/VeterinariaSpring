package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Cruza;

public interface RepoCruza extends MongoRepository<Cruza, Long> {
	public Cruza findById (long id);
}
