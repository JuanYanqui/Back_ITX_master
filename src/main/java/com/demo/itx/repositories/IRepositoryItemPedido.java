package com.demo.itx.repositories;

import java.util.List;

import com.demo.itx.models.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryItemPedido  extends JpaRepository<ItemPedido, Long>{

	List<ItemPedido> findByPedidoIdPedido(Long idPedido);

}
