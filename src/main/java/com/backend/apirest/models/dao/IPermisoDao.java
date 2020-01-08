package com.backend.apirest.models.dao;

import com.backend.apirest.models.entity.Permiso;
import org.springframework.data.repository.CrudRepository;

public interface IPermisoDao extends CrudRepository<Permiso, Integer> {
}
