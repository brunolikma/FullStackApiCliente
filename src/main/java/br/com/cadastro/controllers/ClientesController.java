package br.com.cadastro.controllers;

import br.com.cadastro.entities.Clientes;
import br.com.cadastro.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/clientes")
@RestController
public class ClientesController {

    private final ClientesRepository clientesRepository;

    @Autowired
    public ClientesController(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }

    @GetMapping()
    public List<Clientes> clientes(){
        return clientesRepository.findAll();
    }

    @PostMapping("/cadastrounico")
    public void postClientes(@RequestBody Clientes cliente){
        this.clientesRepository.save(cliente);
    }

    @PostMapping("/cadastroemlista")
    public void postlistaclientes(@RequestBody List<Clientes> clientes){
        this.clientesRepository.saveAll(clientes);
    }

}
