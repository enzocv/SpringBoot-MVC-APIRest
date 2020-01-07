package com.backend.apirest.controllers;

import com.backend.apirest.models.entity.Cliente;
import com.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(origins = "https://localhost:5001") //permite el acceso a un dominio especifico
@RestController //notacion para un API REST
@RequestMapping("/api") //ruta para acceder al controlador
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
}
