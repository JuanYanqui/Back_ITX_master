package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cargo;
import com.demo.itx.repositories.IDAOCargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplCargo implements IServiceCargo{

	@Autowired
	private IDAOCargo dao;

	@Override
	public Cargo crear(Cargo cargo) {

		return dao.crear(cargo);
	}

	@Override
	public Optional<Cargo> porId(Long idCargo) {

		return dao.porId(idCargo);
	}

	@Override
	public List<Cargo> listar() {

		return dao.listar();
	}

	@Override
	public Cargo actualizar(Cargo cargo, Long idCargo) {

		return dao.actualizar(cargo, idCargo);
	}

	@Override
	public boolean eliminar(Long idCargo) {

		return dao.eliminar(idCargo);
	}

}
