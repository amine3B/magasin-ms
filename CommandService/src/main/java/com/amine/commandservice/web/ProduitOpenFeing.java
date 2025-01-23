package com.amine.commandservice.web;

import com.amine.commandservice.modele.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@Component
@FeignClient(name="ProduitService", url = "http://localhost:19090")
public interface ProduitOpenFeing{

    @GetMapping("/produits")
    public List<Produit> findAll();

    @GetMapping("/produits/{id}")
    public Produit findById(@PathVariable Long id);
}