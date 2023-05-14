package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Usuario;

public interface UsuarioRepo extends MongoRepository<Usuario, String> {
	public Usuario findByMail(String mail);
	public Usuario findByLogeado(boolean logeado);
	
}
