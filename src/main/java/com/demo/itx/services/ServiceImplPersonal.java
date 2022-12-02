package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Personal;
import com.demo.itx.repositories.IDAOPersonal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplPersonal implements IServicePersonal{

	@Autowired
	private IDAOPersonal dao;

	@Override
	public Personal crear(Personal personal) {

		return dao.crear(personal);
	}

	@Override
	public Optional<Personal> porId(Long idPersonal) {

		return dao.porId(idPersonal);
	}

	@Override
	public List<Personal> listar() {

		return dao.listar();
	}

	@Override
	public Personal actualizar(Personal personal, Long idPersonal) {

		return dao.actualizar(personal, idPersonal);
	}

	@Override
	public boolean eliminar(Long idPersonal) {

		return dao.eliminar(idPersonal);
	}

}
