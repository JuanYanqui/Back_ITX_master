package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Persona;
import com.demo.itx.repositories.IDAOPersona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplPersona implements IServicePersona{

	@Autowired
	private IDAOPersona dao;

	@Override
	public Persona crear(Persona persona) {

		return dao.crear(persona);
	}

	@Override
	public Optional<Persona> porId(Long idPersona) {

		return dao.porId(idPersona);
	}

	@Override
	public List<Persona> listar() {

		return dao.listar();
	}

	@Override
	public Persona actualizar(Persona persona, Long idPersona) {

		return dao.actualizar(persona, idPersona);
	}

	@Override
	public boolean eliminar(Long idPersona) {

		return dao.eliminar(idPersona);
	}

	@Override
	public Persona porCedula(String cedula) {

		return dao.porCedula(cedula);
	}

}
