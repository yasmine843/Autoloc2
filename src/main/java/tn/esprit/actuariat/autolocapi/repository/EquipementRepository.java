package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Equipement;

public interface EquipementRepository
        extends JpaRepository<Equipement, Long> {
}