package com.demo.itx.repositories.ControlMercaderia;

import java.util.List;

import com.demo.itx.models.ControlMercaderia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlMercaderiaRepository extends JpaRepository<ControlMercaderia, Long>{
    List<ControlMercaderia> findByEmpresaIdEmpresa(Long idEmpresa);
}
