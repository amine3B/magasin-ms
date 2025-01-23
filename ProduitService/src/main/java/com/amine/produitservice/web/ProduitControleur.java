package com.amine.produitservice.web;

import com.amine.produitservice.repisotory.ProduitRepository;
import com.amine.produitservice.entity.Produit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitControleur {
    private final ProduitRepository produitRepository;

    public ProduitControleur(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @GetMapping("/produits")
    public List<Produit> allProduits() {
        return produitRepository.findAll();
    }

    @GetMapping("/produits/{id}")
    public Produit aProduit(@PathVariable Long id) {
        return produitRepository.findById(id).orElse(null);
    }
}
