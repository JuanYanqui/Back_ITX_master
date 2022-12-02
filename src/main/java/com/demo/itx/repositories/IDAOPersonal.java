package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Personal;

public interface IDAOPersonal {

	Personal crear(Personal personal);

	Optional<Personal> porId(Long idPersonal);

	List<Personal> listar();

	Personal actualizar(Personal personal, Long idPersonal);

	boolean eliminar(Long idPersonal);
}
