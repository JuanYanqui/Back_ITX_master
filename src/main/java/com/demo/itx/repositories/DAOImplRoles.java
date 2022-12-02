package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplRoles implements IDAORoles{

	@Autowired
	private IRepositoryRoles repository;

	@Override
	public Roles crear(Roles roles) {

		return repository.save(roles);
	}

	@Override
	public Optional<Roles> porId(Long idRol) {

		return repository.findById(idRol);
	}

	@Override
	public List<Roles> listar() {

		return repository.findAll();
	}

	@Override
	public Roles actualizar(Roles roles, Long idRol) {

		if (repository.findById(idRol)!=null) {
			roles.setIdRol(idRol);
			return repository.save(roles);
		}else {
			return null;
		}

	}

	@Override
	public boolean eliminar(Long idRol) {

		if (repository.findById(idRol)!=null) {
			repository.deleteById(idRol);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Roles porNombre(String nombre) {

		return repository.findByNombre(nombre);
	}


}
