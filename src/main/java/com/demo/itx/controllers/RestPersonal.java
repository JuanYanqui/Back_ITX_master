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

import com.demo.itx.models.Personal;
import com.demo.itx.services.IServicePersonal;

@RestController
@RequestMapping("/personal")
@CrossOrigin("*")
public class RestPersonal {

	@Autowired
	private IServicePersonal service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Personal crear(@RequestBody Personal personal) {
		return service.crear(personal);
	}

	@RequestMapping(value = "/{idPersonal}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Personal> porId(@PathVariable Long idPersonal){
		return service.porId(idPersonal);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Personal> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idPersonal}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Personal modificar(@PathVariable Long idPersonal, @RequestBody Personal personal){
		return service.actualizar(personal, idPersonal);
	}

	@RequestMapping(value = "/eliminar/{idPersonal}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idPersonal) {
		return service.eliminar(idPersonal);
	}

}
