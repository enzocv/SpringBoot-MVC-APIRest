package com.backend.apirest.models.services.permiso;


import com.backend.apirest.models.entity.Permiso;

import java.util.List;

public interface IPermisoService {

    public List<Permiso> findAdll();

    public void save(Permiso permiso);

}
