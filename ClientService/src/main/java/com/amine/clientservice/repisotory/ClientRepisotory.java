package com.amine.clientservice.repisotory;

import com.amine.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.Remote;

public interface ClientRepisotory extends JpaRepository<Client, Long> {
}
