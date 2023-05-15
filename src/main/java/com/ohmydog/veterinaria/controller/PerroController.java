/*import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;

import com.ohmydog.veterinaria.models.Usuario;

package com.ohmydog.veterinaria.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ohmydog.veterinaria.models.Perro;
import com.ohmydog.veterinaria.models.Usuario;
import com.ohmydog.veterinaria.repo.PerroRepo;
import com.ohmydog.veterinaria.repo.UsuarioRepo;

public class PerroController {
	
	@Autowired	
	private PerroRepo perroRepo;
	
	@PostMapping(value = "/all/perro")
	public List<Perro> getAll(){
		return perroRepo.findAll();
	}
	
	@PostMapping(value = "/registrar/perro")
	public ResponseEntity<?> registrarPerro(@RequestBody Perro perro) {
		try {
			if(perroRepo.existsById(perro.getId()))
					return new ResponseEntity<String>("El perro ya existe.",HttpStatus.BAD_REQUEST);
				
				Usuario usuarioGuardado = usuarioRepo.save(usuario);

				return new ResponseEntity<Usuario>(usuarioGuardado,HttpStatus.CREATED);
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}*/


