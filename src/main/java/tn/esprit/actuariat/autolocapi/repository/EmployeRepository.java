package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Employe;

public interface EmployeRepository
        extends JpaRepository<Employe, Long> {
}
