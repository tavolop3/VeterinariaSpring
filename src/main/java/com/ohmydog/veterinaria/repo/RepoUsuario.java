package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Usuario;

public interface RepoUsuario extends MongoRepository<Usuario, String> {
	public Usuario findByNombre(String nombre);
}
