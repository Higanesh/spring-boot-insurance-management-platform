package com.example.insurance.service;

import com.example.insurance.entity.Client;
import com.example.insurance.repository.ClaimRepository;
import com.example.insurance.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public List<Client> saveClients(List<Client> clients) {
        return repository.saveAll(clients);
    }

    public List<Client> getClients() {
        return repository.findAll();
    }

    public Client getClientById(int clientId) {
        return repository.findById(clientId).orElse(null);
    }

    public Client updateClient(Client client) {
        Client existingClient = repository.findById(client.getClientId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setDateOfBirth(client.getDateOfBirth());
        existingClient.setAddress(client.getAddress());
        existingClient.setContactInfo(client.getContactInfo());
        return repository.save(existingClient);
    }

    public String deleteClient(int clientId) {
        repository.deleteById(clientId);
        return "Client removed !! " + clientId;
    }

}
