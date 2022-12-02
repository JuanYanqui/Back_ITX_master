package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.ItemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplItemPedido implements IDAOItemPedido{

	@Autowired
	private IRepositoryItemPedido repository;

	@Override
	public ItemPedido crear(ItemPedido itemPedido) {

		return repository.save(itemPedido);
	}

	@Override
	public Optional<ItemPedido> porId(Long idItemPedido) {

		return repository.findById(idItemPedido);
	}

	@Override
	public List<ItemPedido> listar() {

		return repository.findAll();
	}

	@Override
	public ItemPedido actualizar(ItemPedido itemPedido, Long idItemPedido) {

		if(repository.findById(idItemPedido)!=null) {
			itemPedido.setIdItemPedido(idItemPedido);
			return repository.save(itemPedido);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idItemPedido) {

		if (repository.findById(idItemPedido)!=null) {
			repository.deleteById(idItemPedido);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<ItemPedido> porPedido(Long idPedido) {

		return repository.findByPedidoIdPedido(idPedido);
	}

}
