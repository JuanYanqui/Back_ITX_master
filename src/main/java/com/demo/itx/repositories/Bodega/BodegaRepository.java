package com.demo.itx.repositories.Bodega;

import java.util.List;

import com.demo.itx.models.Bodega;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Long> {
	@Query(value = "Select b from Bodega b where b.nombre= ?1")
	Bodega findByName(@Param("nombre") String nombre);

	List<Bodega> findByEmpresaIdEmpresa(Long idEmpresa);

}
