package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplPedido implements IDAOPedido{

	@Autowired
	private IRepositoryPedido repository;

	@Override
 	public Pedido crear(Pedido pedido) {

		return repository.save(pedido);
	}

	@Override
	public Optional<Pedido> porId(Long idPedido) {

		return repository.findById(idPedido);
	}

	@Override
	public List<Pedido> listar() {

		return repository.findAll();
	}

	@Override
	public Pedido actualizar(Pedido pedido, Long idPedido) {

		if(repository.findById(idPedido)!=null) {
			pedido.setIdPedido(idPedido);
			return repository.save(pedido);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idPedido) {

		if (repository.findById(idPedido)!=null) {
			repository.deleteById(idPedido);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Pedido> listarPorEmpresa(Long idEmpresa) {

		return repository.findByClienteUsuarioEmpresaIdEmpresa(idEmpresa);
	}

	@Override
	public List<Pedido> listarPorCliente(Long idCliente) {

		return repository.findByClienteIdCliente(idCliente);
	}
}
