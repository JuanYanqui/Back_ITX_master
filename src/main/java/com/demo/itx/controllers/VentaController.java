package com.demo.itx.controllers;

import java.util.List;

import com.demo.itx.models.Venta;
import com.demo.itx.repositories.Venta.VentaRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VentaController {

    @Autowired
    VentaRespository ventaRepository;

    @GetMapping("/ventas")
    public ResponseEntity<List<Venta>> getVentas() {
        List<Venta> venta = ventaRepository.findAll();
        return new ResponseEntity<>(venta, HttpStatus.OK);
    }

    @PostMapping("/venta")
    @ResponseBody
    public Venta postVenta(@RequestBody Venta venta) {
        // Proveedor proveedor = proveedorRepositorio.findById(id).get();
        // venta.setUsuario(usuario);
        return ventaRepository.save(venta);
    }

    @GetMapping("/venta/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable("id") long id) {
        Venta venta = ventaRepository.getById(id);
        return new ResponseEntity<>(venta, HttpStatus.OK);
    }
}
