package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Administrador;

public interface RepoAdministrador extends MongoRepository<Administrador, String> {
	public Administrador findByNombre(String mail);
}
