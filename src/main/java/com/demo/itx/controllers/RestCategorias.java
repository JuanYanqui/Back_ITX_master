package com.demo.itx.controllers;

import java.util.List;

import com.demo.itx.models.Categoria;
import com.demo.itx.repositories.Producto.DaoImpProducto;
import com.demo.itx.repositories.categorias.DaoImpCategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin
public class RestCategorias {

	private final DaoImpCategoria categoriaRepository ;

	@Autowired
    public RestCategorias(DaoImpProducto productoRepository, DaoImpCategoria categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }



	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>> getCategorias() {

		return new ResponseEntity<>(categoriaRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/categorias")
	public Categoria postCategoria(@RequestBody Categoria categoria) {

		return categoriaRepository.save(categoria);
	}
	@PutMapping("/categoriaupdate/{id}")
	public Categoria putCategoria(@RequestBody Categoria categoria,@PathVariable("id") long id) {
		categoria.setId(id);
		return categoriaRepository.save(categoria);
	}
}
