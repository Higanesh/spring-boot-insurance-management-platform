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

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return service.saveClient(client);
    }

    @PostMapping("/addClients")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return service.saveClients(clients);
    }

    @GetMapping("/getClients")
    public List<Client> findAllClients() {
        return service.getClients();
    }

    @GetMapping("/ClientById/{clientId}")
    public Client findClientById(@PathVariable int clientId) {
        return service.getClientById(clientId);
    }

    @PutMapping("/updateClientById")
    public Client updateClient(@RequestBody Client client) {
        return service.updateClient(client);
    }

    @DeleteMapping("/deleteClientById/{clientId}")
    public String deleteClient(@PathVariable int clientId) {
        return service.deleteClient(clientId);
    }
}
