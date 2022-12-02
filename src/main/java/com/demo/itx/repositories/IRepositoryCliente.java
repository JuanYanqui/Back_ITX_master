package com.demo.itx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.itx.models.Cliente;

public interface IRepositoryCliente extends JpaRepository<Cliente, Long>{

	List<Cliente> findByUsuarioEmpresaIdEmpresa(Long idEmpresa);

	Cliente findByUsuarioIdUsuarioAndUsuarioEmpresaIdEmpresa(Long idUsuario, Long idEmpresa);
}
