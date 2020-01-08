package com.backend.apirest.models.services.permiso;

import com.backend.apirest.models.dao.IPermisoDao;
import com.backend.apirest.models.entity.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoServiceImpl implements IPermisoService {

    @Autowired
    private IPermisoDao permisoDao;

    @Override
    public List<Permiso> findAdll() {
        return null;
    }

    @Override
    public void save(Permiso permiso) {
        permisoDao.save(permiso);
    }
}
