package com.example.insurance.controller;

import com.example.insurance.entity.Client;
import com.example.insurance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("/api/clients")
    public Client addClient(@RequestBody Client client) {
        return service.saveClient(client);
    }

    @PostMapping("/api/multipleclients")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return service.saveClients(clients);
    }

    @GetMapping("/api/clients")
    public List<Client> findAllClients() {
        return service.getClients();
    }

    @GetMapping("/api/clients/{clientId}")
    public Client findClientById(@PathVariable int clientId) {
        return service.getClientById(clientId);
    }

    @PutMapping("/api/clients/{clientId}")
    public Client updateClient(@PathVariable int clientId, @RequestBody Client client) {
        return service.updateClient(clientId, client);
    }

    @DeleteMapping("/api/clients/{clientId}")
    public String deleteClient(@PathVariable int clientId) {
        return service.deleteClient(clientId);
    }
}
