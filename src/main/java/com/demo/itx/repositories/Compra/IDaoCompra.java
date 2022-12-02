package com.demo.itx.repositories.Compra;

import com.demo.itx.models.DetalleCompra;

public interface IDaoCompra {
    DetalleCompra changeStatusById(long id,String status);

}
