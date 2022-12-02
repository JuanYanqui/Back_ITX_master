package com.demo.itx.repositories.ControlMercaderia;

import java.util.List;

import com.demo.itx.models.ControlMercaderia;

public interface IDaoControl {

    List<ControlMercaderia> porIdEmpresa(Long idEmpresa);

}
