package com.ohmydog.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohmydog.veterinaria.models.Perro;
import com.ohmydog.veterinaria.models.Usuario;
import com.ohmydog.veterinaria.repo.PerroRepo;
import com.ohmydog.veterinaria.repo.UsuarioRepo;

@Controller
@RequestMapping("/admin")
public class UsuarioAdminController {
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@GetMapping(value="/registrar/usuario")
	public String getRegUsr() {
		return "registro";
	}
	
	@PostMapping(value = "/registrar/usuario")
	public ResponseEntity<?> registrarUsuario(Model model,@ModelAttribute Usuario usuario) {
		try {
				if(usuarioRepo.existsById(usuario.getMail()))
					return new ResponseEntity<String>("El usuario ya existe.",HttpStatus.BAD_REQUEST);
				
				// TODO encriptar pass
				// TODO enviar mail con contraseña generica
				System.out.println(model);
				usuario.setContraseña("1234");
				Usuario usuarioGuardado = usuarioRepo.save(usuario);

				return new ResponseEntity<Usuario>(usuarioGuardado,HttpStatus.CREATED);
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Autowired
	private PerroRepo perroRepo;
	//para testear el objectid
	@PostMapping(value = "/registrar/perro")
	public ResponseEntity<?> registrarUsuario(@RequestBody Perro perro) {
		try {
				Perro perroGuardado = perroRepo.save(perro);

				return new ResponseEntity<Perro>(perroGuardado,HttpStatus.CREATED);
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
