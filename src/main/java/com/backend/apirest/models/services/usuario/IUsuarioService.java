package com.backend.apirest.models.services.usuario;

import com.backend.apirest.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAdll();

    public void save(Usuario usuario);
}
