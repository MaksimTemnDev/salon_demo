package com.example.demo;

import com.example.demo.models.Client;
import com.example.demo.views.ClientDAO;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

import java.util.List;

public class Service {
    private ClientDAO repo;

    public List<Client> findAllClients()
    {
        return (List<Client>) repo.findAll();
    }
}
