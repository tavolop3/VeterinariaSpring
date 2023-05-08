package com.ohmydog.veterinaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

	@GetMapping(value="/index")
	public String getPage() {
		return "OH MY DOG...";
	}
	
}
