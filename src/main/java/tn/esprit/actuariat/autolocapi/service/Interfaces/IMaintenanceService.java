package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Maintenance;

import java.util.List;
import java.util.Optional;

public interface IMaintenanceService {

    Maintenance save(Maintenance maintenance);

    List<Maintenance> findAll();

    Optional<Maintenance> findById(Long id);

    void deleteById(Long id);
}
