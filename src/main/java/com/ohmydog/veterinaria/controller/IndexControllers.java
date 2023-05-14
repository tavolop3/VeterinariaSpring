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
	@GetMapping(value="/modificar/usuario")
	public ModelAndView getModificarUsuario(Usuario usuario) {
		ModelAndView modelo = new ModelAndView("modificar-usuario");
		modelo.addObject("usuario", usuario);
		return modelo;
	}
	
}
