package com.backend.apirest.models.services;

import com.backend.apirest.models.dao.IClienteDao;
import com.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //componente de servicio de spring
public class ClienteServiceImpl implements IClienteService {

    @Autowired //inyecciones de dependencias
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    public List<Cliente> findById() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
