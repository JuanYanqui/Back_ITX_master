package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Persona;

public interface IServicePersona {

	Persona crear(Persona persona);

	Optional<Persona> porId(Long idPersona);

	List<Persona> listar();

	Persona actualizar(Persona persona, Long idPersona);

	boolean eliminar(Long idPersona);

	Persona porCedula(String cedula);
}
