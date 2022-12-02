package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Pedido;

public interface IDAOPedido {

	Pedido crear(Pedido pedido);

	Optional<Pedido> porId(Long idPedido);

	List<Pedido> listar();

	Pedido actualizar(Pedido pedido, Long idPedido);

	boolean eliminar(Long idPedido);
	
	List<Pedido> listarPorEmpresa(Long idEmpresa);
	
	List<Pedido> listarPorCliente(Long idCliente);

}
