package com.demo.itx.repositories.Producto;

import java.util.List;

import com.demo.itx.models.Producto;

public interface IDaoProducto {

    Producto findProductByName(String name);

    void updateCantidad(long id, int cantidad);
    // Proveedor findProveedorByProductId(long id);
    // void disableProductById(long id);

    // void enableProductById(long id);

    List<Producto> porIdEmpresa(Long idEmpresa);

}
