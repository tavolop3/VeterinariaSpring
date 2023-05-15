package com.ohmydog.veterinaria.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.ohmydog.veterinaria.models.Perro;
import com.ohmydog.veterinaria.models.Usuario;
import com.ohmydog.veterinaria.repo.PerroRepo;
import com.ohmydog.veterinaria.repo.UsuarioRepo;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@Autowired
	private PerroRepo perroRepo;
	
	@GetMapping
	public String getUsuarios(Model model) {
		List<Usuario> usuarios = usuarioRepo.findAll();
		model.addAttribute("usuarios", usuarios);
		return "listaUsuarios";
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> logearUsuario(@ModelAttribute Usuario usuario) {
		this.inicializarLogueados();
		try {
			Usuario usuarioEncontrado = usuarioRepo.findById(usuario.getMail()).orElse(null);

			boolean existe = usuarioEncontrado != null;
			if(existe){
				// TODO desencriptar las 2 pass y compararlas
				boolean contraseñasIguales = usuarioEncontrado.getContraseña().equals(usuario.getContraseña());
				if(contraseñasIguales) {
					usuarioEncontrado.setLogeado(true);
					usuarioRepo.save(usuarioEncontrado);
					
					URI uri;
				    HttpHeaders headers = new HttpHeaders();


				    String redirectPath;
				    

					if(usuarioEncontrado.isEsAdmin()) {
						redirectPath = "/admin";
					}else
						redirectPath = "/cliente";
					
					//si el usuario tiene la pass generica pide que la cambies
					if(usuarioEncontrado.getContraseña().equals("1234")) {
						//habria que mostrarle el mensaje de cambiar la pass en mod html
						redirectPath = "/usuarios/modificar?primerIngreso";
					}
					
					uri = URI.create(redirectPath);
					headers.setLocation(uri);					
					return new ResponseEntity<>(headers, HttpStatus.FOUND);

				}
			}
			return new ResponseEntity<String>("El mail/contraseña es invalido.",HttpStatus.BAD_REQUEST);
		}catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),
												HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/* El metodo permite a un usuario determinado 
	 * modificar su mail y contraseña
	 */
	@PostMapping(value = "/modificar")
	public ResponseEntity<?> modificarMisDatos (@RequestParam("mail1") String mail1, 
			@RequestParam("mail2") String mail2, @RequestParam("contraseña1") String contraseña1,
			@RequestParam("contraseña2") String contraseña2) {
		try {
			Usuario aModificar = usuarioRepo.findById(mail1).orElse(null);
			if (aModificar != null) {
				if (contraseña1 == aModificar.getContraseña()) {
					if (mail2 != "") {
						aModificar.setMail(mail2);
					}
					if (contraseña2 != "") {
						aModificar.setContraseña(contraseña2);
					}
					usuarioRepo.save(aModificar);
					RedirectView redirect = new RedirectView();
					redirect.setUrl("/");
					return new ResponseEntity<RedirectView>(redirect, HttpStatus.ACCEPTED);
				}
				else {
					return new ResponseEntity<String>("La contraseña no coincide:", HttpStatus.SEE_OTHER);
				}
			}
			else {
				return new ResponseEntity<String>("No se encontro el usuario a modificar", HttpStatus.SEE_OTHER);
			}
		} catch (Exception e) {
			// informa que hubo problemas con la base de datos
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/quiensoy")
	public ResponseEntity<Usuario> quienSoy() {
		return new ResponseEntity<Usuario>(usuarioLogueado(), HttpStatus.ACCEPTED)  ;
	}
	
	public Usuario usuarioLogueado() {
		return usuarioRepo.findByLogeado(true);
	}
		
	//para cada vez que el usuario inicia sesion eliminar inicios previos que 
	//no cerraron sesion
	public void inicializarLogueados() {
		List<Usuario> usuarios = usuarioRepo.findAll();
		usuarios.forEach(u -> u.setLogeado(false));
		usuarioRepo.saveAll(usuarios);
	}
	
	//para listar los perros del usuario en el listar perros como admin
	public List<Perro> listarPerros(Usuario usuario) {
		if(usuario.getPerrosId() == null)
			return new ArrayList<Perro>();
			
		return usuario.getPerrosId().stream()
					.map(p -> perroRepo.findById(p).orElse(null)).toList();
		
	}
	
	public List<Perro> listarMisPerros(){
		return listarPerros(usuarioLogueado());
	}
	
	@GetMapping(value="/perros")
	public String getPerros(Model model) {
		List<Perro> perros = listarMisPerros();
		model.addAttribute("perros", perros);
		return "listaPerros";
	}
	/* El metodo permite
	 * al administrador modificar los datos
	 * de un usuario
	 */
	@PostMapping(value = "/modificar/usuario")
	public ResponseEntity<?> modificarUsuario (@RequestParam("mailDelUsuario") String mailDelUsuario,
			@RequestParam("mail") String mail,
			@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("dni") String dni,
			@RequestParam("telefono") String telefono) {
		try {
			Usuario aModificar = usuarioRepo.findById(mailDelUsuario).orElse(null);
			if (aModificar != null) {
				aModificar.setMail(mail);
				aModificar.setNombre(nombre);
				aModificar.setApellido(apellido);
				aModificar.setDni(dni);
				aModificar.setTelefono(telefono);
				// deberia retornar a la pagina donde lista los usuarios
				return new ResponseEntity<String>("/", HttpStatus.ACCEPTED);
			}
			else {
				return new ResponseEntity<String>("No se encontro el usuario a modificar", HttpStatus.SEE_OTHER);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
