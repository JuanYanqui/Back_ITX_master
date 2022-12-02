package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Cliente;

public interface IDAOCliente {
	Cliente crear(Cliente cliente);

	Optional<Cliente> porId(Long idCliente);

	List<Cliente> listar();

	Cliente actualizar(Cliente cliente, Long idCliente);

	boolean eliminar(Long idCliente);

	List<Cliente> porIdEmpresa(Long idEmpresa);

	Cliente porUsuarioAndEmpresa(Long idUsuario, Long idEmpresa);
}
