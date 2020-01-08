package com.backend.apirest.controllers;

import com.backend.apirest.models.dao.IPermisoDao;
import com.backend.apirest.models.dao.IUsuarioDao;
import com.backend.apirest.models.entity.Usuario;
import com.backend.apirest.models.services.permiso.IPermisoService;
import com.backend.apirest.models.services.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController //notacion para un API REST
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    //private IUsuarioService usuarioService;
    private IUsuarioDao usuarioDao;

    @Autowired
    //private IPermisoService permisoService;
    private IPermisoDao permisoDao;

    @PostMapping("/crear/{idPermiso}")
    public Usuario crear(@RequestBody Usuario rqUsuario,@PathVariable Integer idPermiso){
        return permisoDao.findById(idPermiso)
            .map(permiso -> {
                rqUsuario.setPermisoByIdPermiso(permiso);
                return usuarioDao.save(rqUsuario);
            })
            .orElseThrow();
    }
}
