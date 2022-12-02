package com.demo.itx.controllers;

import java.util.List;

import com.demo.itx.models.DetalleVenta;
import com.demo.itx.repositories.DetalleventaRepository;

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
public class DetalleVentaController {

    @Autowired
    DetalleventaRepository detalleVentaRepository;

    @GetMapping("/detalle-ventas")
    public ResponseEntity<List<DetalleVenta>> getDetalleVentas() {
        List<DetalleVenta> detalleVenta = detalleVentaRepository.findAll();
        return new ResponseEntity<>(detalleVenta, HttpStatus.OK);
    }

    @PostMapping("/detalle-venta")
    @ResponseBody
    public DetalleVenta postDetalleVenta(@RequestBody DetalleVenta DetalleVenta) {
        // Proveedor proveedor = proveedorRepositorio.findById(id).get();
        return detalleVentaRepository.save(DetalleVenta);
    }

    @GetMapping("/detalle-venta/{id}")
    public ResponseEntity<DetalleVenta> getDetalleVentaById(@PathVariable("id") long id) {
        DetalleVenta detalleVenta = detalleVentaRepository.getById(id);
        return new ResponseEntity<>(detalleVenta, HttpStatus.OK);
    }
}
