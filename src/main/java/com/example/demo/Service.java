package com.example.demo;

import com.example.demo.models.Client;
import com.example.demo.views.ClientDAO;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Service {
    @Autowired
    private ClientDAO repo;

    public List<Client> findAllClients()
    {
        return (List<Client>) repo.findAll();
    }
}
