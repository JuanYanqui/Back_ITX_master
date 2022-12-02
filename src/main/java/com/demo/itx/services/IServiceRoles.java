package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Roles;

public interface IServiceRoles {

	Roles crear(Roles roles);

	Optional<Roles> porId(Long idRol);

	List<Roles> listar();

	Roles actualizar(Roles rol, Long idRol);

	boolean eliminar(Long idRol);

	Roles porNombre(String nombre);

}
