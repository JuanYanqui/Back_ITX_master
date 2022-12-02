package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.PersonalCargo;
import com.demo.itx.repositories.IDAOPersonalCargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplPersonalCargo implements IServicePersonalCargo{

	@Autowired
	private IDAOPersonalCargo dao;

	@Override
	public PersonalCargo crear(PersonalCargo personalCargo) {

		return dao.crear(personalCargo);
	}

	@Override
	public Optional<PersonalCargo> porId(Long idPersonalCargo) {

		return dao.porId(idPersonalCargo);
	}

	@Override
	public List<PersonalCargo> listar() {

		return dao.listar();
	}

	@Override
	public PersonalCargo actualizar(PersonalCargo personalCargo, Long idPersonalCargo) {

		return dao.actualizar(personalCargo, idPersonalCargo);
	}

	@Override
	public boolean eliminar(Long idPersonalCargo) {

		return dao.eliminar(idPersonalCargo);
	}

	@Override
	public List<PersonalCargo> listarPorEmpresa(Long idEmpresa) {

		return dao.listarPorEmpresa(idEmpresa);
	}

	@Override
	public List<PersonalCargo> listarPorUsuario(Long idUsuario) {

		return dao.listarPorUsuario(idUsuario);
	}

	@Override
	public List<PersonalCargo> listarPorEmpresaCargo(Long idEmpresa, String nombre) {

		return dao.listarPorEmpresaCargo(idEmpresa, nombre);
	}



}
