package com.demo.itx.repositories;

import com.demo.itx.models.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryPersona extends JpaRepository<Persona, Long>{
	Persona findByCedula(String cedula);
}
