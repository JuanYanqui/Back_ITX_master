package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.ItemPedido;
import com.demo.itx.services.IServiceItemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itempedido")
@CrossOrigin("*")
public class RestItemPedido {

	@Autowired
	private IServiceItemPedido service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
	public ItemPedido crear(@RequestBody ItemPedido itemPedido) {
		return service.crear(itemPedido);
	}

	@RequestMapping(value = "/{idItemPedido}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public Optional<ItemPedido> porId(@PathVariable Long idItemPedido){
		return service.porId(idItemPedido);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<ItemPedido> listar(){
		return service.listar();
	}

	@RequestMapping(value = "/actualizar/{idItemPedido}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
	public ItemPedido modificar(@PathVariable Long idItemPedido, @RequestBody ItemPedido itemPedido){
		return service.actualizar(itemPedido, idItemPedido);
	}

	@RequestMapping(value = "/eliminar/{idItemPedido}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
	public boolean eliminar(@PathVariable Long idItemPedido) {
		return service.eliminar(idItemPedido);
	}

	@RequestMapping(value = "/listarpedido/{idPedido}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
	public List<ItemPedido> listarPedido(@PathVariable Long idPedido){
		return service.porPedido(idPedido);
	}

}
