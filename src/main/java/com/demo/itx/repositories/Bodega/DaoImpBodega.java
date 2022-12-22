package com.demo.itx.repositories.Bodega;

import java.util.List;
import java.util.Optional;

import com.demo.itx.repositories.Dao;
import com.demo.itx.models.Bodega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoImpBodega implements Dao<Bodega>, IDaoBodega {
	@Autowired
	BodegaRepository bodegaRepository;

	@Override
	public Optional<Bodega> findById(long id) {

		return bodegaRepository.findById(id);
	}

	@Override
	public List<Bodega> findAll() {

		return bodegaRepository.findAll();
	}

	@Override
	public Bodega save(Bodega t) {
		return bodegaRepository.save(t);
	}

	@Override
	public void update(Bodega t) {
		bodegaRepository.save(t);
	}

	@Override
	public void deleteById(long t) {
		bodegaRepository.deleteById(t);
	}

	@Override
	public Bodega findBodegaByName(String name) {

		return bodegaRepository.findByName(name);
	}

    @Override
    public List<Bodega> porIdEmpresa(Long idEmpresa) {

        return bodegaRepository.findByEmpresaIdEmpresa(idEmpresa);
    }

}
