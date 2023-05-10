package com.ohmydog.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexControllers {

	@GetMapping
	public String index() {
//		return "Index de usuario...";
		return "index";
	}
	
	@GetMapping(value="/admindex")
	public String getAdminPage() {
		return "Menú de admin...";
	}
	
}
