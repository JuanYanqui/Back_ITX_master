package com.demo.itx.repositories.Producto;

import java.util.List;

import com.demo.itx.models.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query(value = "Select p from Producto p where p.nombre= ?1")
    Producto findByName(@Param("nombre") String nombre);

    @Transactional
    @Modifying
    @Query(value = "update Producto p set p.cantidad=p.cantidad+:cantidad where p.id= :id")
    void updateCantidad(@Param(value = "id") long id, @Param(value = "cantidad") int cantidad);

    // @Query("SELECT pv.* FROM productos p JOIN productos_proveedores pp ON p.id=pp.producto_id JOIN proveedor pv ON pp.proveedores_id_proveedor=pv.id_proveedor WHERE p.id=?1")
    // Producto findProveedorByProductId(@Param("id") long id);

    // @Query(value = "UPDATE p Producto p SET enable=false where p.id= ?1")
    // Producto disableProductByID(@Param("id") long id);

    // @Query(value = "UPDATE p Producto p SET enable=true where p.id= ?1")
    // Producto enableProductByID(@Param("id") long id);

    List<Producto> findByEmpresaIdEmpresa(Long idEmpresa);

}