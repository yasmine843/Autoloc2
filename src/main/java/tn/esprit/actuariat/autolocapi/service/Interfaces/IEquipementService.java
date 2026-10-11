package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Equipement;

import java.util.List;
import java.util.Optional;

public interface IEquipementService {

    Equipement save(Equipement equipement);

    List<Equipement> findAll();

    Optional<Equipement> findById(Long id);

    void deleteById(Long id);
}