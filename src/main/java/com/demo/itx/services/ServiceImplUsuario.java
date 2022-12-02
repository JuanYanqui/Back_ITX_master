package com.demo.itx.services;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Usuario;
import com.demo.itx.repositories.IDAOUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplUsuario implements IServiceUsuario{

	@Autowired
	private IDAOUsuario dao;

	@Override
	public Usuario crear(Usuario usuario) {

		return dao.crear(usuario);
	}

	@Override
	public Optional<Usuario> porId(Long idUsuario) {

		return dao.porId(idUsuario);
	}

	@Override
	public List<Usuario> listar() {

		return dao.listar();
	}

	@Override
	public Usuario actualizar(Usuario usuario, Long idUsuario) {

		return dao.actualizar(usuario, idUsuario);
	}

	@Override
	public boolean eliminar(Long idUsuario) {

		return dao.eliminar(idUsuario);
	}

	@Override
	public Usuario login(String username, String password) {

		return dao.login(username, password);
	}

	@Override
	public boolean porUsername(String username) {

		return dao.porUsername(username);
	}


}
