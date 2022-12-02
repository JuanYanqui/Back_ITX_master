package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplPersona implements IDAOPersona{

	@Autowired
	private IRepositoryPersona repository;

	@Override
	public Persona crear(Persona persona) {

		return repository.save(persona);
	}

	@Override
	public Optional<Persona> porId(Long idPersona) {

		return repository.findById(idPersona);
	}

	@Override
	public List<Persona> listar() {

		return repository.findAll();
	}

	@Override
	public Persona actualizar(Persona persona, Long idPersona) {

		if(repository.findById(idPersona)!=null) {
			persona.setIdPersona(idPersona);
			return repository.save(persona);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idPersona) {

		if(repository.findById(idPersona)!=null) {
			repository.deleteById(idPersona);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Persona porCedula(String cedula) {

		return repository.findByCedula(cedula);
	}

}
