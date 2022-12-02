package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.ItemPedido;

public interface IDAOItemPedido {

	ItemPedido crear(ItemPedido itemPedido);

	Optional<ItemPedido> porId(Long idItemPedido);

	List<ItemPedido> listar();

	ItemPedido actualizar(ItemPedido itemPedido, Long idItemPedido);

	boolean eliminar(Long idItemPedido);

	List<ItemPedido> porPedido(Long idPedido);
}
