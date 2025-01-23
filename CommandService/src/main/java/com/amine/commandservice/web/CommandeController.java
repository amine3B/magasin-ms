package com.amine.commandservice.web;

import com.amine.commandservice.web.ClientOpenFeing;

import com.amine.commandservice.entity.Commande;
import com.amine.commandservice.modele.Client;
import com.amine.commandservice.modele.Produit;
import com.amine.commandservice.repisotory.CommandRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CommandeController {


    public CommandeController(CommandRepository commandRepository,
                              ClientOpenFeing clientOpenFeing,
                              ProduitOpenFeing produitOpenFeing) {
        this.commandeRepositoriy = commandRepository;
        this.clientOpenFeing = clientOpenFeing;
        this.produitOpenFeing = produitOpenFeing;
    }
    CommandRepository commandeRepositoriy;
    ClientOpenFeing clientOpenFeing;
    ProduitOpenFeing produitOpenFeing;
    @GetMapping("/commandes")
    public List<Commande> allCommandes(){
        List<Commande> commandes = commandeRepositoriy.findAll();
        for (Commande c: commandes){
            Produit p = produitOpenFeing.findById(c.getIdProduit());
            c.setProduit(p);
            Client cl = clientOpenFeing.findById(Math.toIntExact(c.getIdClient()));
            c.setClient(cl);

        }
        return commandes;


    }

    @GetMapping("/commandes/{id}")
    public Commande Commandes(@PathVariable Long id){

        Commande cm = commandeRepositoriy.findById(id).get();

        Client cl= clientOpenFeing.findById(Math.toIntExact(cm.getIdClient()));
        cm.setClient(cl);

        Produit p = produitOpenFeing.findById(cm.getIdProduit());
        cm.setProduit(p);

        return cm;
    }
}