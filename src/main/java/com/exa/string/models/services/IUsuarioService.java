package com.exa.string.models.services;

import java.util.List;

import com.exa.string.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	public Usuario findbyid(Long id);

	public void delete(Long id);

}
