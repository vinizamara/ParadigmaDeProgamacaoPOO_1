package com.ApiClientes.ApiRestClientes.service;

import com.ApiClientes.ApiRestClientes.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    //Criando uma arrayçist para simulação do B.D.
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private Long id = 1L;

    public List<Cliente> listar(){
        return this.clientes;
    }

    public Cliente criar(Cliente cliente){
        //settar id do cliente
        cliente.setId(id);
        id++;
        //Adicionar o cliente no "Banco de Dados"
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente buscarPorId(Long idRequisitado){
        for (int i = 0; i < clientes.size(); i++){
            if (this.clientes.get(i).getId().equals(idRequisitado)){
                //Caso encontre:
                return this.clientes.get(i);
            }
        }
        //Caso não encontre:
        return null;
    }

    public boolean remover(Long idRequisitado){
        //Utilizando método remoIf
        return this.clientes.removeIf(c -> c.getId().equals(idRequisitado));
    }

    public Cliente atualizar(Long idRequisitado, Cliente clienteNovo){
        clienteNovo.setId(idRequisitado);

        for (int i = 0; i < this.clientes.size(); i++){
            if (this.clientes.get(i).getId().equals(idRequisitado)){
                //Caso encontre:
                return this.clientes.set(i, clienteNovo);
            }
        }

        //Caso não encontre:
        return null;
    }
}
