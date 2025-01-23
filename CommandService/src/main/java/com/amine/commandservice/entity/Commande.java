package com.amine.commandservice.entity;

import com.amine.commandservice.modele.Client;
import com.amine.commandservice.modele.Produit;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Commande {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Qt;
    private Long idProduit;
    @Transient
    private Produit produit;
    private Long idClient;
    @Transient
    private Client client;
}
