package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Vehicule;

import java.util.List;
import java.util.Optional;

public interface IVehiculeService {

    Vehicule save(Vehicule vehicule);

    List<Vehicule> findAll();

    Optional<Vehicule> findById(Long id);

    void deleteById(Long id);
}