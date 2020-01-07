package com.backend.apirest.models.dao;

import com.backend.apirest.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {
}
