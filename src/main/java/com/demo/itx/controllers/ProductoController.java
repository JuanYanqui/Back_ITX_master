package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.exceptions.ProductNotFoundException;
import com.demo.itx.models.Producto;
import com.demo.itx.repositories.Producto.DaoImpProducto;

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
public class ProductoController {

	@Autowired
    public ProductoController( DaoImpProducto productoRepository) {
        this.productoRepository = productoRepository;
        }

        private final DaoImpProducto productoRepository;


	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> getProductos() {

		List<Producto> producto = productoRepository.findAll();
		return new ResponseEntity<>(producto, HttpStatus.OK);
	}

	@PostMapping(value="/producto")
	@ResponseBody
    public ResponseEntity<Producto> postProducto(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoRepository.save(producto), HttpStatus.OK);
    }


    // @PostMapping(value="/upload", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE ,
    //         MediaType.APPLICATION_JSON_VALUE})
    // public ResponseEntity<String> uploadFile(@RequestPart() MultipartFile file) {
    //     return new ResponseEntity<>( imageService.uploadFile(file), HttpStatus.OK);
    // }

	@PutMapping("/producto/{id}")
	@ResponseBody
	public Producto updateProduct(@RequestBody Producto producto, @PathVariable("id") long id) {
		// Proveedor proveedor = proveedorRepositorio.findById(id).get();
		// producto.setUsuario(usuario);
		producto.setId(id);
		return productoRepository.save(producto);
	}

	@PutMapping("/update-product/cantidades/{id}")
	public void update_product_cantidades(@PathVariable("id") long id, @RequestParam int cantidad) {
		// Proveedor proveedor = proveedorRepositorio.findById(id).get();
		// producto.setUsuario(usuario);
		productoRepository.updateCantidad(id, cantidad);
	}


	@GetMapping("/producto/{id}")
	public ResponseEntity<Producto> getProductoById(@PathVariable("id") long id) throws Exception {

		Optional<Producto> optionalProduct = productoRepository.findById(id);
		// optionalProduct.orElseThrow(() -> new
		// ProductNotFoundException(optionalProduct.get().getId()));

		if (optionalProduct.isPresent()) {
			return new ResponseEntity<Producto>(optionalProduct.get(), HttpStatus.OK);
		} else { // Manejar el error
			throw new ProductNotFoundException("No se encontro el producto con id: " + id + "\n");
		}

	}

	// https://www.amitph.com/spring-return-specific-http-status/
	@GetMapping("/producto")
	public ResponseEntity<Producto> getProductByName(@RequestParam String nombre) {

		Producto producto = productoRepository.findProductByName(nombre);
		if (producto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}
	}

	@DeleteMapping("/producto/{id}")
	ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		productoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/listaproductos/{idEmpresa}")
    public ResponseEntity<List<Producto>> getByEmpresa(@PathVariable Long idEmpresa) {

        List<Producto> listaProductos = productoRepository.porIdEmpresa(idEmpresa);
        return new ResponseEntity<>(listaProductos, HttpStatus.OK);
    }

    @GetMapping("/products/{idEmpresa}")
    public ResponseEntity<List<Producto>> getByEmpresav2(@PathVariable("idEmpresa") long idEmpresa) {

        List<Producto> listaProductos = productoRepository.porIdEmpresa(idEmpresa);
        return new ResponseEntity<>(listaProductos, HttpStatus.OK);
    }

}
