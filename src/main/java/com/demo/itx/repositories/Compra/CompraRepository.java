package com.demo.itx.repositories.Compra;

import com.demo.itx.models.DetalleCompra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends  JpaRepository<DetalleCompra,Long>{
	
}
