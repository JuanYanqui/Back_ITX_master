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

import com.demo.itx.models.Empresa;
import com.demo.itx.services.IServiceEmpresa;

@RestController
@RequestMapping("/empresa")
public class RestEmpresa {

	@Autowired
	private IServiceEmpresa service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Empresa crear(@RequestBody Empresa empresa) {
		return service.crear(empresa);
	}

	@RequestMapping(value = "/{idEmpresa}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Empresa> porId(@PathVariable Long idEmpresa){
		return service.porId(idEmpresa);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Empresa> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idEmpresa}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Empresa modificar(@PathVariable Long idEmpresa, @RequestBody Empresa empresa){
		return service.actualizar(empresa, idEmpresa);
	}

	@RequestMapping(value = "/eliminar/{idEmpresa}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idEmpresa) {
		return service.eliminar(idEmpresa);
	}

	@RequestMapping(value = "/porPersona/{idPersona}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Empresa porIdPersona(@PathVariable Long idPersona){
		return service.porIdPersona(idPersona);
	}

	@RequestMapping(value = "porRuc/{ruc}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public boolean porRuc(@PathVariable String ruc){
		return service.porRuc(ruc);
	}
}
