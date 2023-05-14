package com.ohmydog.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControllers {

	@GetMapping(value="/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value="/admin")
	public String getAdminPage() {
		return "indexAdmin";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping(value="/modificar")
	public String getModificarMisDatosPage() {
		return "modificar";
	}
	
	@GetMapping(value="/cliente")
	public String getClienteHome() {
		return "indexCliente";
	}
}
