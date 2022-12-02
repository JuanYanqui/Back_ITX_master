package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.ItemPedido;
import com.demo.itx.repositories.IDAOItemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplItemPedido implements IServiceItemPedido{

	@Autowired
	private IDAOItemPedido dao;

	@Override
	public ItemPedido crear(ItemPedido itemPedido) {

		return dao.crear(itemPedido);
	}

	@Override
	public Optional<ItemPedido> porId(Long idItemPedido) {

		return dao.porId(idItemPedido);
	}

	@Override
	public List<ItemPedido> listar() {

		return dao.listar();
	}

	@Override
	public ItemPedido actualizar(ItemPedido itemPedido, Long idItemPedido) {

		return dao.actualizar(itemPedido, idItemPedido);
	}

	@Override
	public boolean eliminar(Long idItemPedido) {

		return dao.eliminar(idItemPedido);
	}

	@Override
	public List<ItemPedido> porPedido(Long idPedido) {

		return dao.porPedido(idPedido);
	}

}
