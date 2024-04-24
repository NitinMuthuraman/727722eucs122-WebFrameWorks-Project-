package com.digitalmarketing.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalmarketing.client.model.Client;
import com.digitalmarketing.client.services.ClientServices;

@RestController
public class ClientController {
    @Autowired
    public ClientServices clientServices;

    @PostMapping("/client")
    public Client postMethodName(@RequestBody Client entity) {
        return clientServices.postdetails(entity);
    }

    @GetMapping("/getallclient")
    public List<Client> getMethodName() {
        return clientServices.get();
    }

    @GetMapping("/getclient/{customer}")
    public Optional<Client> getMethodName(@PathVariable int customer) {
        return clientServices.getClientById(customer);
    }

    @DeleteMapping("/delete/{clientId}")
    public String deleteClientById(@PathVariable int clientId) {
        clientServices.deleteClientById(clientId);
        return "Deleted Successfully";
    }

}
