package com.demo.itx.repositories.Compra;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.DetalleCompra;
import com.demo.itx.repositories.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoImpCompra implements Dao<DetalleCompra>,IDaoCompra {
	@Autowired
	CompraRepository compraRepository;

	@Override
	public Optional<DetalleCompra> findById(long id) {

		return compraRepository.findById(id);
	}

	@Override
	public List<DetalleCompra> findAll() {

		return compraRepository.findAll();
	}

	@Override
    public DetalleCompra save(DetalleCompra t) {
		return compraRepository.save(t);
	}

	@Override
	public void update(DetalleCompra t) {
		compraRepository.save(t);

	}

	@Override
	public void deleteById(long t) {
		compraRepository.deleteById(t);

	}

    @Override
    public DetalleCompra changeStatusById(long id,String status) {
        DetalleCompra dc = compraRepository.findById(id).get();
        dc.setEstado(status);
        compraRepository.save(dc);
        return dc;
    }

}
