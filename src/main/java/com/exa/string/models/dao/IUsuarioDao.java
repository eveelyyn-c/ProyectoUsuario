package com.exa.string.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.exa.string.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
