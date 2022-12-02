package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.PersonalCargo;
import com.demo.itx.services.IServicePersonalCargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personalCargo")
@CrossOrigin("*")
public class RestPersonalCargo {

	@Autowired
	private IServicePersonalCargo service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public PersonalCargo crear(@RequestBody PersonalCargo personalCargo) {
		return service.crear(personalCargo);
	}

	@RequestMapping(value = "/{idPersonalCargo}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Optional<PersonalCargo> porId(@PathVariable Long idPersonalCargo) {
		return service.porId(idPersonalCargo);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<PersonalCargo> listar() {
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idPersonalCargo}", method = RequestMethod.PUT)
	@ResponseBody
	@CrossOrigin
	public PersonalCargo modificar(@PathVariable Long idPersonalCargo, @RequestBody PersonalCargo personalCargo) {
		return service.actualizar(personalCargo, idPersonalCargo);
	}

	@RequestMapping(value = "/eliminar/{idPersonalCargo}", method = RequestMethod.DELETE)
	@ResponseBody
	@CrossOrigin
	public boolean eliminar(@PathVariable Long idPersonalCargo) {
		return service.eliminar(idPersonalCargo);
	}

	@RequestMapping(value = "/listarPorEmpresa/{idEmpresa}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<PersonalCargo> listarPorEmpresa(@PathVariable Long idEmpresa) {
		return service.listarPorEmpresa(idEmpresa);
	}

	@RequestMapping(value = "/listarPorUsuario/{idUsuario}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<PersonalCargo> listarPorUsuario(@PathVariable Long idUsuario) {
		return service.listarPorUsuario(idUsuario);
	}

	@RequestMapping(value = "/listarPorEmpresaCargo/{idEmpresa}/{nombre}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<PersonalCargo> listarPorEmpresaCargo(@PathVariable Long idEmpresa, @PathVariable String nombre) {
		return service.listarPorEmpresaCargo(idEmpresa, nombre);
	}


}
