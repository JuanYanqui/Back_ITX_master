package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Empresa;

public interface IDAOEmpresa {

	Empresa crear(Empresa empresa);

	Optional<Empresa> porId(Long idEmpresa);

	List<Empresa> listar();

	Empresa actualizar(Empresa empresa, Long idEmpresa);

	boolean eliminar(Long idEmpresa);

	Empresa porIdPersona(Long idPersona);

	boolean porRuc(String ruc);
}
