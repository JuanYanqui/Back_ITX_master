package com.demo.itx.repositories;

import com.demo.itx.models.Personal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryPersonal extends JpaRepository<Personal, Long>{

}
