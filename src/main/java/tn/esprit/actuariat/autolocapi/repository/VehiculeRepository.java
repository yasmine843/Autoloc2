package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{
}
