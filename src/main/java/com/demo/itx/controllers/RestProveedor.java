package com.demo.itx.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Proveedor;
import com.demo.itx.services.IServiceProveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin("*")
public class RestProveedor {

    @Autowired
    private IServiceProveedor iServiceProveedor;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Proveedor postProveedor(@RequestBody Proveedor proveedor){
        return iServiceProveedor.crear(proveedor);
    }

    @RequestMapping(value = "/listarproveedor", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Proveedor> getProveedor(){
        return iServiceProveedor.listar();
    }

    @RequestMapping(value = "/{idProveedor}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Optional<Proveedor> porId(@PathVariable Long idProveedor){
        return iServiceProveedor.porId(idProveedor);
    }

    @RequestMapping(value = "/actualizarProveedor/{idProveedor}", method = RequestMethod.PUT)
	@ResponseBody
	@CrossOrigin
	public Proveedor modificar(@PathVariable Long idProveedor, @RequestBody Proveedor proveedor) {
		return iServiceProveedor.actualizar(proveedor, idProveedor);
	}

    @RequestMapping(value = "/listbyempresa/{idEmpresa}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Proveedor> getProveedor(@PathVariable Long idEmpresa){
        return iServiceProveedor.listarByEmpresa(idEmpresa);
    }

}
