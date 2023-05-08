package com.ohmydog.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohmydog.veterinaria.models.Usuario;
import com.ohmydog.veterinaria.repo.UsuarioRepo;

@RestController
@RequestMapping("/usuario")
public class ClienteController {
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	
//	@PostMapping(value = "/login")
//	public ResponseEntity<?> registrarUsuario(@RequestBody Usuario usuario) {
//		try {
//			if(usuarioRepo.existsById(usuario.getMail()))
//				//accede
//				Cliente usuario = usuarioRepo.findById(usuario.getMail())
//				if(usuario.getContraseña() == )
//				return null;
//			else
//				return new ResponseEntity<>("El mail/contraseña es invalido.",HttpStatus.BAD_REQUEST);	
//			
//		}catch (Exception e){
//			return new ResponseEntity<String>(e.getCause().toString(),
//												HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
}
