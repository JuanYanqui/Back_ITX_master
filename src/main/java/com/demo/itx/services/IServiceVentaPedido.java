package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.VentaPedido;

public interface IServiceVentaPedido {

	VentaPedido crear(VentaPedido ventaPedido);

	Optional<VentaPedido> porId(Long idVentaPedido);

	List<VentaPedido> listar();

	VentaPedido actualizar(VentaPedido ventaPedido, Long idVentaPedido);

	boolean eliminar (Long idVentaPedido);
	
	VentaPedido porPedido(Long idPedido);
	
	List<VentaPedido> porEmpresa(Long idEmpresa, boolean isOnline);
}
