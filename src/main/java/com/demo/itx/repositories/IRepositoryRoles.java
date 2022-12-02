package com.demo.itx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.itx.models.Roles;


public interface IRepositoryRoles extends JpaRepository<Roles, Long>{

	Roles findByNombre(String nombre);

}
