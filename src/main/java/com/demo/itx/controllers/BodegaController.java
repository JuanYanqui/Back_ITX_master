package com.demo.itx.controllers;

import java.util.List;

import com.demo.itx.exceptions.BodegaNotFoundException;
import com.demo.itx.models.Bodega;
import com.demo.itx.repositories.Bodega.DaoImpBodega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BodegaController {

	@Autowired
	DaoImpBodega daoImpBodega;

	@GetMapping("/bodegas")
	public ResponseEntity<List<Bodega>> getBodegaos() {

		List<Bodega> bodega = daoImpBodega.findAll();
		return new ResponseEntity<>(bodega, HttpStatus.OK);
	}

	@PostMapping("/bodega")
	@ResponseBody
	public Bodega postBodegao(@RequestBody Bodega bodega) {
		// Proveedor proveedor = proveedorRepositorio.findById(id).get();
		// bodega.setUsuario(usuario);
		return daoImpBodega.save(bodega);
	}

	@PutMapping("/bodega/{id}")
	@ResponseBody
	public Bodega updateBodega(@RequestBody Bodega bodega, @PathVariable Long id) {
		bodega.setId(id);
		return daoImpBodega.save(bodega);
	}

	@GetMapping("/bodega/{id}")
	public Bodega getBodegaoById(@PathVariable("id") long id) throws Exception {

		// Optional<Bodega> optionalBodega = daoImpBodega.get(id);
		// optionalBodega.orElseThrow(() -> new
		// BodegaNotFoundException(optionalBodega.get().getId()));
		return daoImpBodega.findById(id)
				.orElseThrow(() -> new BodegaNotFoundException("No se encontro el bodega con id: " + id + "\n"));
		// if (optionalBodega.isPresent()) {
		// return new ResponseEntity<Bodega>(optionalBodega.get(), HttpStatus.OK);
		// } else { // Manejar el error
		// throw new BodegaNotFoundException("No se encontro el bodega con id: " + id +
		// "\n");
		// }

	}

	// https://www.amitph.com/spring-return-specific-http-status/
	@GetMapping("/bodega")
	public ResponseEntity<Bodega> getBodegaByName(@RequestParam String nombre) {

		Bodega bodega = daoImpBodega.findBodegaByName(nombre);
		if (bodega == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Bodega>(bodega, HttpStatus.OK);
		}
	}

	@DeleteMapping("/bodega/{id}")
    ResponseEntity<?> deleteBodega(@PathVariable Long id) {
        daoImpBodega.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/bodegas/{id}")
    public ResponseEntity<List<Bodega>> getByIdEmpresa(@PathVariable("id") long idEmpresa) {

        List<Bodega> listBodegas = daoImpBodega.porIdEmpresa(idEmpresa);
        return new ResponseEntity<>(listBodegas, HttpStatus.OK);
    }

}
