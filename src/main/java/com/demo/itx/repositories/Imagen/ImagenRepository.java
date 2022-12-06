package com.demo.itx.repositories.Imagen;

import com.demo.itx.models.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    Optional<Imagen> findByName(String name);
}
