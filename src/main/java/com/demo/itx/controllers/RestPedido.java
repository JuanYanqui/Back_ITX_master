package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Pedido;
import com.demo.itx.services.IServicePedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@CrossOrigin("*")
public class RestPedido {

	@Autowired
	private IServicePedido service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public Pedido crear(@RequestBody Pedido pedido) {
		return service.crear(pedido);
	}

	@RequestMapping(value = "/{idPedido}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<Pedido> porId(@PathVariable Long idPedido){
		return service.porId(idPedido);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Pedido> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idPedido}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public Pedido modificar(@PathVariable Long idPedido, @RequestBody Pedido pedido){
		return service.actualizar(pedido, idPedido);
	}

	@RequestMapping(value = "/eliminar/{idPedido}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idPedido) {
		return service.eliminar(idPedido);
	}
	
	@RequestMapping(value = "/listarporempresa/{idEmpresa}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Pedido> listarPorEmpresa(@PathVariable Long idEmpresa){
		return service.listarPorEmpresa(idEmpresa);
	}
	
	@RequestMapping(value = "/listarporcliente/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<Pedido> listarPorCliente(@PathVariable Long idCliente){
		return service.listarPorCliente(idCliente);
	}
}
