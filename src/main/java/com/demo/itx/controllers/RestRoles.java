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

import com.demo.itx.models.Roles;
import com.demo.itx.services.IServiceRoles;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RestRoles {

	@Autowired
	private IServiceRoles service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Roles crear(@RequestBody Roles rol) {
		return service.crear(rol);
	}

	@RequestMapping(value = "/{idRol}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Roles> porId(@PathVariable Long idRol){
		return service.porId(idRol);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Roles> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idRol}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Roles modificar(@PathVariable Long idRol, @RequestBody Roles rol){
		return service.actualizar(rol, idRol);
	}

	@RequestMapping(value = "/eliminar/{idRol}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idRol) {
		return service.eliminar(idRol);
	}

	@RequestMapping(value = "byName/{nombre}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Roles porNombre(@PathVariable String nombre){
		return service.porNombre(nombre);
	}

}
