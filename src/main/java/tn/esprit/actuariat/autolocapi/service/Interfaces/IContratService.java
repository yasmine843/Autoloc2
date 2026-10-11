package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Contrat;

import java.util.List;
import java.util.Optional;

public interface IContratService {

    Contrat save(Contrat contrat);

    List<Contrat> findAll();

    Optional<Contrat> findById(Long id);

    void deleteById(Long id);
}
