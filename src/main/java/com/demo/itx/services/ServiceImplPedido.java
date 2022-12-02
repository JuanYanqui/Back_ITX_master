package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Pedido;
import com.demo.itx.repositories.IDAOPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplPedido implements IServicePedido{

	@Autowired
	private IDAOPedido dao;

	@Override
	public Pedido crear(Pedido pedido) {

		return dao.crear(pedido);
	}

	@Override
	public Optional<Pedido> porId(Long idPedido) {

		return dao.porId(idPedido);
	}

	@Override
	public List<Pedido> listar() {

		return dao.listar();
	}

	@Override
	public Pedido actualizar(Pedido pedido, Long idPedido) {

		return dao.actualizar(pedido, idPedido);
	}

	@Override
	public boolean eliminar(Long idPedido) {

		return dao.eliminar(idPedido);
	}


	@Override
	public List<Pedido> listarPorEmpresa(Long idEmpresa) {

		return dao.listarPorEmpresa(idEmpresa);
	}

	@Override
	public List<Pedido> listarPorCliente(Long idCliente) {

		return dao.listarPorCliente(idCliente);
	}

}
