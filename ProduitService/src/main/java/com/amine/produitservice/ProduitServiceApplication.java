package com.amine.produitservice;

import com.amine.produitservice.entity.Produit;
import com.amine.produitservice.repisotory.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProduitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProduitRepository produitRepository) {
        return args -> {
            Produit produit = Produit.builder()
                    .nom("t")
                    .prix(12.8)
                    .quantite(32)
                    .build();
            produitRepository.save(produit);

            Produit produit1 = Produit.builder()
                    .nom("t")
                    .prix(12.8)
                    .quantite(32)
                    .build();
            produitRepository.save(produit1);
            Produit produit2 = Produit.builder()
                    .nom("t")
                    .prix(12.8)
                    .quantite(32)
                    .build();
            produitRepository.save(produit2);
        };
    }
}