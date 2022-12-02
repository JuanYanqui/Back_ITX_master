package com.demo.itx.repositories.ControlMercaderia;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.ControlMercaderia;
import com.demo.itx.repositories.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DaoImpControl  implements Dao<ControlMercaderia>, IDaoControl{
    @Autowired
    ControlMercaderiaRepository controlMercaderiaRepository;
    @Override
    public Optional<ControlMercaderia> findById(long id) {

        return controlMercaderiaRepository.findById(id);
    }

    @Override
    public List<ControlMercaderia> findAll() {

        return controlMercaderiaRepository.findAll();
    }

    @Override
    public ControlMercaderia save(ControlMercaderia t) {

        return controlMercaderiaRepository.save(t);
    }

    @Override
    public void update(ControlMercaderia t) {

        controlMercaderiaRepository.save(t);
    }

    @Override
    public void deleteById(long t) {
        controlMercaderiaRepository.deleteById(t);

    }

    @Override
    public List<ControlMercaderia> porIdEmpresa(Long idEmpresa) {

        return controlMercaderiaRepository.findByEmpresaIdEmpresa(idEmpresa);
    }

}
