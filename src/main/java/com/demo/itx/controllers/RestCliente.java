package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cliente;
import com.demo.itx.services.IServiceCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class RestCliente {

	@Autowired
	private IServiceCliente service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Cliente crear(@RequestBody Cliente cliente) {
		return service.crear(cliente);
	}

	@RequestMapping(value = "/{idCliente}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Optional<Cliente> porId(@PathVariable Long idCliente) {
		return service.porId(idCliente);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<Cliente> listar() {
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idCliente}", method = RequestMethod.PUT)
	@ResponseBody
	@CrossOrigin
	public Cliente modificar(@PathVariable Long idCliente, @RequestBody Cliente cliente) {
		return service.actualizar(cliente, idCliente);
	}

	@RequestMapping(value = "/eliminar/{idCliente}", method = RequestMethod.DELETE)
	@ResponseBody
	@CrossOrigin
	public boolean eliminar(@PathVariable Long idCliente) {
		return service.eliminar(idCliente);
	}

	@RequestMapping(value = "/listarPorEmpresa/{idEmpresa}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<Cliente> listarPorEmpresa(@PathVariable Long idEmpresa) {
		return service.porIdEmpresa(idEmpresa);
	}

	@RequestMapping(value = "/listarPorUsuarioAndEmpresa/{idUsuario}/{idEmpresa}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Cliente listarPorEmpresaAndUsuario(@PathVariable Long idUsuario, @PathVariable Long idEmpresa) {
		return service.porUsuarioAndEmpresa(idUsuario, idEmpresa);
	}
}
