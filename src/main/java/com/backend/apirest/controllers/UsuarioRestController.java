package com.backend.apirest.controllers;

import com.backend.apirest.models.dao.IUsuarioDao;
import com.backend.apirest.models.entity.Usuario;
import com.backend.apirest.models.services.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IUsuarioDao usuarioDao;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Usuario usuario){
        usuarioDao.save(usuario);
    }
}
