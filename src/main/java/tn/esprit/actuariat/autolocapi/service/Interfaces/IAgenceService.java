package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Agence;

import java.util.List;
import java.util.Optional;

public interface IAgenceService {

    Agence save(Agence agence);

    List<Agence> findAll();

    Optional<Agence> findById(Long id);

    void deleteById(Long id);
}
