package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplUsuario implements IDAOUsuario{

	@Autowired
	private IRepositoryUsuario repository;

	@Override
	public Usuario crear(Usuario usuario) {

		return repository.save(usuario);
	}

	@Override
	public Optional<Usuario> porId(Long idUsuario) {

		return repository.findById(idUsuario);
	}

	@Override
	public List<Usuario> listar() {

		return repository.findAll();
	}

	@Override
	public Usuario actualizar(Usuario usuario, Long idUsuario) {

		if(repository.findById(idUsuario)!=null) {
			usuario.setIdUsuario(idUsuario);
			return repository.save(usuario);
		}else {
			return null;
		}
	}

	@Override
	public boolean eliminar(Long idUsuario) {

		if(repository.findById(idUsuario)!=null) {
			repository.deleteById(idUsuario);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Usuario login(String username, String password) {


		return repository.findByUsernameAndPassword(username, password);
	}

	@Override
	public boolean porUsername(String username) {

		if (repository.findByUsername(username)!=null) {
			return true;
		}else {
			return false;
		}
	}

}
