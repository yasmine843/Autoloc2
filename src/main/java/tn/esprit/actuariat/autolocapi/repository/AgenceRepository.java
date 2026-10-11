package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
