package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Usuario;

public interface IServiceUsuario {

	Usuario crear(Usuario usuario);

	Optional<Usuario> porId(Long idUsuario);

	List<Usuario> listar();

	Usuario actualizar(Usuario usuario, Long idUsuario);

	boolean eliminar (Long idUsuario);

	Usuario login (String username, String password);

	boolean porUsername(String username);
}
