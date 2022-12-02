package com.demo.itx.repositories;

import java.util.List;

import com.demo.itx.models.PersonalCargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryPersonalCargo extends JpaRepository<PersonalCargo, Long>{

	List<PersonalCargo> findByPersonalUsuarioEmpresaIdEmpresa(Long idEmpresa);

	List<PersonalCargo> findByPersonalUsuarioIdUsuario(Long idUsuario);

	List<PersonalCargo> findByPersonalUsuarioEmpresaIdEmpresaAndCargoNombre(Long idEmpresa, String nombre);

}
