package com.example.demo;

import com.example.demo.models.Client;
import com.example.demo.Service;
import com.example.demo.views.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Rename {

    @Autowired
    private ClientDAO repository;
    private Service service;
    @GetMapping("/about_user")
    public  String home(Model model){
        Iterable<Client> clients = repository.findAll();
        List<Client> clients1 = new ArrayList<>();


        //model.addAttribute("Client", clients);
        //clients1 = service.findAllClients();
        clients.forEach(clients1::add);
        model.addAttribute("Client", clients1);
        return "about_user";
    }

    @GetMapping("/home")
    public  String get(Model model){
        return "home";
    }
}
