package com.demo.itx.repositories;

import java.util.List;

import com.demo.itx.models.Proveedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryProveedor extends JpaRepository<Proveedor, Long>  {

	List<Proveedor> findByEmpresaIdEmpresa(Long idEmpresa);

}
