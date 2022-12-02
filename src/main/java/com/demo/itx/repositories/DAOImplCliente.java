package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplCliente implements IDAOCliente{

	@Autowired
	IRepositoryCliente repository;

	@Override
	public Cliente crear(Cliente cliente) {

		return repository.save(cliente);
	}

	@Override
	public Optional<Cliente> porId(Long idCliente) {

		return repository.findById(idCliente);
	}

	@Override
	public List<Cliente> listar() {

		return repository.findAll();
	}

	@Override
	public Cliente actualizar(Cliente cliente, Long idCliente) {

		if(repository.findById(idCliente)!=null) {
			cliente.setIdCliente(idCliente);
			return repository.save(cliente);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idCliente) {

		if(repository.findById(idCliente)!=null) {
			repository.deleteById(idCliente);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Cliente> porIdEmpresa(Long idEmpresa) {

		return repository.findByUsuarioEmpresaIdEmpresa(idEmpresa);
	}

	@Override
	public Cliente porUsuarioAndEmpresa(Long idUsuario, Long idEmpresa) {

		return repository.findByUsuarioIdUsuarioAndUsuarioEmpresaIdEmpresa(idUsuario, idEmpresa);
	}

}
