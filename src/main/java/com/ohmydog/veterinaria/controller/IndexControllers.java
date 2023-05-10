package com.ohmydog.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControllers {

	@GetMapping
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value="/admindex")
	public String getAdminPage() {
		return "Menú de admin...";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping(value="/modificar")
	public String getModificarMisDatosPage() {
		return "modificar";
	}
}
