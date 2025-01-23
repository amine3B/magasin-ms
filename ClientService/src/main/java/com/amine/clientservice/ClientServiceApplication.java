package com.amine.clientservice;

import com.amine.clientservice.entity.Client;
import com.amine.clientservice.repisotory.ClientRepisotory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepisotory clientRepisotory) {
        return args -> {
            Client client = Client.builder()
                    .name("amine")
                    .address("casablanca")
                    .build();
            clientRepisotory.save(client);
        };
    }


}
