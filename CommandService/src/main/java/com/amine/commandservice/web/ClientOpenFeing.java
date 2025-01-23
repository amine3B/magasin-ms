package com.amine.commandservice.web;

import com.amine.commandservice.modele.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@Component
@FeignClient(name="ClientService" , url = "http://localhost:9090")
public interface ClientOpenFeing{
    @GetMapping("/clients")
    public List<Client> findAll();

    @GetMapping("/clients/{id}")
    public Client findById(@PathVariable int id);
}