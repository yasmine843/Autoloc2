package tn.esprit.actuariat.autolocapi.service.Interfaces;


import tn.esprit.actuariat.autolocapi.domain.Employe;

import java.util.List;
import java.util.Optional;

public interface IEmployeService {

    Employe save(Employe employe);

    List<Employe> findAll();

    Optional<Employe> findById(Long id);

    void deleteById(Long id);
}