package com.ohmydog.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.ohmydog.veterinaria.controller.UsuarioController;

@SpringBootApplication
public class ProyectoVeterinariaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoVeterinariaApplication.class, args);
	}
}
