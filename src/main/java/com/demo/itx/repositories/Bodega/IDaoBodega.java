package com.demo.itx.repositories.Bodega;

import java.util.List;

import com.demo.itx.models.Bodega;

public interface IDaoBodega {
    Bodega findBodegaByName(String name);

    List<Bodega> porIdEmpresa(Long idEmpresa);

}
