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

import com.demo.itx.models.Persona;
import com.demo.itx.services.IServicePersona;

@RestController
@RequestMapping("/persona")
@CrossOrigin("*")
public class RestPersona {

	@Autowired
	private IServicePersona service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Persona crear(@RequestBody Persona persona) {
		return service.crear(persona);
	}

	@RequestMapping(value = "/{idPersona}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Persona> porId(@PathVariable Long idPersona){
		return service.porId(idPersona);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Persona> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idPersona}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Persona modificar(@PathVariable Long idPersona, @RequestBody Persona persona){
		return service.actualizar(persona, idPersona);
	}

	@RequestMapping(value = "/eliminar/{idPersona}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idPersona) {
		return service.eliminar(idPersona);
	}

	@RequestMapping(value = "byCedula/{cedula}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Persona porCedula(@PathVariable String cedula){
		return service.porCedula(cedula);
	}
}
