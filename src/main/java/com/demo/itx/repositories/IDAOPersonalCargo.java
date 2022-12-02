package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.PersonalCargo;

public interface IDAOPersonalCargo {
	PersonalCargo crear(PersonalCargo personalCargo);

	Optional<PersonalCargo> porId(Long idPersonalCargo);

	List<PersonalCargo> listar();

	PersonalCargo actualizar(PersonalCargo personalCargo, Long idPersonalCargo);

	boolean eliminar(Long idPersonalCargo);

	List<PersonalCargo> listarPorEmpresa(Long idEmpresa);

	List<PersonalCargo> listarPorUsuario(Long idUsuario);

	List<PersonalCargo> listarPorEmpresaCargo(Long idEmpresa, String nombre);
}
