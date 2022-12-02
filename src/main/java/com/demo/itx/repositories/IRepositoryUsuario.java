package com.demo.itx.repositories;

import com.demo.itx.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryUsuario extends JpaRepository<Usuario, Long>{

	Usuario findByUsernameAndPassword(String username, String password);

	Usuario findByUsername(String username);

}
