package com.amine.produitservice.repisotory;

import com.amine.produitservice.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
