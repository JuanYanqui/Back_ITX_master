package com.demo.itx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.itx.models.Pedido;



public interface IRepositoryPedido  extends JpaRepository<Pedido, Long>{

	List<Pedido> findByClienteUsuarioEmpresaIdEmpresa(Long idEmpresa);

	List<Pedido> findByClienteIdCliente(Long idCliente);

}
