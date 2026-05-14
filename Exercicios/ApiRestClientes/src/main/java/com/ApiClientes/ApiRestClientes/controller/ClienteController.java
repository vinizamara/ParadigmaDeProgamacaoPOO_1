package com.ApiClientes.ApiRestClientes.controller;

import com.ApiClientes.ApiRestClientes.model.Cliente;
import com.ApiClientes.ApiRestClientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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

    @GetMapping("/{idRequisitado}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long idRequisitado){
        Cliente resposta = service.buscarPorId(idRequisitado);

        if (resposta != null){
            return ResponseEntity.ok(resposta);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente novo = service.criar(cliente);
        URI uri = URI.create("/cliente/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @PatchMapping("/{idRequisitado}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long idRequisitado, @RequestBody Cliente clienteNovo){
        Cliente resposta = service.atualizar(idRequisitado, clienteNovo);
        if (resposta != null){
            return ResponseEntity.ok(resposta);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idRequisitado}")
    public ResponseEntity<Void> remover(@PathVariable Long idRequisitado){
        if(service.remover(idRequisitado)){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
