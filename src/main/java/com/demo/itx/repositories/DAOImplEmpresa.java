package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplEmpresa implements IDAOEmpresa{

	@Autowired
	private IRepositoryEmpresa repository;

	@Override
	public Empresa crear(Empresa empresa) {

		return repository.save(empresa);
	}

	@Override
	public Optional<Empresa> porId(Long idEmpresa) {

		return repository.findById(idEmpresa);
	}

	@Override
	public List<Empresa> listar() {

		return repository.findAll();
	}

	@Override
	public Empresa actualizar(Empresa empresa, Long idEmpresa) {

		if (repository.findById(idEmpresa)!=null) {
			empresa.setIdEmpresa(idEmpresa);
			return repository.save(empresa);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idEmpresa) {

		if(repository.findById(idEmpresa)!=null) {
			repository.deleteById(idEmpresa);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Empresa porIdPersona(Long idPersona) {

		return repository.findByPersonaIdPersona(idPersona);
	}

	@Override
	public boolean porRuc(String ruc) {

		if (repository.findByRuc(ruc)!=null) {
			return true;
		}else {
			return false;
		}

	}

}
