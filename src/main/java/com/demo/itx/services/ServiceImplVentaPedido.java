package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.itx.models.VentaPedido;
import com.demo.itx.repositories.IDAOVentaPedido;

@Service
public class ServiceImplVentaPedido implements IServiceVentaPedido{

	@Autowired
	private IDAOVentaPedido dao;
	
	@Override
	public VentaPedido crear(VentaPedido ventaPedido) {
		// TODO Auto-generated method stub
		return dao.crear(ventaPedido);
	}

	@Override
	public Optional<VentaPedido> porId(Long idVentaPedido) {
		// TODO Auto-generated method stub
		return dao.porId(idVentaPedido);
	}

	@Override
	public List<VentaPedido> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public VentaPedido actualizar(VentaPedido ventaPedido, Long idVentaPedido) {
		// TODO Auto-generated method stub
		return dao.actualizar(ventaPedido, idVentaPedido);
	}

	@Override
	public boolean eliminar(Long idVentaPedido) {
		// TODO Auto-generated method stub
		return dao.eliminar(idVentaPedido);
	}

	@Override
	public VentaPedido porPedido(Long idPedido) {
		// TODO Auto-generated method stub
		return dao.porPedido(idPedido);
	}

	@Override
	public List<VentaPedido> porEmpresa(Long idEmpresa, boolean isOnline) {
		// TODO Auto-generated method stub
		return dao.porEmpresa(idEmpresa, isOnline);
	}

}
