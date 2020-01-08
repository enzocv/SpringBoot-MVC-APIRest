package com.backend.apirest.models.services.usuario;

import com.backend.apirest.models.dao.IUsuarioDao;
import com.backend.apirest.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAdll() {
        return null;
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }
}
