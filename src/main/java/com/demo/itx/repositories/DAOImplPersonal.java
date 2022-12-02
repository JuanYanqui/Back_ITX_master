package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplPersonal implements IDAOPersonal{

	@Autowired
	 IRepositoryPersonal repository;

	@Override
	public Personal crear(Personal personal) {

		return repository.save(personal);
	}

	@Override
	public Optional<Personal> porId(Long idPersonal) {

		return repository.findById(idPersonal);
	}

	@Override
	public List<Personal> listar() {

		return repository.findAll();
	}

	@Override
	public Personal actualizar(Personal personal, Long idPersonal) {

		if(repository.findById(idPersonal)!=null) {
			personal.setIdPersonal(idPersonal);
			return repository.save(personal);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idPersonal) {

		if(repository.findById(idPersonal)!=null) {
			repository.deleteById(idPersonal);
			return true;
		}else {
			return false;
		}
	}

}
