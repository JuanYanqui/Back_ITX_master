package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Empresa;
import com.demo.itx.repositories.IDAOEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplEmpresa implements IServiceEmpresa{

	@Autowired
	private IDAOEmpresa dao;

	@Override
	public Empresa crear(Empresa empresa) {

		return dao.crear(empresa);
	}

	@Override
	public Optional<Empresa> porId(Long idEmpresa) {

		return dao.porId(idEmpresa);
	}

	@Override
	public List<Empresa> listar() {

		return dao.listar();
	}

	@Override
	public Empresa actualizar(Empresa empresa, Long idEmpresa) {

		return dao.actualizar(empresa, idEmpresa);
	}

	@Override
	public boolean eliminar(Long idEmpresa) {

		return dao.eliminar(idEmpresa);
	}

	@Override
	public Empresa porIdPersona(Long idPersona) {

		return dao.porIdPersona(idPersona);
	}

	@Override
	public boolean porRuc(String ruc) {

		return dao.porRuc(ruc);
	}


}
