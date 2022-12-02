package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cliente;
import com.demo.itx.repositories.IDAOCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplCliente implements IServiceCliente{

	@Autowired
	private IDAOCliente dao;

	@Override
	public Cliente crear(Cliente cliente) {

		return dao.crear(cliente);
	}

	@Override
	public Optional<Cliente> porId(Long idCliente) {

		return dao.porId(idCliente);
	}

	@Override
	public List<Cliente> listar() {

		return dao.listar();
	}

	@Override
	public Cliente actualizar(Cliente cliente, Long idCliente) {

		return dao.actualizar(cliente, idCliente);
	}

	@Override
	public boolean eliminar(Long idCliente) {

		return dao.eliminar(idCliente);
	}

	@Override
	public List<Cliente> porIdEmpresa(Long idEmpresa) {

		return dao.porIdEmpresa(idEmpresa);
	}

	@Override
	public Cliente porUsuarioAndEmpresa(Long idUsuario, Long idEmpresa) {

		return dao.porUsuarioAndEmpresa(idUsuario, idEmpresa);
	}

}
