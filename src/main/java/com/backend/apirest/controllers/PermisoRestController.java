package com.backend.apirest.controllers;

import com.backend.apirest.models.entity.Permiso;
import com.backend.apirest.models.services.permiso.IPermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //notacion para un API REST
@RequestMapping("/api/permiso")
public class PermisoRestController {

    @Autowired
    private IPermisoService permisoService;

    @PostMapping("/crear")
    public  void crear(@RequestBody Permiso permiso){
        permisoService.save(permiso);
    }
}
