package com.ohmydog.veterinaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.ohmydog.veterinaria.models.Cliente;
import com.ohmydog.veterinaria.repo.ClienteRepo;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepo clienteRepo;
	
	@GetMapping
	public List<Cliente> getClientes() {
		return clienteRepo.findAll();
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> logearUsuario(@RequestBody Cliente cliente) {
		try {
			ResponseEntity<String> invalido = new ResponseEntity<String>("El mail/contraseña es invalido.",HttpStatus.BAD_REQUEST);	
			Cliente clienteEncontrado = clienteRepo.findById(cliente.getMail()).orElse(null);
			boolean existe = clienteEncontrado != null;
			if(existe){
				boolean contraseñasIguales = clienteEncontrado.getContraseña().equals(cliente.getContraseña());
				if(contraseñasIguales) {
			    	RedirectView redirect = new RedirectView();
			    	redirect.setUrl("/index");
					return new ResponseEntity<RedirectView>(redirect,HttpStatus.ACCEPTED);
				}
			}
			return invalido;
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(value = "/registrar")
	public ResponseEntity<?> registrarCliente(@RequestBody Cliente cliente) {
		try {
				Cliente clienteGuardado = clienteRepo.save(cliente);
				return new ResponseEntity<Cliente>(clienteGuardado,HttpStatus.CREATED);
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
