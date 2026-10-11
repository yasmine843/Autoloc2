package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Paiement;

import java.util.List;
import java.util.Optional;

public interface IPaiementService {

    Paiement save(Paiement paiement);

    List<Paiement> findAll();

    Optional<Paiement> findById(Long id);

    void deleteById(Long id);
}