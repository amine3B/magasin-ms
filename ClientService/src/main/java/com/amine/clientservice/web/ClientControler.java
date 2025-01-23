package com.amine.clientservice.web;

import com.amine.clientservice.entity.Client;
import com.amine.clientservice.repisotory.ClientRepisotory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientControler {
    private final ClientRepisotory clientRepisotory;
    public ClientControler( ClientRepisotory clientRepisotory ) {
        this.clientRepisotory = clientRepisotory;
    }
    @GetMapping("/clients")
    public List<Client> getClients() {

        return clientRepisotory.findAll();
    }
    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable long id) {
        return clientRepisotory.findById(id).get();
    }
    @PostMapping("/clients")
    public void addClient(@RequestBody Client client) {
        clientRepisotory.save(client);
    }
}
