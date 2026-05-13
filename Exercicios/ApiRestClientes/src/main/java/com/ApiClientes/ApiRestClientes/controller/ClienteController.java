package com.ApiClientes.ApiRestClientes.controller;

import com.ApiClientes.ApiRestClientes.model.Cliente;
import com.ApiClientes.ApiRestClientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // define a classe como controlador REST (recebe requisições retorna JSON)
@RequestMapping("/cliente") // Define a rota da API
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok(service.listar());
    }
}
