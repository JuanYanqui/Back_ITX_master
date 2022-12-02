package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.exceptions.ProductNotFoundException;
import com.demo.itx.models.DetalleCompra;
import com.demo.itx.repositories.Compra.DaoImpCompra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class CompraController {


	@Autowired
	private  DaoImpCompra compraRepository;

	@GetMapping("/compras")
	public ResponseEntity<List<DetalleCompra>> getCompras() {
		List<DetalleCompra> Compra = compraRepository.findAll();
		return new ResponseEntity<>(Compra, HttpStatus.OK);
	}

	@PostMapping("/compra")
	@ResponseBody
    public DetalleCompra postCompra(@RequestBody DetalleCompra detalleCompra) {
        System.out.println(detalleCompra);
        return compraRepository.save(detalleCompra);

    }

    @PutMapping("/compra-status/{id}")
    @ResponseBody
    public DetalleCompra putCompra(@PathVariable("id") long id, @RequestParam(required = false,name="status") String status) {
        return compraRepository.changeStatusById(id,status);
    }

	@GetMapping("/compra/{id}")
	public ResponseEntity<DetalleCompra> getCompraById(@PathVariable("id") long id) {

		Optional<DetalleCompra> optionalProduct = compraRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return new ResponseEntity<DetalleCompra>(optionalProduct.get(), HttpStatus.OK);
		} else { // Manejar el error
			throw new ProductNotFoundException("No se encontro el producto con id: " + id + "\n");
		}
	}

}
