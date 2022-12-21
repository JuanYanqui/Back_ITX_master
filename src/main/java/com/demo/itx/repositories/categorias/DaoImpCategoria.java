package com.demo.itx.repositories.categorias;

import java.util.List;
import java.util.Optional;

import com.demo.itx.repositories.Dao;
import com.demo.itx.models.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoImpCategoria implements Dao<Categoria> {
	@Autowired
	CategoriaRepository categoriaRepository;
	@Override
	public Optional<Categoria> findById(long id) {
		
		return categoriaRepository.findById(id);
	}

	@Override
	public List<Categoria> findAll() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria save(Categoria t) {
		
		return categoriaRepository.save(t);
	}

	@Override
	public void update(Categoria t) {
		categoriaRepository.save(t);
		
	}

	@Override
	public void deleteById(long t) {
	
		categoriaRepository.deleteById(t);
	}
	
}
