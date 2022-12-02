package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cargo;
import com.demo.itx.services.IServiceCargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
@CrossOrigin("*")
public class RestCargo {

	@Autowired
	private IServiceCargo service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Cargo crear(@RequestBody Cargo cargo) {
		return service.crear(cargo);
	}

	@RequestMapping(value = "/{idCargo}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Optional<Cargo> porId(@PathVariable Long idCargo) {
		return service.porId(idCargo);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<Cargo> listar() {
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idCargo}", method = RequestMethod.PUT)
	@ResponseBody
	@CrossOrigin
	public Cargo modificar(@PathVariable Long idCargo, @RequestBody Cargo cargo) {
		return service.actualizar(cargo, idCargo);
	}

	@RequestMapping(value = "/eliminar/{idCargo}", method = RequestMethod.DELETE)
	@ResponseBody
	@CrossOrigin
	public boolean eliminar(@PathVariable Long idCargo) {
		return service.eliminar(idCargo);
	}
}
