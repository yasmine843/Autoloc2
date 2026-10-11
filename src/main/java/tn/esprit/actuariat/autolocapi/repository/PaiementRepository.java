package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Paiement;

public interface PaiementRepository
        extends JpaRepository<Paiement, Long> {
}