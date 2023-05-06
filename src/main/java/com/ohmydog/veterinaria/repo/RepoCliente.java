package com.ohmydog.veterinaria.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ohmydog.veterinaria.models.Cliente;

public interface RepoCliente extends MongoRepository<Cliente, String> {
	public Cliente findByMail(String mail);
}
