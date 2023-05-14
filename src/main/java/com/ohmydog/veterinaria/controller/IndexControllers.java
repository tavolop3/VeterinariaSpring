package com.ohmydog.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ohmydog.veterinaria.models.Usuario;

@Controller
public class IndexControllers {

	@GetMapping(value="/")
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
	
	@GetMapping(value="/modificar/usuario")
	public ModelAndView getModificarUsuario(Usuario usuario) {
		ModelAndView modelo = new ModelAndView("modificar-usuario");
		modelo.addObject("usuario", usuario);
		return modelo;
	}
	
}
