package com.demo.itx.repositories.Venta;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Venta;
import com.demo.itx.repositories.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoImpVenta implements Dao<Venta> {

	@Autowired
	VentaRespository ventaRepository;

	@Override
	public Optional<Venta> findById(long id) {

		return ventaRepository.findById(id);
	}

	@Override
	public List<Venta> findAll() {

		return ventaRepository.findAll();
	}

	@Override
	public Venta save(Venta t) {

		return ventaRepository.save(t);
	}

	@Override
	public void update(Venta t) {

		ventaRepository.save(t);
	}

	@Override
	public void deleteById(long id) {
		ventaRepository.deleteById(id);
	}

}
