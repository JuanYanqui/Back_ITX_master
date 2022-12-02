package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplProveedor implements IDAOProveedor{

   @Autowired
   IRepositoryProveedor repositoryProveedor;

    @Override
    public Proveedor crear(Proveedor proveedor) {

        return repositoryProveedor.save(proveedor);
    }

    @Override
    public Optional<Proveedor> porId(Long idProveedor) {

        return repositoryProveedor.findById(idProveedor);
    }

    @Override
    public List<Proveedor> listar() {

        return repositoryProveedor.findAll();
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor, Long idProveedor) {

        if(repositoryProveedor.findById(idProveedor)!=null){
           proveedor.setIdProveedor(idProveedor);
           return repositoryProveedor.save(proveedor);
        }else{
            return null;
        }
    }

    @Override
    public boolean eliminar(Long idProveedor) {

        if(repositoryProveedor.findById(idProveedor)!=null){
          repositoryProveedor.findById(idProveedor);
          return true;
        }else{
        return false;
        }
    }

	@Override
	public List<Proveedor> listaByEmpresa(Long idEmpresa) {

		return repositoryProveedor.findByEmpresaIdEmpresa(idEmpresa);
	}
}
