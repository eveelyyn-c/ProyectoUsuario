package com.exa.string.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exa.string.models.dao.IUsuarioDao;
import com.exa.string.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuariosDao;

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuariosDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuariosDao.save(usuario);
	}

	@Override
	public Usuario findbyid(Long id) {
		return usuariosDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		usuariosDao.deleteById(id);
		
	}

}
