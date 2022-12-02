package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplCargo implements IDAOCargo{

	@Autowired
	IRepositoryCargo repository;

	@Override
	public Cargo crear(Cargo cargo) {

		return repository.save(cargo);
	}

	@Override
	public Optional<Cargo> porId(Long idCargo) {

		return repository.findById(idCargo);
	}

	@Override
	public List<Cargo> listar() {

		return repository.findAll();
	}

	@Override
	public Cargo actualizar(Cargo cargo, Long idCargo) {

		if (repository.findById(idCargo)!=null) {
			cargo.setIdCargo(idCargo);
			return repository.save(cargo);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idCargo) {

		if (repository.findById(idCargo)!=null) {
			repository.deleteById(idCargo);
			return true;
		}else {
			return false;
		}
	}


}
