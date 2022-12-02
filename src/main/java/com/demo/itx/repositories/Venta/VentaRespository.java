package com.demo.itx.repositories.Venta;

import com.demo.itx.models.Venta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRespository extends JpaRepository<Venta, Long> {
	
}
