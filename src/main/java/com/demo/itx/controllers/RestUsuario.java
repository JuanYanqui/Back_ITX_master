package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.itx.models.Usuario;
import com.demo.itx.services.IServiceUsuario;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class RestUsuario {

	@Autowired
	private IServiceUsuario service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Usuario crear(@RequestBody Usuario usuario) {
		return service.crear(usuario);
	}

	@RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Usuario> porId(@PathVariable Long idUsuario){
		return service.porId(idUsuario);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Usuario> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idUsuario}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Usuario modificar(@PathVariable Long idUsuario, @RequestBody Usuario usuario){
		return service.actualizar(usuario, idUsuario);
	}

	@RequestMapping(value = "/eliminar/{idUsuario}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idUsuario) {
		return service.eliminar(idUsuario);
	}

	@RequestMapping(value = "login/{username}/{password}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Usuario login(@PathVariable String username, @PathVariable String password){
		return service.login(username, password);
	}


	@RequestMapping(value = "porUsername/{username}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public boolean porUsername(@PathVariable String username){
		return service.porUsername(username);
	}

}
