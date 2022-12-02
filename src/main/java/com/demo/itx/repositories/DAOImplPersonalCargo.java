package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.PersonalCargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplPersonalCargo implements IDAOPersonalCargo{

	@Autowired
	IRepositoryPersonalCargo repository;

	@Override
	public PersonalCargo crear(PersonalCargo personalCargo) {

		return repository.save(personalCargo);
	}

	@Override
	public Optional<PersonalCargo> porId(Long idPersonalCargo) {

		return repository.findById(idPersonalCargo);
	}

	@Override
	public List<PersonalCargo> listar() {

		return repository.findAll();
	}

	@Override
	public PersonalCargo actualizar(PersonalCargo personalCargo, Long idPersonalCargo) {

		if (repository.findById(idPersonalCargo)!=null) {
			personalCargo.setIdPersonalCargo(idPersonalCargo);
			return repository.save(personalCargo);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idPersonalCargo) {

		if (repository.findById(idPersonalCargo)!=null) {
			repository.deleteById(idPersonalCargo);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<PersonalCargo> listarPorEmpresa(Long idEmpresa) {

		return repository.findByPersonalUsuarioEmpresaIdEmpresa(idEmpresa);
	}

	@Override
	public List<PersonalCargo> listarPorUsuario(Long idUsuario) {

		return repository.findByPersonalUsuarioIdUsuario(idUsuario);
	}

	@Override
	public List<PersonalCargo> listarPorEmpresaCargo(Long idEmpresa, String nombre) {

		return repository.findByPersonalUsuarioEmpresaIdEmpresaAndCargoNombre(idEmpresa, nombre);
	}

}
