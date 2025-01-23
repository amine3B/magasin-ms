package com.amine.commandservice.modele;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Produit {
    private Long idProduit;
    private String nom;
    private double prix;
    private int quantite;
}
