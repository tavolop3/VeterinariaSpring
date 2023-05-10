package com.ohmydog.veterinaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

	@GetMapping(value="/index")
	public String getIndexPage() {
		return "Index de usuario...";
	}
	
	@GetMapping(value="/admindex")
	public String getAdminPage() {
		return "Index de admin...";
	}
	
}
