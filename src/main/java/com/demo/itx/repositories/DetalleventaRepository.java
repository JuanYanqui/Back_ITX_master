package com.demo.itx.repositories;

import com.demo.itx.models.DetalleVenta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleventaRepository extends JpaRepository<DetalleVenta, Long> {

}
