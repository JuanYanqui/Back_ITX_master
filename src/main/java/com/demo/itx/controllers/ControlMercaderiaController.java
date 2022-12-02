package com.demo.itx.controllers;

import java.util.List;

import com.demo.itx.models.ControlMercaderia;
import com.demo.itx.repositories.ControlMercaderia.DaoImpControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControlMercaderiaController {
    @Autowired
    DaoImpControl daoImpControl;

    @GetMapping("/control-mers")
    public ResponseEntity<List<ControlMercaderia>> getControlMercaderias() {
        List<ControlMercaderia> ControlMercaderia = daoImpControl.findAll();
        return new ResponseEntity<>(ControlMercaderia, HttpStatus.OK);
    }

    @PostMapping("/control-mer")
    @ResponseBody
    public ControlMercaderia postControlMercaderia(@RequestBody ControlMercaderia ControlMercaderia) {
        // Proveedor proveedor = proveedorRepositorio.findById(id).get();
        return daoImpControl.save(ControlMercaderia);
    }

    // @GetMapping("/control-mer/{id}")
    // public ControlMercaderia getControlMercaderiaById(@PathVariable("id") long id) throws Exception {
    //     return daoImpControl.findById(id)
    //             .orElseThrow(() -> new BodegaNotFoundException("No se encontro con id: " + id + "\n"));
    // }

    // @GetMapping("/control-mer/{id}")
    // public ResponseEntity<List<ControlMercaderia>> getByIdEmpresa(@PathVariable("id") long idEmpresa) {

    //     List<ControlMercaderia> listControl = daoImpControl.porIdEmpresa(idEmpresa);
    //     return new ResponseEntity<>(listControl, HttpStatus.OK);
    // }

}
