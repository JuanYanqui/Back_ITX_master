package com.demo.itx.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.itx.models.Empresa;

public interface IRepositoryEmpresa extends JpaRepository<Empresa, Long>{

	Empresa findByPersonaIdPersona(Long idPersona);

	Empresa findByRuc(String ruc);
}
