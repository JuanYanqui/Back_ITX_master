package com.demo.itx.repositories.Producto;

import java.util.List;
import java.util.Optional;

import com.demo.itx.repositories.Dao;
import com.demo.itx.models.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoImpProducto implements Dao<Producto>, IDaoProducto {
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto save(Producto p) {
		Producto prod_iva = p;
		System.out.println(p.getPrecio_ventas());
		prod_iva.setPrecio_compra_no_iva(0);
		prod_iva.setValor_iva(0);
		return productoRepository.save(prod_iva);
	}


	@Override
	public Optional<Producto> findById(long id) {
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public void update(Producto t) {
		productoRepository.save(t);
	}

	@Override
	public void deleteById(long t) {
		productoRepository.deleteById(t);
	}

	@Override
	public Producto findProductByName(String name) {
		return productoRepository.findByName(name);
	}

	@Override
	public List<Producto> porIdEmpresa(Long idEmpresa) {
		return productoRepository.findByEmpresaIdEmpresa(idEmpresa);
	}


	@Override
	public void updateCantidad(long id, int cantidad) {

		 productoRepository.updateCantidad(id, cantidad);

	}

	// @Override
	// public void disableProductById(long id) {
	// productoRepository.disableProductByID(id);

	// }

	// @Override
	// public void enableProductById(long id) {
	// enableProductById(id);
	// }

}
