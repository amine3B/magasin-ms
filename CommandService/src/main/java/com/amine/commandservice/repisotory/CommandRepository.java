package com.amine.commandservice.repisotory;

import com.amine.commandservice.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository< Commande , Long > {
}
