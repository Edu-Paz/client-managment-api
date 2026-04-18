package com.devsuperior.client_managment_api.repositories;

import com.devsuperior.client_managment_api.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
