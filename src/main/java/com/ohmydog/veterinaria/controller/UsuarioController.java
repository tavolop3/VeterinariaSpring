package com.ohmydog.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohmydog.veterinaria.models.Usuario;
import com.ohmydog.veterinaria.repo.UsuarioRepo;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuarioRepo.findAll();
	}

	@PostMapping(value = "/registro")
	public ResponseEntity<?> registrarUsuario(@RequestBody Usuario usuario) {
		try {
			Usuario usuarioGuardado = usuarioRepo.save(usuario);
			return new ResponseEntity<Usuario>(usuarioGuardado,HttpStatus.CREATED);	
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
