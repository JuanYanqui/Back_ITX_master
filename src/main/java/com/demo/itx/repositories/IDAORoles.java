package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Roles;

public interface IDAORoles {

	Roles crear(Roles roles);

	Optional<Roles> porId(Long idRol);

	List<Roles> listar();

	Roles actualizar(Roles roles, Long idRol);

	boolean eliminar(Long idRol);

	Roles porNombre(String nombre);
}
