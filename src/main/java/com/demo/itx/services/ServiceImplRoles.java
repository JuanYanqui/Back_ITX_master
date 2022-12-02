package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Roles;
import com.demo.itx.repositories.IDAORoles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplRoles implements IServiceRoles{

	@Autowired
	private IDAORoles dao;

	@Override
	public Roles crear(Roles roles) {

		return dao.crear(roles);
	}

	@Override
	public Optional<Roles> porId(Long idRol) {

		return dao.porId(idRol);
	}

	@Override
	public List<Roles> listar() {

		return dao.listar();
	}

	@Override
	public Roles actualizar(Roles rol, Long idRol) {

		return dao.actualizar(rol, idRol);
	}

	@Override
	public boolean eliminar(Long idRol) {

		return dao.eliminar(idRol);
	}

	@Override
	public Roles porNombre(String nombre) {

		return dao.porNombre(nombre);
	}

}
