package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cargo;

public interface IDAOCargo {
	Cargo crear(Cargo cargo);

	Optional<Cargo> porId(Long idCargo);

	List<Cargo> listar();

	Cargo actualizar(Cargo cargo, Long idCargo);

	boolean eliminar(Long idCargo);
}
