package com.example.demo.views;

import com.example.demo.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDAO extends CrudRepository<Client,Long> {
}
