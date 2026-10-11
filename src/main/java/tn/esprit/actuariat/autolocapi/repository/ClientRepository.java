package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Client;

public interface ClientRepository
        extends JpaRepository<Client, Long> {
}