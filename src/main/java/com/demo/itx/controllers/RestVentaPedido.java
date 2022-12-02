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

import com.demo.itx.models.VentaPedido;
import com.demo.itx.services.IServiceVentaPedido;

@RestController
@RequestMapping("/ventapedido")
@CrossOrigin("*")
public class RestVentaPedido {
	
	@Autowired
	private IServiceVentaPedido service;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public VentaPedido crear(@RequestBody VentaPedido ventaPedido) {
		return service.crear(ventaPedido);
	}

	@RequestMapping(value = "/{idVentaPedido}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<VentaPedido> porId(@PathVariable Long idVentaPedido){
		return service.porId(idVentaPedido);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<VentaPedido> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idVentaPedido}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public VentaPedido modificar(@PathVariable Long idVentaPedido, @RequestBody VentaPedido ventaPedido){
		return service.actualizar(ventaPedido, idVentaPedido);
	}

	@RequestMapping(value = "/eliminar/{idVentaPedido}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idVentaPedido) {
		return service.eliminar(idVentaPedido);
	}
	
	@RequestMapping(value = "/porpedido/{idPedido}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public VentaPedido porPedido(@PathVariable Long idPedido){
		return service.porPedido(idPedido);
	}
	
	@RequestMapping(value = "/listarporempresa/{idEmpresa}/{isOnline}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<VentaPedido> listarPorEmpresa(@PathVariable Long idEmpresa, @PathVariable boolean isOnline){
		return service.porEmpresa(idEmpresa, isOnline);
	}

}
