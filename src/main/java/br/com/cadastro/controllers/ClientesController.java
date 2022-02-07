package br.com.cadastro.controllers;

import br.com.cadastro.entities.Clientes;
import br.com.cadastro.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientesController {

    private final ClientesRepository clientesRepository;

    @Autowired
    public ClientesController(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }

    @GetMapping("/clientes")
    public List<Clientes> clientes(){
        return clientesRepository.findAll();
    }
}
