package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.itx.models.VentaPedido;

@Repository
public class DAOImplVentaPedido implements IDAOVentaPedido{

	@Autowired
	private IRepositoryVentaPedido repository;
	
	@Override
	public VentaPedido crear(VentaPedido ventaPedido) {
		// TODO Auto-generated method stub
		return repository.save(ventaPedido);
	}

	@Override
	public Optional<VentaPedido> porId(Long idVentaPedido) {
		// TODO Auto-generated method stub
		return repository.findById(idVentaPedido);
	}

	@Override
	public List<VentaPedido> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public VentaPedido actualizar(VentaPedido ventaPedido, Long idVentaPedido) {
		// TODO Auto-generated method stub
		if (repository.findById(idVentaPedido)!=null) {
			ventaPedido.setIdVentaPedido(idVentaPedido);
			return repository.save(ventaPedido);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idVentaPedido) {
		// TODO Auto-generated method stub
		if (repository.findById(idVentaPedido)!=null) {
			repository.deleteById(idVentaPedido);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public VentaPedido porPedido(Long idPedido) {
		// TODO Auto-generated method stub
		return repository.findByPedidoIdPedido(idPedido);
	}

	@Override
	public List<VentaPedido> porEmpresa(Long idEmpresa, boolean isOnline) {
		// TODO Auto-generated method stub
		return repository.findByEmpresaIdEmpresaAndIsOnline(idEmpresa, isOnline);
	}

}
