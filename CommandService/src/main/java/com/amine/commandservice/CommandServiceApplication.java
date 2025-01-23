package com.amine.commandservice;

import com.amine.commandservice.entity.Commande;
import com.amine.commandservice.repisotory.CommandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@EnableFeignClients
@SpringBootApplication
public class CommandServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CommandRepository commandRepository) {
        return args -> {
            Commande commande = Commande.builder()
                    .Qt("23")
                    .idProduit(1L)
                    .idClient(1L)
                    .build();
            commandRepository.save(commande);
            Commande commande1 = Commande.builder()
                    .Qt("23")
                    .idProduit(2L)
                    .idClient(1L)
                    .build();
            commandRepository.save(commande1);
            Commande commande3 = Commande.builder()
                    .Qt("23")
                    .idProduit(3L)
                    .idClient(1L)
                    .build();
            commandRepository.save(commande3);
        };
    }
}

