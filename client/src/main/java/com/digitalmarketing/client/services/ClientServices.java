package com.digitalmarketing.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalmarketing.client.model.Client;
import com.digitalmarketing.client.repository.ClientRepo;

@Service
public class ClientServices {
    @Autowired
    public ClientRepo clientRepo;
    
    public Client postdetails(Client client)
    {
        return clientRepo.save(client);
    }
    public List<Client> get()
    {
        return clientRepo.findAll();
    }
    public void deleteClientById(int clientId) {
        clientRepo.deleteById(clientId);
    }
    
    public Optional<Client> getClientById(int clientId) {
        return clientRepo.findById(clientId);
    }
}
