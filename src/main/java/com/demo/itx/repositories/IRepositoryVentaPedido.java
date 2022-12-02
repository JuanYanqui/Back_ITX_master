package com.demo.itx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.itx.models.VentaPedido;

public interface IRepositoryVentaPedido extends JpaRepository<VentaPedido, Long>{

	VentaPedido findByPedidoIdPedido(Long idPedido);
	
	List<VentaPedido> findByEmpresaIdEmpresaAndIsOnline(Long idEmpresa, boolean isOnline);
}
