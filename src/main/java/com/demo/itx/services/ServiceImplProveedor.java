package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Proveedor;
import com.demo.itx.repositories.IDAOProveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplProveedor implements IServiceProveedor{

    @Autowired
    private IDAOProveedor idaoProveedor;

    @Override
    public Proveedor crear(Proveedor proveedor) {

        return idaoProveedor.crear(proveedor);
    }

    @Override
    public Optional<Proveedor> porId(Long idProveedor) {

        return idaoProveedor.porId(idProveedor);
    }

    @Override
    public List<Proveedor> listar() {

        return idaoProveedor.listar();
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor, Long idProveedor) {

        return idaoProveedor.actualizar(proveedor, idProveedor);
    }

    @Override
    public boolean eliminar(Long idProveedor) {

        return idaoProveedor.eliminar(idProveedor);
    }

	@Override
	public List<Proveedor> listarByEmpresa(Long idEmpresa) {

		return idaoProveedor.listaByEmpresa(idEmpresa);
	}

}
